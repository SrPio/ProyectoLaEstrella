/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrella;

import static estrella.GuiConsulProd.PanelConsulPro;
import static estrella.GuiModiProducto.PanelModiProduct;
import static estrella.GUI_RegisProducto.PanelRegisPro;
import static estrella.GUI_RepoCostos.PanelRepoCostos;
import java.awt.BorderLayout;

/**
 *
 * @author Andres
 */
public class GUI_Reportes extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Producto
     */
    public GUI_Reportes() {
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

        PanelReportes = new javax.swing.JPanel();
        BotonReporteCostos = new javax.swing.JButton();
        BotonReporteVentas = new javax.swing.JButton();
        BotonReporteProdMasVend = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        LineaDivisora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelReportes.setBackground(new java.awt.Color(248, 248, 248));
        PanelReportes.setPreferredSize(new java.awt.Dimension(1050, 600));

        BotonReporteCostos.setBackground(new java.awt.Color(248, 248, 248));
        BotonReporteCostos.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        BotonReporteCostos.setForeground(new java.awt.Color(255, 255, 255));
        BotonReporteCostos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BotonM001.png"))); // NOI18N
        BotonReporteCostos.setText("Reporte de Costos");
        BotonReporteCostos.setBorderPainted(false);
        BotonReporteCostos.setContentAreaFilled(false);
        BotonReporteCostos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonReporteCostos.setFocusPainted(false);
        BotonReporteCostos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonReporteCostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReporteCostosActionPerformed(evt);
            }
        });

        BotonReporteVentas.setBackground(new java.awt.Color(248, 248, 248));
        BotonReporteVentas.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        BotonReporteVentas.setForeground(new java.awt.Color(255, 255, 255));
        BotonReporteVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BotonM002.png"))); // NOI18N
        BotonReporteVentas.setText("Reporte de Ventas");
        BotonReporteVentas.setBorderPainted(false);
        BotonReporteVentas.setContentAreaFilled(false);
        BotonReporteVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonReporteVentas.setFocusPainted(false);
        BotonReporteVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonReporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReporteVentasActionPerformed(evt);
            }
        });

        BotonReporteProdMasVend.setBackground(new java.awt.Color(248, 248, 248));
        BotonReporteProdMasVend.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        BotonReporteProdMasVend.setForeground(new java.awt.Color(255, 255, 255));
        BotonReporteProdMasVend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BotonM003.png"))); // NOI18N
        BotonReporteProdMasVend.setText("Reporte Productos más Vendidos");
        BotonReporteProdMasVend.setBorderPainted(false);
        BotonReporteProdMasVend.setContentAreaFilled(false);
        BotonReporteProdMasVend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonReporteProdMasVend.setFocusPainted(false);
        BotonReporteProdMasVend.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonReporteProdMasVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReporteProdMasVendActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 30)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Reportes");

        LineaDivisora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Linea001.png"))); // NOI18N

        javax.swing.GroupLayout PanelReportesLayout = new javax.swing.GroupLayout(PanelReportes);
        PanelReportes.setLayout(PanelReportesLayout);
        PanelReportesLayout.setHorizontalGroup(
            PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReportesLayout.createSequentialGroup()
                .addGroup(PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelReportesLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LineaDivisora, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Titulo)))
                    .addGroup(PanelReportesLayout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addGroup(PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonReporteCostos, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonReporteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonReporteProdMasVend, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(90, 90, 90))
        );
        PanelReportesLayout.setVerticalGroup(
            PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReportesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelReportesLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(LineaDivisora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Titulo))
                .addGap(52, 52, 52)
                .addComponent(BotonReporteCostos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonReporteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonReporteProdMasVend, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonReporteCostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReporteCostosActionPerformed

        GUI_RepoCostos ventanaRepoCostos = new GUI_RepoCostos();
        ventanaRepoCostos.setSize(1050, 600);
        ventanaRepoCostos.setLocation(0,0);

        PanelReportes.removeAll();
        PanelReportes.add(PanelRepoCostos, BorderLayout.CENTER);
        PanelReportes.revalidate();
        PanelReportes.repaint();
    }//GEN-LAST:event_BotonReporteCostosActionPerformed

    private void BotonReporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReporteVentasActionPerformed

       
    }//GEN-LAST:event_BotonReporteVentasActionPerformed

    private void BotonReporteProdMasVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReporteProdMasVendActionPerformed

   
    }//GEN-LAST:event_BotonReporteProdMasVendActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        GUI_Reportes ventanaReportes = new GUI_Reportes();
        ventanaReportes.setBounds(0, 0, 1050, 600);
        ventanaReportes.setVisible(true);
        ventanaReportes.setResizable(false);
        ventanaReportes.setLocationRelativeTo(null);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new GUI_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonReporteCostos;
    private javax.swing.JButton BotonReporteProdMasVend;
    private javax.swing.JButton BotonReporteVentas;
    private javax.swing.JLabel LineaDivisora;
    public static javax.swing.JPanel PanelReportes;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
