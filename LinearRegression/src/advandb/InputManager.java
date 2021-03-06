/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * InputManager.java
 *
 * Created on Aug 7, 2009, 10:19:20 PM
 */

package advandb;

import com.mysql.jdbc.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Arturo III
 */
public class InputManager extends javax.swing.JFrame {

    /** Creates new form InputManager */
    LinearRegressionFrame f;
    boolean isActive = true;
    String X_Value;
    String Y_Value;
    ResultSet rs;

    int selected_index_1;
    int selected_index_2;

    public boolean getStatus()
    {
        return isActive();
    }

    public InputManager(ResultSet rs,LinearRegressionFrame f) {
        super ("Input Manager");
        this.rs = rs;
        this.f = f;
        initComponents();
        populateIndexes();
    }

    public void populateIndexes()
    {
        try {
            ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
            int numColumns = rsmd.getColumnCount();
            System.out.println(""+numColumns);
            String names[] = new String[numColumns+1];
            for (int i = 1;i <= numColumns;i++)
            {
                names[i] = rsmd.getColumnName(i);
                System.out.println(names[i]);
            }
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(names));
            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(names));
        } catch (SQLException ex) {
            Logger.getLogger(InputManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private InputManager() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Training Data (X)");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Values to predict (Y)");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton1.setText("Okay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        String output = (String) jComboBox2.getSelectedItem();
        Y_Value = output;
        selected_index_2 = jComboBox2.getSelectedIndex();
        System.out.println(output);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String output = (String) jComboBox1.getSelectedItem();
        X_Value = output;
        selected_index_1 = jComboBox1.getSelectedIndex();
        System.out.println(output);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try
        {
            ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
            if (X_Value == null || Y_Value == null)
            {
                JOptionPane.showMessageDialog(this,
                "ERROR: PLEASE SELECT A FIELD FOR BOTH",
                "No choice selected",
                JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                String type1 = rsmd.getColumnTypeName(selected_index_1);
                String type2 = rsmd.getColumnTypeName(selected_index_2);
                System.out.println("X Value = "+type1);
                System.out.println("Y Value = "+type2);
                if (type1.equals("FLOAT") == false && type1.equals("INT") == false && type1.equals("DOUBLE") == false)
                {
                        JOptionPane.showMessageDialog(this,
                        "ERROR: PLEASE SELECT A VALID FIELD",
                        "Selected column X is non-numerical",
                        JOptionPane.ERROR_MESSAGE);
                }
                else if (type2.equals("FLOAT") == false && type2.equals("INT") == false && type2.equals("DOUBLE") == false)
                {
                        JOptionPane.showMessageDialog(this,
                        "ERROR: PLEASE SELECT A VALID FIELD",
                        "Selected column Y is non-numerical",
                        JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    new InputManipulator(f,X_Value,Y_Value);
                    this.dispose();
                }
            }
        }
        catch (Exception E)
        {
            E.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        f.disable();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
