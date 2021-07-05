/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import static Frames.LedgerAccounts.rev;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static org.apache.commons.math3.fitting.leastsquares.LeastSquaresFactory.model;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Kinshuk
 */
public class Vouchers extends javax.swing.JFrame {

    /**
     * Creates new form Vouchers
     */
    public Vouchers() {
        initComponents();
        jComboBox1.setSelectedItem("");
        jComboBox3.setSelectedItem("");
        jLabel3.setForeground(new java.awt.Color(187, 187, 187));
        String username = new Login().user;
        jLabel1.setVisible(false);
        jTextField1.setVisible(false);
        try {

            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jvp", "root", "bhulgaya123");
            System.out.println("Connection is created successfully");
            Statement stmt = (Statement) con.createStatement();
            String query = "select acc_name from accounts where username = '" + username + "'";
            System.out.println("Fetching items from database: jvp; table: transactions");
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("Record fetched successfully.");

            for (;;) {
                if (rs.next()) {
                    String item = rs.getString(1);
                    jComboBox1.addItem(item);
                } else {
                    break;
                }
            }

            jComboBox1.setSelectedItem("");
            AutoCompleteDecorator.decorate(jComboBox1);

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Stocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        jComboBox3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {

                Object selected = jComboBox3.getSelectedItem();
                if (selected.toString().equals("Cheque")) {
                    jLabel1.setVisible(true);
                    jTextField1.setVisible(true);
                } else if (selected.toString().equals("Cash")) {
                    jLabel1.setVisible(false);
                    jTextField1.setVisible(false);
                }

            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        panel1 = new java.awt.Panel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(23, 35, 51));

        jLabel3.setText("Voucher");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addContainerGap(786, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jComboBox1.setSelectedItem("Select Bill Number");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        panel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 64, 300, -1));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Exit");
        jLabel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        panel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, 110, 32));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill_no", "Date", "Debit", "Credit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        panel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 137, 833, 190));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Refresh");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 60, 114, 31));

        jComboBox2.setSelectedItem("Select Bill to Clear");
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        panel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 200, -1));
        panel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 108, -1));

        jLabel1.setText("Enter Cheque Number :");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        jLabel4.setText("Amount :");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));
        panel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 108, -1));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Generate Bill");
        jLabel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        panel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 140, 32));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Cheque" }));
        jComboBox3.setSelectedItem("Select Payment Type");
        jComboBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox3MouseClicked(evt);
            }
        });
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        panel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 200, -1));
        panel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 850, 10));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        this.setVisible(false);
        try {
            new Main().setVisible(true);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Vouchers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        jComboBox2.removeAllItems();
        String acc = (String) jComboBox1.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int row = model.getRowCount();
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        row = 0;
        String username = new Login().user;
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jvp", "root", "bhulgaya123");
            System.out.println("Connection is created successfully");
            Statement stmt = (Statement) con.createStatement();
            String query = "select DISTINCT bill_no from bill WHERE status='" + "pending" + "' and acc_name='"+acc+"' and username='"+username+"'";
            System.out.println("Fetching records from database: jvp, table: bill");
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("Records fetched successfully.");

            for (;;) {
                if (rs.next()) {
                    String bill_no = rs.getString("bill_no");
                    String query1 = "select * from transactions WHERE bill_no='" + bill_no + "'";
                    Statement stmt1 = (Statement) con.createStatement();
                    System.out.println("Fetching records from database: jvp, table: transactions");
                    ResultSet rs1 = stmt1.executeQuery(query1);
                    System.out.println("Records fetched successfully.");

                    for (;;) {
                        if (rs1.next()) {
                            Date date = rs1.getDate("date");
                            float debit = rs1.getFloat("debit");
                            float credit = rs1.getFloat("credit");
                            row++;
                            jComboBox2.addItem(bill_no);
                            model.addRow(new Object[]{bill_no, date, debit, credit});
                        } else {
                            break;
                        }
                    }

                } else {
                    break;
                }
            }

            jComboBox2.setSelectedItem("");
            AutoCompleteDecorator.decorate(jComboBox2);

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Vouchers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vouchers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String current_date = formatter.format(date);
        String username = new Login().user;
        String bill_no = (String) jComboBox2.getSelectedItem();
        String acc_name = (String) jComboBox1.getSelectedItem();
        String type="";
        int cheque_number = 0;
        float amount = Float.parseFloat(jTextField2.getText());
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/jvp", "root", "bhulgaya123");
            Statement stmt = (Statement) con.createStatement();

            String query = "select type from bill where username = '" + username + "' and bill_no='"+bill_no+"' ";
            System.out.println("Fetching items from database: jvp; table: transactions");
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("Record fetched successfully.");

            for (;;) {
                if (rs.next()) {
                    type = rs.getString(1);
                    
                } else {
                    break;
                }
            }

            if(type.equals("sale"))
            {    
                query = "INSERT INTO transactions VALUES('" + bill_no + "','" + current_date + "','" + 0 + "','" + amount + "','" + acc_name + "','" + username + "');";
                stmt.executeUpdate(query);
                System.out.println("Adding records in database: jvp,table: bill");
                if (jComboBox3.getSelectedItem() == "Cheque") {
                    cheque_number = Integer.parseInt(jTextField1.getText());
                    query = "INSERT INTO voucher VALUES('" + bill_no + "','" + current_date + "','" + "Cheque" + "','" + amount + "','" + "sale" + "','" + username + "','" + cheque_number + "');";
                    stmt.executeUpdate(query);
                    System.out.println("Clearing bill with Cheque in database: jvp,table: voucher");
                } else if (jComboBox3.getSelectedItem() == "Cash") {
                    query = "INSERT INTO voucher VALUES('" + bill_no + "','" + current_date + "','" + "Cash" + "','" + amount + "','" + "sale" + "','" + username + "','" + cheque_number + "');";
                    stmt.executeUpdate(query);
                    System.out.println("Clearing bill with Cash in database: jvp,table: voucher");
                }
                query = "UPDATE bill SET status='" + "cleared" + "' where bill_no= '" + bill_no + "';";
                stmt.executeUpdate(query);
                System.out.println("Clearing bill in database: jvp,table: bill");
            }
                if(type.equals("purchase"))
            {    
                query = "INSERT INTO transactions VALUES('" + bill_no + "','" + current_date + "','" + amount + "','" + 0 + "','" + acc_name + "','" + username + "');";
                stmt.executeUpdate(query);
                System.out.println("Adding records in database: jvp,table: bill");
                if (jComboBox3.getSelectedItem() == "Cheque") {
                    cheque_number = Integer.parseInt(jTextField1.getText());
                    query = "INSERT INTO voucher VALUES('" + bill_no + "','" + current_date + "','" + "Cheque" + "','" + amount + "','" + "purchase" + "','" + username + "','" + cheque_number + "');";
                    stmt.executeUpdate(query);
                    System.out.println("Clearing bill with Cheque in database: jvp,table: voucher");
                } 
            }
            
            
            JOptionPane.showMessageDialog(this, "Bill Cleared");
            this.setVisible(false);
            new Main().setVisible(true);

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vouchers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Vouchers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jComboBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox3MouseClicked
        // TODO add your handling code here:

        if (jComboBox3.getSelectedItem() == "Cheque") {
            jLabel1.setVisible(true);
            jTextField1.setVisible(true);
        } else if (jComboBox3.getSelectedItem() == "Cash") {
            jLabel1.setVisible(false);
            jTextField1.setVisible(false);
        }

    }//GEN-LAST:event_jComboBox3MouseClicked

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
            java.util.logging.Logger.getLogger(Vouchers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vouchers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vouchers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vouchers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vouchers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
