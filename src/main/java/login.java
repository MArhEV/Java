/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marth
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        background = new javax.swing.JPanel();
        rightpanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        login_button = new javax.swing.JLabel();
        register = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(87, 87, 87));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rightpanel.setBackground(new java.awt.Color(87, 87, 87));
        rightpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        rightpanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 282, 390, 10));

        jTextField2.setBackground(new java.awt.Color(138, 138, 138));
        jTextField2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Enter Username");
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        rightpanel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 300, 40));

        jPasswordField1.setForeground(new java.awt.Color(240, 240, 240));
        jPasswordField1.setText("Enter Password");
        jPasswordField1.setBorder(null);
        jPasswordField1.setCaretColor(new java.awt.Color(240, 240, 240));
        jPasswordField1.setOpaque(false);
        rightpanel.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 340, 40));
        rightpanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 392, 390, 10));

        login_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_button.png"))); // NOI18N
        login_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_buttonMouseClicked(evt);
            }
        });
        rightpanel.add(login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        register.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        register.setText("Not a user? Reister now!");
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });
        rightpanel.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 150, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paliveo_v1.png"))); // NOI18N
        rightpanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        password.setForeground(new java.awt.Color(240, 240, 240));
        password.setText("Password:");
        rightpanel.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        username.setForeground(new java.awt.Color(240, 240, 240));
        username.setText("Username:");
        rightpanel.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close_blue.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        rightpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Error messages");
        rightpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 390, -1));

        background.add(rightpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 790, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void login_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_buttonMouseClicked
        // JAK KLIKNIESZ NA LOGIN TO WENO COS ZROB
        new index().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_login_buttonMouseClicked

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
        new register().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_registerMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel login_button;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel password;
    private javax.swing.JLabel register;
    private javax.swing.JPanel rightpanel;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
