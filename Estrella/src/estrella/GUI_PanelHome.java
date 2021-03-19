/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estrella;

import static estrella.GUI_Clientes.PanelClient;
import static estrella.GUI_ConsulCliente.PanelConsulCliente;
import static estrella.GuiProducto.PanelProduct;
import static estrella.GUI_RegisCliente.PanelRegisClient;
import static estrella.GUI_RegisVentaContado.PanelRegisVentContado;
import static estrella.GUI_Reportes.PanelReportes;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import static estrella.GUI_RegisVentaFiado.PanelRegisVentFia;

/**
 * @author Andres.
 **/
public class GUI_PanelHome extends javax.swing.JFrame {

    
  //Iconos Selected
  ImageIcon iconobtn = new ImageIcon("src/Images/BtnHomeSele.png");
  ImageIcon iconobtn2 = new ImageIcon("src/Images/BtnClienSele.png");
  ImageIcon iconobtn3 = new ImageIcon("src/Images/BtnCajaSele.png");
  ImageIcon iconobtn4 = new ImageIcon("src/Images/BtnInventSele.png");
  ImageIcon iconobtn5 = new ImageIcon("src/Images/BtnAjusSele.png");
    
  //Iconos No selected
  ImageIcon iconobtnNs = new ImageIcon("src/Images/BtnHomeWH.png");
  ImageIcon iconobtnNS2 = new ImageIcon("src/Images/BtnClienWH.png");
  ImageIcon iconobtnNS3 = new ImageIcon("src/Images/BtnCajaWH.png");
  ImageIcon iconobtnNS4 = new ImageIcon("src/Images/btnInventWH.png");
  ImageIcon iconobtnNS5 = new ImageIcon("src/Images/BtnAjusWH.png");
    
  public GUI_PanelHome() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
  **/
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCentralHome = new javax.swing.JPanel();
        NombreEmpresa = new javax.swing.JLabel();
        SubtitleEmpresa = new javax.swing.JLabel();
        TituloSeccionSuperior = new javax.swing.JLabel();
        BtnVerProduct = new javax.swing.JButton();
        BtnVerClientes = new javax.swing.JButton();
        MiniRecatanguloSuperior = new javax.swing.JLabel();
        TituloSeccionInferior = new javax.swing.JLabel();
        TituloSeccionInferior2 = new javax.swing.JLabel();
        BtnRegisVent = new javax.swing.JButton();
        BtnRegisRepor = new javax.swing.JButton();
        BtnRegisComp = new javax.swing.JButton();
        ImagenHome = new javax.swing.JLabel();
        MiniRecatanguloInferior = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelCentralHome.setBackground(new java.awt.Color(248, 248, 248));
        PanelCentralHome.setPreferredSize(new java.awt.Dimension(1050, 600));

        NombreEmpresa.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        NombreEmpresa.setForeground(new java.awt.Color(0, 0, 0));
        NombreEmpresa.setText("La Estrella");

        SubtitleEmpresa.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        SubtitleEmpresa.setForeground(new java.awt.Color(0, 0, 0));
        SubtitleEmpresa.setText("Variedades");

        TituloSeccionSuperior.setFont(new java.awt.Font("Microsoft JhengHei", 0, 21)); // NOI18N
        TituloSeccionSuperior.setForeground(new java.awt.Color(0, 0, 0));
        TituloSeccionSuperior.setText("¿Que desea hacer?");

        BtnVerProduct.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        BtnVerProduct.setForeground(new java.awt.Color(255, 255, 255));
        BtnVerProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BTN_Azul.png"))); // NOI18N
        BtnVerProduct.setText("Ver Productos");
        BtnVerProduct.setBorderPainted(false);
        BtnVerProduct.setContentAreaFilled(false);
        BtnVerProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVerProduct.setFocusPainted(false);
        BtnVerProduct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnVerProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerProductActionPerformed(evt);
            }
        });

        BtnVerClientes.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        BtnVerClientes.setForeground(new java.awt.Color(255, 255, 255));
        BtnVerClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BTN_Azul.png"))); // NOI18N
        BtnVerClientes.setText("Ver Clientes");
        BtnVerClientes.setBorderPainted(false);
        BtnVerClientes.setContentAreaFilled(false);
        BtnVerClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVerClientes.setFocusPainted(false);
        BtnVerClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnVerClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVerClientesActionPerformed(evt);
            }
        });

        MiniRecatanguloSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MiniRectangulo.png"))); // NOI18N

        TituloSeccionInferior.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        TituloSeccionInferior.setForeground(new java.awt.Color(0, 0, 0));
        TituloSeccionInferior.setText("Caja y Reportes");

        TituloSeccionInferior2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 21)); // NOI18N
        TituloSeccionInferior2.setForeground(new java.awt.Color(0, 0, 0));
        TituloSeccionInferior2.setText("¿Que desea hacer?");

        BtnRegisVent.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        BtnRegisVent.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegisVent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BTN_Azul.png"))); // NOI18N
        BtnRegisVent.setText("Registrar Venta");
        BtnRegisVent.setBorderPainted(false);
        BtnRegisVent.setContentAreaFilled(false);
        BtnRegisVent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegisVent.setFocusPainted(false);
        BtnRegisVent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnRegisVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegisVentActionPerformed(evt);
            }
        });

        BtnRegisRepor.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        BtnRegisRepor.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegisRepor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BTN_Azul.png"))); // NOI18N
        BtnRegisRepor.setText("Registrar Reporte");
        BtnRegisRepor.setBorderPainted(false);
        BtnRegisRepor.setContentAreaFilled(false);
        BtnRegisRepor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegisRepor.setFocusPainted(false);
        BtnRegisRepor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnRegisRepor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegisReporActionPerformed(evt);
            }
        });

        BtnRegisComp.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        BtnRegisComp.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegisComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BTN_Azul.png"))); // NOI18N
        BtnRegisComp.setText("Registrar Compra");
        BtnRegisComp.setBorderPainted(false);
        BtnRegisComp.setContentAreaFilled(false);
        BtnRegisComp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegisComp.setFocusPainted(false);
        BtnRegisComp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        ImagenHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ImageHome.png"))); // NOI18N

        MiniRecatanguloInferior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MiniRectangulo.png"))); // NOI18N

        javax.swing.GroupLayout PanelCentralHomeLayout = new javax.swing.GroupLayout(PanelCentralHome);
        PanelCentralHome.setLayout(PanelCentralHomeLayout);
        PanelCentralHomeLayout.setHorizontalGroup(
            PanelCentralHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelCentralHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(PanelCentralHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NombreEmpresa)
                            .addComponent(SubtitleEmpresa)
                            .addComponent(TituloSeccionSuperior)
                            .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(BtnVerProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addComponent(BtnVerClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MiniRecatanguloSuperior)
                    .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(PanelCentralHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TituloSeccionInferior2)
                            .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(BtnRegisComp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(PanelCentralHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(TituloSeccionInferior))
                            .addComponent(BtnRegisRepor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(BtnRegisVent, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MiniRecatanguloInferior))
                .addGap(13, 13, 13)
                .addComponent(ImagenHome))
        );
        PanelCentralHomeLayout.setVerticalGroup(
            PanelCentralHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PanelCentralHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                        .addGroup(PanelCentralHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(PanelCentralHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NombreEmpresa)
                                    .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(SubtitleEmpresa)))
                                .addGap(20, 20, 20)
                                .addComponent(TituloSeccionSuperior)
                                .addGap(31, 31, 31)
                                .addComponent(BtnVerProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(BtnVerClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(MiniRecatanguloSuperior))
                        .addGap(46, 46, 46)
                        .addGroup(PanelCentralHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(TituloSeccionInferior2)
                                .addGap(11, 11, 11)
                                .addComponent(BtnRegisComp, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(TituloSeccionInferior)
                                .addGap(105, 105, 105)
                                .addComponent(BtnRegisRepor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelCentralHomeLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(BtnRegisVent, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(MiniRecatanguloInferior)))
                    .addComponent(ImagenHome)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelCentralHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelCentralHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * No es posible modificar la linea de codigo siguiente.
    **/
    private void BtnVerProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerProductActionPerformed

    GuiProducto ventanaProd = new GuiProducto();
    ventanaProd.setSize(780, 570);
    ventanaProd.setLocation(30, 60);

    PanelCentralHome.removeAll();
    PanelCentralHome.add(PanelProduct, BorderLayout.CENTER);
    PanelCentralHome.revalidate();
    PanelCentralHome.repaint();
    }//GEN-LAST:event_BtnVerProductActionPerformed

    /**
     * No es posible modificar la linea de codigo anterior.
    **/
    
    
    /**
     * No es posible modificar la linea de codigo siguiente.
    **/
    private void BtnRegisVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegisVentActionPerformed

    int seleccion = JOptionPane.showOptionDialog(
                null,
                "¿El cliente paga de contado o fia?",
                "Condicion de venta",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono por defecto.
                new Object[]{"Contado", "Fia"}, // null para YES, NO y CANCEL
                "opcion 1");

    if (seleccion == 0) {
      System.out.println("Contado");
            
      GUI_RegisVentaContado ventanaRegisVentaContado = new GUI_RegisVentaContado();
      ventanaRegisVentaContado.setSize(780, 570);
      ventanaRegisVentaContado.setLocation(30, 60);

      PanelCentralHome.removeAll();
      PanelCentralHome.add(PanelRegisVentContado, BorderLayout.CENTER);
      PanelCentralHome.revalidate();
      PanelCentralHome.repaint();
    }
    else {
      System.out.println("Fia");

      int seleccion2 = JOptionPane.showOptionDialog(
                    null,
                    "¿El cliente está registrado?",
                    "Condicion de venta",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null, // null para icono por defecto.
                    new Object[]{"Sí", "No", "No lo sé"}, // null para YES, NO y CANCEL
                    "opcion 1");

      System.out.println(seleccion2);

      if (seleccion2 == 0) {
        System.out.println("Sí");

        GUI_RegisVentaFiado ventanaRegisVenta = new GUI_RegisVentaFiado();
        ventanaRegisVenta.setSize(780, 570);
        ventanaRegisVenta.setLocation(30, 60);

        PanelCentralHome.removeAll();
        PanelCentralHome.add(PanelRegisVentFia, BorderLayout.CENTER);
        PanelCentralHome.revalidate();
        PanelCentralHome.repaint();
      }
      if (seleccion2 == 1) {
        System.out.println("No");
                
        GUI_RegisCliente ventanaRegisCliente = new GUI_RegisCliente();
        ventanaRegisCliente.setSize(780, 570);
        ventanaRegisCliente.setLocation(30, 60);

        PanelCentralHome.removeAll();
        PanelCentralHome.add(PanelRegisClient, BorderLayout.CENTER);
        PanelCentralHome.revalidate();
        PanelCentralHome.repaint();
      }
      if (seleccion2 == 2) {
        System.out.println("No lo sé"); //Luego lo redirecciona a la pantalla de consultar cliente
                
        GUI_ConsulCliente ventanaConsulCliente = new GUI_ConsulCliente();
        ventanaConsulCliente.setSize(780, 570);
        ventanaConsulCliente.setLocation(30, 60);

        PanelCentralHome.removeAll();
        PanelCentralHome.add(PanelConsulCliente, BorderLayout.CENTER);
        PanelCentralHome.revalidate();
        PanelCentralHome.repaint();
      }
    }
    /**
     * No es posible modificar la linea de codigo siguiente.
    **/
    }//GEN-LAST:event_BtnRegisVentActionPerformed
    /**
     * No es posible modificar la linea de codigo siguiente.
    **/
    private void BtnVerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerClientesActionPerformed

    GUI_Clientes ventanaClientes = new GUI_Clientes();
    ventanaClientes.setSize(780, 570);
    ventanaClientes.setLocation(30,60);
        
    PanelCentralHome.removeAll();
    PanelCentralHome.add(PanelClient, BorderLayout.CENTER);
    PanelCentralHome.revalidate();
    PanelCentralHome.repaint();
        
    /**
     * No es posible modificar la linea de codigo siguiente.
    **/      
    }//GEN-LAST:event_BtnVerClientesActionPerformed

    /**
     * No es posible modificar la linea de codigo siguiente.
    **/
    private void BtnRegisReporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegisReporActionPerformed

    GUI_Reportes ventanaReportes = new GUI_Reportes();
    ventanaReportes.setSize(1050, 600);
    ventanaReportes.setLocation(0, 0);

    PanelCentralHome.removeAll();
    PanelCentralHome.add(PanelReportes, BorderLayout.CENTER);
    PanelCentralHome.revalidate();
    PanelCentralHome.repaint();
    
    /**
     * No es posible modificar la linea de codigo siguiente.
    **/
    }//GEN-LAST:event_BtnRegisReporActionPerformed

  /**
   * @param args the command line arguments.
  **/
  public static void main(String args[]) {

    GUI_PanelHome ventanaPanelHome = new GUI_PanelHome();
    ventanaPanelHome.setBounds(0, 0, 1050, 600);
    ventanaPanelHome.setVisible(true);
    ventanaPanelHome.setResizable(false);
    ventanaPanelHome.setLocationRelativeTo(null);
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //  new GuiProducto().setVisible(true);
          }
        }
    );
  }

  
    /**
     * No es posible modificar las lineas de codigo siguientes.
    **/
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegisComp;
    private javax.swing.JButton BtnRegisRepor;
    private javax.swing.JButton BtnRegisVent;
    private javax.swing.JButton BtnVerClientes;
    private javax.swing.JButton BtnVerProduct;
    private javax.swing.JLabel ImagenHome;
    private javax.swing.JLabel MiniRecatanguloInferior;
    private javax.swing.JLabel MiniRecatanguloSuperior;
    private javax.swing.JLabel NombreEmpresa;
    public static javax.swing.JPanel PanelCentralHome;
    private javax.swing.JLabel SubtitleEmpresa;
    private javax.swing.JLabel TituloSeccionInferior;
    private javax.swing.JLabel TituloSeccionInferior2;
    private javax.swing.JLabel TituloSeccionSuperior;
    // End of variables declaration//GEN-END:variables
}
