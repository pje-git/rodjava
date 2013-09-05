/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.pje.jprogs.rod;

import pl.pje.jprogs.energia.EnergiaForm;
import javax.swing.SwingUtilities;

/**
 *******[ PJE Pawel Jacon ]*******************************[ +48 695758801 ]***
 * * Utworzono dnia : * Ostatnia modyfikacja :
 *
 *
 * @author Paweł Jacoń <pawel@pje.pl pje.pl> * * **************[ Piotra Skargi
 * 83E ]---[ Pabianice, Polska ]*****************
 */
public class RodStart {

    public static void main(String[] args) {
        try {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    EnergiaForm energiaForm = new EnergiaForm(200, 200, 600, 400, "ROD Trzy Korony 2013 - Energia");
                    energiaForm.setVisible(true);
//                    SektorAdd sektorAddForm = new SektorAdd();
//                    sektorAddForm.setVisible(true);
                }
            });
        } catch (Exception ex) {
            System.out.println("Wystąpił wyjątek: " + ex.getStackTrace());
        }
    }
}
