package javaapplication13;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class welcome extends javax.swing.JFrame {

    /**
     * Creates new form welcome
     */
    public welcome() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Matura MT Script Capitals", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Welcome to Wadi Degla ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 490, 100);

        jButton1.setBackground(new java.awt.Color(251, 228, 251));
        jButton1.setFont(new java.awt.Font("Ravie", 3, 14)); // NOI18N
        jButton1.setText("Admin");
        jPanel1.add(jButton1);
        jButton1.setBounds(510, 40, 158, 52);

        jButton2.setBackground(new java.awt.Color(251, 228, 251));
        jButton2.setFont(new java.awt.Font("Ravie", 3, 14)); // NOI18N
        jButton2.setText("staff");
        jPanel1.add(jButton2);
        jButton2.setBounds(510, 260, 158, 53);

        jButton3.setBackground(new java.awt.Color(251, 228, 251));
        jButton3.setFont(new java.awt.Font("Ravie", 3, 14)); // NOI18N
        jButton3.setText("member");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(510, 150, 158, 55);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("with family and friends, jogging,running,football ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 180, 349, 26);

        jLabel4.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("even reading it need taking care of a little more  ....");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 230, 378, 26);

        jLabel5.setForeground(new java.awt.Color(255, 102, 255));
        jLabel5.setText("______________________________________________________________");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 110, 450, 14);

        jLabel2.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Great place for gathering and doing many various activities");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 140, 436, 26);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication13/abstract-simple-blue-texture-lines-background-meta-hd-wallpaper.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 700, 380);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 1, 700, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         hello frame1 = new hello ();
        frame1.setLocation(400,150);
        frame1.setSize(550, 300);
frame1.setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
