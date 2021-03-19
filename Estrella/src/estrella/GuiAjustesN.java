/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estrella;

import static estrella.GUI_ConsulCliente.PanelConsulCliente;
import static estrella.GUI_ConsulProd.PanelConsulPro;
import static estrella.GUI_ModiCliente.PanelModifClient;
import static estrella.GUI_ModifiLoginN.PanelModifiLogNuevoo;
import static estrella.GUI_RegisCliente.PanelRegisClient;
import static estrella.GUI_RegisProducto.PanelRegisPro;

import java.awt.BorderLayout;

/**
 * Clase principal.
 **/
public class GuiAjustesN extends javax.swing.JFrame {

  /**
  * Creates new form GUIProducto.
  **/
  public GuiAjustesN() {
    initComponents();
  }

  /**
  * This method is called from within the constructor to initialize the form.
  * WARNING: Do NOT modify this code. The content of this method is always
  * regenerated by the Form Editor.
  **/
  @SuppressWarnings("unchecked")
    /**
    *  No es posible modificar las lineas de codigo dentro del metodo initComponents.
    **/
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAjustN = new javax.swing.JPanel();
        jButtonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelAjustN.setBackground(new java.awt.Color(248, 248, 248));
        PanelAjustN.setPreferredSize(new java.awt.Dimension(1050, 600));

        jButtonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonBuscar.setText("Cambiar contraseña del Login");
        jButtonBuscar.setBorderPainted(false);
        jButtonBuscar.setContentAreaFilled(false);
        jButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscar.setFocusPainted(false);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAjustNLayout = new javax.swing.GroupLayout(PanelAjustN);
        PanelAjustN.setLayout(PanelAjustNLayout);
        PanelAjustNLayout.setHorizontalGroup(
            PanelAjustNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAjustNLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButtonBuscar))
        );
        PanelAjustNLayout.setVerticalGroup(
            PanelAjustNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAjustNLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelAjustN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelAjustN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    *  No es posible modificar la linea de codigo siguiente.
    **/
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed

    GUI_ModifiLoginN ventanaModifiLoginNuevo = new GUI_ModifiLoginN();
    ventanaModifiLoginNuevo.setSize(1050, 600);
    ventanaModifiLoginNuevo.setLocation(0,0);

    PanelAjustN.removeAll();
    PanelAjustN.add(PanelModifiLogNuevoo, BorderLayout.CENTER);
    PanelAjustN.revalidate();
    PanelAjustN.repaint();
    /**
    *  No es posible modificar la linea de codigo siguiente.
    **/
    }//GEN-LAST:event_jButtonBuscarActionPerformed

  /**
  * @param args the command line arguments.
  **/
  public static void main(String args[]) {
        
    GuiAjustesN ventanaAjustN = new GuiAjustesN();
    ventanaAjustN.setBounds(0, 0, 1050, 600);
    ventanaAjustN.setVisible(true);
    ventanaAjustN.setResizable(false);
    ventanaAjustN.setLocationRelativeTo(null);
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
          //  new GUI_Producto().setVisible(true);
      }
        });
  }
    /**
    *  No es posible modificar las lineas de codigo siguientes.
    **/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel PanelAjustN;
    private javax.swing.JButton jButtonBuscar;
    // End of variables declaration//GEN-END:variables
}