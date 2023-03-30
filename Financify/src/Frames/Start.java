/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import AppPackage.AnimationClass;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author kanavarora
 */



public class Start extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    class LbBlink implements ActionListener {

            private javax.swing.JLabel label;
            private java.awt.Color cor1 = java.awt.Color.red;
            private java.awt.Color cor2 = java.awt.Color.gray;
            private int count;

            public LbBlink(javax.swing.JLabel label) {
                this.label = label;
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                if (count % 2 == 0) {
                    label.setForeground(cor1);
                } else {
                    label.setForeground(cor2);
                }
                count++;
            }
        }
    
    public Start() {
        initComponents();
        jLabel2.setVisible(true);
        AnimationClass anim = new AnimationClass();
        anim.jLabelXLeft(jOrange.getX(), -1000, 2, 1, jOrange);
        anim.jLabelXRight(jPink.getX(), 1000, 4, 1, jPink);
        anim.jLabelYDown(jBlue.getY(), 1000, 4, 1, jBlue);
        anim.jLabelYDown(jYellow.getY(), 1000, 2, 1, jYellow);
        anim.jLabelXRight(-500, 10, 2, 1, jLabel1);
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
            @Override
            public void run() {
                jLabel2.setVisible(true);
            }
        },
                1000
        );
        
        Timer timerLB = new Timer(1000, new Start.LbBlink(jLabel2));
        timerLB.start();
        JFrame f = this;
        new java.util.Timer().schedule(
                new java.util.TimerTask() {
            @Override
            public void run() {
                timerLB.stop();
                f.setVisible(false);
                new Login().setVisible(true);
            }
        },
                5000
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jOrange = new javax.swing.JLabel();
        jPink = new javax.swing.JLabel();
        jBlue = new javax.swing.JLabel();
        jYellow = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jOrange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Path-1.png"))); // NOI18N
        jPanel1.add(jOrange, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -17, 336, 380));

        jPink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Path-2Pink.png"))); // NOI18N
        jPanel1.add(jPink, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 0, -1, 298));

        jBlue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Path-3Blue.png"))); // NOI18N
        jPanel1.add(jBlue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        jYellow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Path-4Yellow.png"))); // NOI18N
        jPanel1.add(jYellow, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 85, 280, 270));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Financify");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-500, 150, 470, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        jLabel2.setText("Indexing tables...");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 325, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBlue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jOrange;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPink;
    private javax.swing.JLabel jYellow;
    // End of variables declaration//GEN-END:variables
}