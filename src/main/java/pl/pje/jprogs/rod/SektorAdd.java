/*
 * =======================================================
 *        Wszystko mozna zmieniac i dystrybuowac.
 *       Licencja typu MKTK - moj kod, to Twoj kod 
 *   Dla przyzwoitosci mozesz zostawic namiary na mnie:
 * Pawel Jacon - pawel@pje.pl - www.pje.pl - +48 695758801 
 * =======================================================
 */
package pl.pje.jprogs.rod;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pl.pje.jprogs.rod_entity.PjrodSektor;

/**
 *
 * @author Pawel Jacon <pawel at pje.pl>
 */
public class SektorAdd extends javax.swing.JFrame {

    /**
     * Creates new form SektorAdd
     */
    public SektorAdd() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jocTrayIcon1 = new com.xzq.osc.JocTrayIcon();
        jocTableCellRenderer1 = new com.xzq.osc.JocTableCellRenderer();
        jocPaneGroup1 = new com.xzq.osc.JocPaneGroup();
        jocCoverPane1 = new com.xzq.osc.JocCoverPane();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jocLabelEditor1 = new com.xzq.osc.JocLabelEditor();
        jScrollPane1 = new javax.swing.JScrollPane();
        jocCheckedList1 = new com.xzq.osc.JocCheckedList();
        kal = new com.xzq.osc.JocGregCalendarPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextField1.setText("999");
        jTextField1.setToolTipText("");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(80, 30, 30, 20);

        jTextField2.setText("10000");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(80, 50, 40, 20);

        jLabel1.setText("Nr sektora");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 60, 20);

        jLabel2.setText("Powierzchnia");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 50, 70, 20);

        jButton1.setText("Zapisz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 335, 425, 20);

        jocLabelEditor1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jocLabelEditor1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jocLabelEditor1Layout = new javax.swing.GroupLayout(jocLabelEditor1.getEditorContainer());
        jocLabelEditor1.getEditorContainer().setLayout(jocLabelEditor1Layout);
        jocLabelEditor1Layout.setHorizontalGroup(
            jocLabelEditor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jocLabelEditor1Layout.setVerticalGroup(
            jocLabelEditor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jocLabelEditor1);
        jocLabelEditor1.setBounds(10, 190, 90, 30);

        jocCheckedList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jocCheckedList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 70, 100);

        kal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(kal);
        kal.setBounds(180, 10, 210, 177);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        PjrodSektor sr = new PjrodSektor();
        sr.setNumer( Integer.valueOf(jTextField1.getText()));
        sr.setMetraz(Integer.valueOf(jTextField2.getText()));
        
        try {
            Session hbs = HibernateUtil.getSessionFactory().openSession();
            Transaction hbt = hbs.beginTransaction();
            hbs.save(sr);
            hbt.commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jocLabelEditor1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jocLabelEditor1KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jocLabelEditor1KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SektorAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SektorAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SektorAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SektorAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SektorAdd().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private com.xzq.osc.JocCheckedList jocCheckedList1;
    private com.xzq.osc.JocCoverPane jocCoverPane1;
    private com.xzq.osc.JocLabelEditor jocLabelEditor1;
    private com.xzq.osc.JocPaneGroup jocPaneGroup1;
    private com.xzq.osc.JocTableCellRenderer jocTableCellRenderer1;
    private com.xzq.osc.JocTrayIcon jocTrayIcon1;
    private com.xzq.osc.JocGregCalendarPane kal;
    // End of variables declaration//GEN-END:variables
}
