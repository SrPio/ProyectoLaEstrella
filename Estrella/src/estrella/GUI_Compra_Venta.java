/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrella;

import static estrella.GuiRegisCliente.PanelRegisClient;
import static estrella.GuiRegisCompra.PanelRegisComp;
import java.awt.BorderLayout;
import static estrella.GUI_RegisVentaFiado.PanelRegisVentFia;

/**
 *
 * @author Andres
 */
public class GUI_Compra_Venta extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Producto
     */
    public GUI_Compra_Venta() {
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

        PanelCompraVenta = new javax.swing.JPanel();
        BotonRegisCompra = new javax.swing.JButton();
        BotonRegisVenta = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        LineaDivisora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelCompraVenta.setBackground(new java.awt.Color(248, 248, 248));
        PanelCompraVenta.setPreferredSize(new java.awt.Dimension(1050, 600));

        BotonRegisCompra.setBackground(new java.awt.Color(248, 248, 248));
        BotonRegisCompra.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        BotonRegisCompra.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegisCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BotonM001.png"))); // NOI18N
        BotonRegisCompra.setText("Registar Compra");
        BotonRegisCompra.setBorderPainted(false);
        BotonRegisCompra.setContentAreaFilled(false);
        BotonRegisCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegisCompra.setFocusPainted(false);
        BotonRegisCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonRegisCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegisCompraActionPerformed(evt);
            }
        });

        BotonRegisVenta.setBackground(new java.awt.Color(248, 248, 248));
        BotonRegisVenta.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        BotonRegisVenta.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegisVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BotonM002.png"))); // NOI18N
        BotonRegisVenta.setText("Registrar Venta");
        BotonRegisVenta.setBorderPainted(false);
        BotonRegisVenta.setContentAreaFilled(false);
        BotonRegisVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegisVenta.setFocusPainted(false);
        BotonRegisVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonRegisVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegisVentaActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 30)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Compra o Venta");

        LineaDivisora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Linea001.png"))); // NOI18N

        javax.swing.GroupLayout PanelCompraVentaLayout = new javax.swing.GroupLayout(PanelCompraVenta);
        PanelCompraVenta.setLayout(PanelCompraVentaLayout);
        PanelCompraVentaLayout.setHorizontalGroup(
            PanelCompraVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCompraVentaLayout.createSequentialGroup()
                .addGroup(PanelCompraVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCompraVentaLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(PanelCompraVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LineaDivisora, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Titulo)))
                    .addGroup(PanelCompraVentaLayout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addGroup(PanelCompraVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonRegisCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonRegisVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(90, 90, 90))
        );
        PanelCompraVentaLayout.setVerticalGroup(
            PanelCompraVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCompraVentaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelCompraVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCompraVentaLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(LineaDivisora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Titulo))
                .addGap(95, 95, 95)
                .addComponent(BotonRegisCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BotonRegisVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCompraVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelCompraVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegisCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegisCompraActionPerformed

        GuiRegisCompra ventanaRegisCompra = new GuiRegisCompra();
        ventanaRegisCompra.setSize(1050, 600);
        ventanaRegisCompra.setLocation(0,0);

        PanelCompraVenta.removeAll();
        PanelCompraVenta.add(PanelRegisComp, BorderLayout.CENTER);
        PanelCompraVenta.revalidate();
        PanelCompraVenta.repaint();
    }//GEN-LAST:event_BotonRegisCompraActionPerformed

    private void BotonRegisVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegisVentaActionPerformed

        GUI_RegisVentaFiado ventanaRegisVenta = new GUI_RegisVentaFiado();
        ventanaRegisVenta.setSize(1050, 600);
        ventanaRegisVenta.setLocation(0,0);

        PanelCompraVenta.removeAll();
        PanelCompraVenta.add(PanelRegisVentFia, BorderLayout.CENTER);
        PanelCompraVenta.revalidate();
        PanelCompraVenta.repaint();
    }//GEN-LAST:event_BotonRegisVentaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        GUI_Compra_Venta ventanaCompraVenta = new GUI_Compra_Venta();
        ventanaCompraVenta.setBounds(0, 0, 1050, 600);
        ventanaCompraVenta.setVisible(true);
        ventanaCompraVenta.setResizable(false);
        ventanaCompraVenta.setLocationRelativeTo(null);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new GUI_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegisCompra;
    private javax.swing.JButton BotonRegisVenta;
    private javax.swing.JLabel LineaDivisora;
    public static javax.swing.JPanel PanelCompraVenta;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
