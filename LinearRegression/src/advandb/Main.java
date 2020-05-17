/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package advandb;

/**
 *
 * @author Arturo III
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         final LinearRegressionFrame f = new LinearRegressionFrame();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                f.setVisible(true);
            }
        });
        // TODO code application logic here
    }

}
