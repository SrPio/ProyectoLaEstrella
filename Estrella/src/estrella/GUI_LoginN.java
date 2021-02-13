/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrella;

import static estrella.Conexion.getConection;
import static estrella.GUI_Clientes.PanelClient;
import static estrella.GUI_PanelHome.PanelCentralHome;
import static estrella.GUI_Producto.PanelProduct;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static estrella.GUI_RegisVentaFiado.PanelRegisVentFia;

/**
 *
 * @author Andres
 */
public class GUI_LoginN extends javax.swing.JFrame {

PreparedStatement ps;
    Statement sentencia;
    ResultSet rs;
    String usuario, contraseña;
    
    
    public GUI_LoginN() {
        initComponents();
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        PanelPrincipal.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        PanelCentral = new javax.swing.JPanel();
        BtnLogin = new javax.swing.JButton();
        FieldUsuario = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        ImagenHome = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(1244, 710));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(248, 248, 248));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BotonExit.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelPrincipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1165, 30, -1, -1));

        PanelCentral.setBackground(new java.awt.Color(248, 248, 248));
        PanelCentral.setPreferredSize(new java.awt.Dimension(1050, 600));
        PanelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnLogin.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        BtnLogin.setForeground(new java.awt.Color(255, 255, 255));
        BtnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Boton_Ingresar.png"))); // NOI18N
        BtnLogin.setBorderPainted(false);
        BtnLogin.setContentAreaFilled(false);
        BtnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLogin.setFocusPainted(false);
        BtnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });
        PanelCentral.add(BtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 178, 80));

        FieldUsuario.setBackground(new java.awt.Color(109, 103, 110));
        FieldUsuario.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        FieldUsuario.setForeground(new java.awt.Color(255, 255, 255));
        FieldUsuario.setBorder(null);
        FieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldUsuarioActionPerformed(evt);
            }
        });
        PanelCentral.add(FieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 220, 30));

        jPasswordField.setBackground(new java.awt.Color(109, 103, 110));
        jPasswordField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField.setAlignmentX(0.0F);
        jPasswordField.setAlignmentY(0.0F);
        jPasswordField.setBorder(null);
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });
        PanelCentral.add(jPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 230, 30));

        ImagenHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LoginFondo.png"))); // NOI18N
        PanelCentral.add(ImagenHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        PanelPrincipal.add(PanelCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 1050, 600));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FondoApp.png"))); // NOI18N
        Fondo.setPreferredSize(new java.awt.Dimension(1233, 710));
        PanelPrincipal.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldUsuarioActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed

               // TODO add your handling code here:

        Connection con = null;

        try {

            con = getConection();
            sentencia = con.createStatement();
            //ps = con.prepareStatement("SELECT * FROM Login");
            //rs = ps.executeQuery();
            rs = sentencia.executeQuery("SELECT * FROM login");
            while (rs.next()){
                usuario = rs.getString("Nombre");
                contraseña = rs.getString("Password");
                if(usuario.equals(FieldUsuario.getText()) && contraseña.equals(String.valueOf(jPasswordField.getPassword()))){

                    GUIHome ventanaHome = new GUIHome();
                    ventanaHome.setVisible(true);
                    this.dispose();
                    JOptionPane.showMessageDialog(null, "Bienvenido");

                } else {
                    JOptionPane.showMessageDialog(null, "Datos erroneos");
                }
            }

            con.close();

        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_BtnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
  /*      try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
*/
        GUI_LoginN ventanaLoginModifi = new GUI_LoginN();
        ventanaLoginModifi.setBounds(0, 0, 1244, 710);
        ventanaLoginModifi.setVisible(true);
        ventanaLoginModifi.setResizable(false);
        ventanaLoginModifi.setLocationRelativeTo(null);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new GUIHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogin;
    private javax.swing.JTextField FieldUsuario;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel ImagenHome;
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JPasswordField jPasswordField;
    // End of variables declaration//GEN-END:variables
}