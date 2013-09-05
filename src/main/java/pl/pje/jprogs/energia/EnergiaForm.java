/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.pje.jprogs.energia;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.pje.jprogs.rod.HibernateUtil;
import pl.pje.jprogs.rod_entity.PjrodDzialka;
import pl.pje.jprogs.rod_entity.PjrodDzialkowiec;
import pl.pje.jprogs.rod_entity.PjrodSektor;

/**
 *******[ PJE Pawel Jacon ]*******************************[ +48 695758801 ]***
 * * Utworzono dnia : * Ostatnia modyfikacja :
 *
 *
 * @author Paweł Jacoń <pawel@pje.pl pje.pl> * * **************[ Piotra Skargi
 * 83E ]---[ Pabianice, Polska ]*****************
 */
public class EnergiaForm  extends javax.swing.JFrame {

    private final String title = "Rozliczenie energii elektrycznej.";
    private final String tooltip = "Zmieniając układ okna nie zmienia się wzajemne położenie komponentów Swing";
    int height = 600;
    int width = 800;
    int left = 200;
    int top = 200;
    private static String QUERY_DZIALKI = "from PjrodDzialkowiec";
    private static String QUERY_DZIALKA = "from PjrodDzialka d where d.id_dzialka = :id_dzialka";
    private static String QUERY_DZIALKOWIEC = "from PjrodDzialkowiec d where d.id_dzialkowiec = :id_dzialkowiec";
    private static String QUERY_SEKTOR = "from PjrodSektor s where s.id_sektor = :id_sektor";
    private static String QUERY_DZIALKA_ALL = ""
            + "FROM"
            + "     PjrodDzialkowiec dc, PjrodDzialka da, PjrodSektor s "
            + "WHERE"
            + "     da.idSektor=s.idSektor AND"
            + "     da.idDzialka=dc.idDzialka AND"
            + "     dc.idDzialkowiec = :idDzialkowiec"
            + "";
//            + "from "
//            + " PjrodDzialkowiec dc "
//            + " PjrodDzialka da"
//            + " PjrodSektor s"
//            + "WHERE"
//            + " da.id_sektor=s.id_sektor and "
//            + " da.id_dzialkowiec=dc.id_dzialkowiec and "
//            + " id_dzialka :id";

    public EnergiaForm(int left, int top, int width, int height, String title) {

        JFrame frame = new JFrame(title);


        frame.setBounds(left, top, width, height);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = setPanelLayout();
        JPanel infoPanel = setInfoPanel();
        JPanel buttonPanel = ustawButonPanel();
        JPanel menuPanel = ustawMenu();
        JScrollPane tabAll = setTable();

        setLayout(panel, menuPanel, buttonPanel, tabAll, infoPanel, frame);

        displayResult(exeHQL_Dzialki(QUERY_DZIALKI));

    }

    private void initMenu(JMenuBar menu) {

        JMenu configMenu = new JMenu("Konfiguracja");
        JMenu pomocMenu = new JMenu("Pomoc");

        JMenuItem setModMenuItem = new JMenuItem();
        setModMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        setModMenuItem.setMnemonic('m');
        setModMenuItem.setText("Ustawienia modułu");
        configMenu.add(setModMenuItem);

        JMenuItem setRozlMenuItem = new JMenuItem();
        setRozlMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        setRozlMenuItem.setMnemonic('r');
        setRozlMenuItem.setText("Ustawienia rozliczeń");
        configMenu.add(setRozlMenuItem);

        JMenuItem setZalMenuItem = new JMenuItem();
        setZalMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        setZalMenuItem.setMnemonic('z');
        setZalMenuItem.setText("Ustawienia zaliczek");
        configMenu.add(setZalMenuItem);

        JMenuItem pomocMenuItem = new JMenuItem();
        pomocMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        pomocMenuItem.setMnemonic('o');
        pomocMenuItem.setText("Opis modułu");
        pomocMenu.add(pomocMenuItem);

        menu.add(configMenu);
        menu.add(pomocMenu);
    }

    private void initButtonsPanel(JPanel buttonPanel) {
        JButton butons[] = {
            new JButton("Faktury"),
            new JButton("Taryfy"),
            new JButton("Liczniki"),
            new JButton("Ustawienia"),
            new JButton("Rozliczenie")
        };
        for (JButton b : butons) {
            buttonPanel.add(b);

        }
    }

    private void initCentralPanel(JPanel infoPanel) {
        JPanel topInfoPanel = setPanelLayout();

        JPanel labelPanel = new JPanel();
        labelPanel.setLayout(new GridLayout(8, 1));
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(8, 1));

        topInfoPanel.add(labelPanel, BorderLayout.WEST);
        topInfoPanel.add(textPanel, BorderLayout.EAST);
        infoPanel.add(topInfoPanel, BorderLayout.NORTH);

        labelPanel.add(lNrSektora, BorderLayout.EAST);
        labelPanel.add(lNrDzialki, BorderLayout.EAST);
        labelPanel.add(lDzialkowiec, BorderLayout.EAST);
        labelPanel.add(lZuzyto, BorderLayout.EAST);
        labelPanel.add(lStanPocz, BorderLayout.EAST);
        labelPanel.add(lStanKoncowy, BorderLayout.EAST);
        labelPanel.add(lZaliczka, BorderLayout.EAST);
        labelPanel.add(lNaleznosc, BorderLayout.EAST);
        labelPanel.add(lDoZaplaty, BorderLayout.EAST);
        for (Component comp : labelPanel.getComponents()) {
            if (comp instanceof JLabel) {
                comp.setFont(new Font("Tahoma", 0, 10));

            }
        }

        textPanel.add(eNrSektora, BorderLayout.WEST);
        textPanel.add(eNrDzialki, BorderLayout.WEST);
        textPanel.add(eDzialkowiec, BorderLayout.WEST);
        textPanel.add(eZuzyto, BorderLayout.WEST);
        textPanel.add(eStanPocz, BorderLayout.WEST);
        textPanel.add(eStanKoncowy, BorderLayout.WEST);
        textPanel.add(eZaliczka, BorderLayout.WEST);
        textPanel.add(eNaleznosc, BorderLayout.WEST);
        textPanel.add(eDoZaplaty, BorderLayout.WEST);
        for (Component comp : textPanel.getComponents()) {
            if ((comp instanceof JLabel) || (comp instanceof JTextField)) {
                comp.setFont(new Font("Tahoma", 0, 10));

            };
        }


    }

    private List exeHQL_Dzialki(String hql) {
        List resultList = null;
        try {
            Session hbs = HibernateUtil.getSessionFactory().openSession();
            Transaction hbt = hbs.beginTransaction();
            Query q = hbs.createQuery(hql);
            resultList = q.list();
            hbt.commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return resultList;
    }

    private Object exeHQL_Dzialka(String hql, int idDzialkowiec) {
        Object result = new Object();
        try {
            Session hbs = HibernateUtil.getSessionFactory().openSession();
            Transaction hbt = hbs.beginTransaction();
            Query q = hbs.createQuery(hql)
                    .setInteger("idDzialkowiec", idDzialkowiec);
            result = q.uniqueResult();
            hbt.commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return result;
    }

    private void displayResult(List resultList) {
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Id");
        tableHeaders.add("Imię");
        tableHeaders.add("Nazwisko");

        for (Object o : resultList) {
            PjrodDzialkowiec d = (PjrodDzialkowiec) o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(d.getIdDzialkowiec());
            oneRow.add(d.getImie());
            oneRow.add(d.getNazwisko());
            tableData.add(oneRow);
        }
        DefaultTableModel tabMod = new DefaultTableModel(tableData, tableHeaders);
        table.setModel(tabMod);

    }

    private JPanel setPanelLayout() {
        // Panel główny
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        return panel;
    }

    private JPanel ustawButonPanel() {
        // Lewy panel przycisków
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 1));
        initButtonsPanel(buttonPanel);
        return buttonPanel;
    }

    private JPanel ustawMenu() {
        // Góra - menu
        JPopupMenu energiaPopupMenu = new JPopupMenu("Energia");
        JPanel menuPanel = setPanelLayout();
        JMenuBar menu = new JMenuBar();
        menuPanel.add(menu, BorderLayout.SOUTH);
        initMenu(menu);
        return menuPanel;
    }

    private JPanel setInfoPanel() {
        JPanel infoPanel = setPanelLayout();
        initCentralPanel(infoPanel);
        infoPanel.setBorder(BorderFactory.createLineBorder(Color.MAGENTA, 1));
        return infoPanel;
    }

    private JScrollPane setTable() {
        // Tabela działek
        table.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JScrollPane tabAll = new JScrollPane();
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                najechanie(evt);
            }

            private void najechanie(MouseEvent evt) {
                int i = table.getSelectedRow();
                pokarzDzialke((int)table.getModel().getValueAt(i, 0));
            }
        });
        tabAll.setViewportView(table);
        return tabAll;
    }

    private void pokarzDzialke(int id_dzialkowiec) {
        Object[] d = (Object[]) exeHQL_Dzialka(QUERY_DZIALKA_ALL, id_dzialkowiec);
        
            PjrodDzialkowiec dc = new PjrodDzialkowiec();
            dc = (PjrodDzialkowiec) d[0];
            PjrodDzialka da = new PjrodDzialka();
            da = (PjrodDzialka) d[1];
            PjrodSektor sr = new PjrodSektor();
            sr = (PjrodSektor) d[2];
            
        eNrDzialki.setText( da.getNumer().toString());
        eNrSektora.setText( Integer.toString(sr.getNumer()));
        eDzialkowiec.setText( dc.getNazwisko()+ " "+dc.getImie());
        eStanPocz.setText( Integer.toString(sr.getMetraz()));
//        lStanKoncowy.setText( Integer.toString(d.getMetrazSektora()));
        
        
        
    }

    private void setLayout(JPanel panel, JPanel menuPanel, JPanel buttonPanel, JScrollPane tabAll, JPanel infoPanel, JFrame frame) {
        // Końcówka
        panel.add(menuPanel, BorderLayout.NORTH);
        panel.add(buttonPanel, BorderLayout.WEST);
        panel.add(tabAll, BorderLayout.EAST);
        panel.add(infoPanel, BorderLayout.CENTER);

        frame.add(panel);
    }
    // Komponenty
    private JLabel lNrSektora = new JLabel("Nr sektora : ");
    private JLabel eNrSektora = new JLabel("Brak informacji");
    private JLabel lNrDzialki = new JLabel("Nr działki : ");
    private JLabel eNrDzialki = new JLabel("Brak informacji");
    private JLabel lDzialkowiec = new JLabel("Działkowiec : ");
    private JLabel eDzialkowiec = new JLabel("Brak informacji");
    private JLabel lZuzyto = new JLabel("Zużyto energii : ");
    private JLabel eZuzyto = new JLabel("Brak informacji");
    private JLabel lStanPocz = new JLabel("Stan początkowy licznika : ");
    private JLabel eStanPocz = new JLabel("Brak informacji");
    private JLabel lStanKoncowy = new JLabel("Stan końcowyowy licznika : ");
    private JLabel eStanKoncowy = new JLabel("Brak informacji");
    private JLabel lZaliczka = new JLabel("Wpłacona zaliczka : ");
    private JTextField eZaliczka = new JTextField("Brak informacji");
    private JLabel lNaleznosc = new JLabel("Należność za energią : ");
    private JTextField eNaleznosc = new JTextField("Brak informacji");
    private JLabel lDoZaplaty = new JLabel("Do zapłaty : ");
    private JTextField eDoZaplaty = new JTextField("Brak informacji");
    private PjrodDzialka dzialka = new PjrodDzialka();
    private final static JTable table = new JTable();
}
