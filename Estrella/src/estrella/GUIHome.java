/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrella;

import static estrella.GUI_AjustesN.PanelAjustN;
import static estrella.GUI_Clientes.PanelClient;
import static estrella.GUI_Compra_Venta.PanelCompraVenta;
import static estrella.GUI_ConsulCliente.PanelConsulCliente;
import static estrella.GUI_PanelHome.PanelCentralHome;
import static estrella.GuiProducto.PanelProduct;
import static estrella.GuiRegisCliente.PanelRegisClient;
import static estrella.GUI_RegisVentaContado.PanelRegisVentContado;
import static estrella.GUI_Reportes.PanelReportes;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static estrella.GUI_RegisVentaFiado.PanelRegisVentFia;

/**
 *
 * @author Andres
 */
public class GUIHome extends javax.swing.JFrame {

    //Iconos Selected
    ImageIcon iconobtn = new ImageIcon("src/Images/BtnHomeSele.png");
    ImageIcon iconobtn2 = new ImageIcon("src/Images/BtnClienSele.png");
    ImageIcon iconobtn3 = new ImageIcon("src/Images/BtnCajaSele.png");
    ImageIcon iconobtn4 = new ImageIcon("src/Images/BtnInventSele.png");
    ImageIcon iconobtn5 = new ImageIcon("src/Images/BtnAjusSele.png");
    ImageIcon iconobtn6 = new ImageIcon("src/Images/BtnReportesSele.png");

    //Iconos No selected
    ImageIcon iconobtnNS = new ImageIcon("src/Images/BtnHomeWH.png");
    ImageIcon iconobtnNS2 = new ImageIcon("src/Images/BtnClienWH.png");
    ImageIcon iconobtnNS3 = new ImageIcon("src/Images/BtnCajaWH.png");
    ImageIcon iconobtnNS4 = new ImageIcon("src/Images/btnInventWH.png");
    ImageIcon iconobtnNS5 = new ImageIcon("src/Images/BtnAjusWH.png");
    ImageIcon iconobtnNS6 = new ImageIcon("src/Images/BtnReportesWH.png");

    public GUIHome() {
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
        HomeBTN = new javax.swing.JButton();
        ClientesBTN = new javax.swing.JButton();
        CajaBTN = new javax.swing.JButton();
        InventarioBTN = new javax.swing.JButton();
        AjusBTN = new javax.swing.JButton();
        ReportesBTN = new javax.swing.JButton();
        BarraLateral = new javax.swing.JLabel();
        PanelCentral = new javax.swing.JPanel();
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
        MiniRecatanguloInferior = new javax.swing.JLabel();
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

        HomeBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BtnHomeSele.png"))); // NOI18N
        HomeBTN.setBorderPainted(false);
        HomeBTN.setContentAreaFilled(false);
        HomeBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeBTN.setFocusPainted(false);
        HomeBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomeBTNMousePressed(evt);
            }
        });
        HomeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBTNActionPerformed(evt);
            }
        });
        PanelPrincipal.add(HomeBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 200, -1, -1));

        ClientesBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BtnClienWH.png"))); // NOI18N
        ClientesBTN.setBorderPainted(false);
        ClientesBTN.setContentAreaFilled(false);
        ClientesBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClientesBTN.setFocusPainted(false);
        ClientesBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientesBTNMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ClientesBTNMousePressed(evt);
            }
        });
        ClientesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesBTNActionPerformed(evt);
            }
        });
        PanelPrincipal.add(ClientesBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 260, -1, -1));

        CajaBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BtnCajaWH.png"))); // NOI18N
        CajaBTN.setBorderPainted(false);
        CajaBTN.setContentAreaFilled(false);
        CajaBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CajaBTN.setFocusPainted(false);
        CajaBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajaBTNMousePressed(evt);
            }
        });
        CajaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaBTNActionPerformed(evt);
            }
        });
        PanelPrincipal.add(CajaBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 320, -1, -1));

        InventarioBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/btnInventWH.png"))); // NOI18N
        InventarioBTN.setBorderPainted(false);
        InventarioBTN.setContentAreaFilled(false);
        InventarioBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InventarioBTN.setFocusPainted(false);
        InventarioBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InventarioBTNMousePressed(evt);
            }
        });
        InventarioBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventarioBTNActionPerformed(evt);
            }
        });
        PanelPrincipal.add(InventarioBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 380, -1, -1));

        AjusBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BtnAjusWH.png"))); // NOI18N
        AjusBTN.setBorderPainted(false);
        AjusBTN.setContentAreaFilled(false);
        AjusBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AjusBTN.setFocusPainted(false);
        AjusBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AjusBTNMousePressed(evt);
            }
        });
        AjusBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjusBTNActionPerformed(evt);
            }
        });
        PanelPrincipal.add(AjusBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 590, -1, -1));

        ReportesBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BtnReportesWH.png"))); // NOI18N
        ReportesBTN.setBorderPainted(false);
        ReportesBTN.setContentAreaFilled(false);
        ReportesBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ReportesBTN.setFocusPainted(false);
        ReportesBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ReportesBTNMousePressed(evt);
            }
        });
        ReportesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportesBTNActionPerformed(evt);
            }
        });
        PanelPrincipal.add(ReportesBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 450, -1, -1));

        BarraLateral.setBackground(new java.awt.Color(248, 248, 248));
        BarraLateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BarraLateral.png"))); // NOI18N
        BarraLateral.setToolTipText("");
        PanelPrincipal.add(BarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 28, -1, -1));

        PanelCentral.setBackground(new java.awt.Color(248, 248, 248));
        PanelCentral.setPreferredSize(new java.awt.Dimension(1050, 600));

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

        MiniRecatanguloInferior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MiniRectangulo.png"))); // NOI18N

        ImagenHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ImageHome.png"))); // NOI18N

        javax.swing.GroupLayout PanelCentralLayout = new javax.swing.GroupLayout(PanelCentral);
        PanelCentral.setLayout(PanelCentralLayout);
        PanelCentralLayout.setHorizontalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(TituloSeccionSuperior))
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(NombreEmpresa))
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(SubtitleEmpresa))
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(BtnVerProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(BtnVerClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MiniRecatanguloSuperior)
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(TituloSeccionInferior2))
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(BtnRegisVent, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(BtnRegisComp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(TituloSeccionInferior))
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(BtnRegisRepor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MiniRecatanguloInferior))
                .addGap(13, 13, 13)
                .addComponent(ImagenHome))
        );
        PanelCentralLayout.setVerticalGroup(
            PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCentralLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCentralLayout.createSequentialGroup()
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCentralLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(TituloSeccionSuperior))
                            .addGroup(PanelCentralLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(NombreEmpresa))
                            .addGroup(PanelCentralLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(SubtitleEmpresa))
                            .addGroup(PanelCentralLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(BtnVerProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelCentralLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(BtnVerClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(MiniRecatanguloSuperior))
                        .addGap(46, 46, 46)
                        .addGroup(PanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCentralLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(TituloSeccionInferior2))
                            .addGroup(PanelCentralLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(BtnRegisVent, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelCentralLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(BtnRegisComp, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelCentralLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(TituloSeccionInferior))
                            .addGroup(PanelCentralLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(BtnRegisRepor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(MiniRecatanguloInferior)))
                    .addComponent(ImagenHome)))
        );

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

    private void HomeBTNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBTNMousePressed

        HomeBTN.setIcon(iconobtn);
        ClientesBTN.setIcon(iconobtnNS2);
        CajaBTN.setIcon(iconobtnNS3);
        InventarioBTN.setIcon(iconobtnNS4);
        AjusBTN.setIcon(iconobtnNS5);
        ReportesBTN.setIcon(iconobtnNS6);
    }//GEN-LAST:event_HomeBTNMousePressed

    private void ClientesBTNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientesBTNMousePressed

        HomeBTN.setIcon(iconobtnNS);
        ClientesBTN.setIcon(iconobtn2);
        CajaBTN.setIcon(iconobtnNS3);
        InventarioBTN.setIcon(iconobtnNS4);
        AjusBTN.setIcon(iconobtnNS5);
        ReportesBTN.setIcon(iconobtnNS6);
    }//GEN-LAST:event_ClientesBTNMousePressed

    private void CajaBTNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaBTNMousePressed

        HomeBTN.setIcon(iconobtnNS);
        ClientesBTN.setIcon(iconobtnNS2);
        CajaBTN.setIcon(iconobtn3);
        InventarioBTN.setIcon(iconobtnNS4);
        AjusBTN.setIcon(iconobtnNS5);
        ReportesBTN.setIcon(iconobtnNS6);
    }//GEN-LAST:event_CajaBTNMousePressed

    private void InventarioBTNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InventarioBTNMousePressed

        HomeBTN.setIcon(iconobtnNS);
        ClientesBTN.setIcon(iconobtnNS2);
        CajaBTN.setIcon(iconobtnNS3);
        InventarioBTN.setIcon(iconobtn4);
        AjusBTN.setIcon(iconobtnNS5);
        ReportesBTN.setIcon(iconobtnNS6);
    }//GEN-LAST:event_InventarioBTNMousePressed

    private void AjusBTNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjusBTNMousePressed

        HomeBTN.setIcon(iconobtnNS);
        ClientesBTN.setIcon(iconobtnNS2);
        CajaBTN.setIcon(iconobtnNS3);
        InventarioBTN.setIcon(iconobtnNS4);
        AjusBTN.setIcon(iconobtn5);
        ReportesBTN.setIcon(iconobtnNS6);
    }//GEN-LAST:event_AjusBTNMousePressed

    private void BtnVerProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerProductActionPerformed

        GuiProducto ventanaProd = new GuiProducto();
        ventanaProd.setSize(780, 570);
        ventanaProd.setLocation(30, 60);

        PanelCentral.removeAll();
        PanelCentral.add(PanelProduct, BorderLayout.CENTER);
        PanelCentral.revalidate();
        PanelCentral.repaint();

        //Para cambiar el icono del menu izq
        HomeBTN.setIcon(iconobtnNS);
        ClientesBTN.setIcon(iconobtnNS2);
        CajaBTN.setIcon(iconobtn3);
        InventarioBTN.setIcon(iconobtnNS4);
        AjusBTN.setIcon(iconobtnNS5);
        ReportesBTN.setIcon(iconobtnNS6);
    }//GEN-LAST:event_BtnVerProductActionPerformed

    private void HomeBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBTNActionPerformed

        GUI_PanelHome ventanaPanelHome = new GUI_PanelHome();
        ventanaPanelHome.setSize(1050, 600);
        ventanaPanelHome.setLocation(0, 0);

        PanelCentral.removeAll();
        PanelCentral.add(PanelCentralHome, BorderLayout.CENTER);
        PanelCentral.revalidate();
        PanelCentral.repaint();
    }//GEN-LAST:event_HomeBTNActionPerformed

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

            PanelCentral.removeAll();
            PanelCentral.add(PanelRegisVentContado, BorderLayout.CENTER);
            PanelCentral.revalidate();
            PanelCentral.repaint();

        } else {
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

                PanelCentral.removeAll();
                PanelCentral.add(PanelRegisVentFia, BorderLayout.CENTER);
                PanelCentral.revalidate();
                PanelCentral.repaint();
            }
            if (seleccion2 == 1) {
                System.out.println("No");
                
                GuiRegisCliente ventanaRegisCliente = new GuiRegisCliente();
                ventanaRegisCliente.setSize(780, 570);
                ventanaRegisCliente.setLocation(30, 60);

                PanelCentral.removeAll();
                PanelCentral.add(PanelRegisClient, BorderLayout.CENTER);
                PanelCentral.revalidate();
                PanelCentral.repaint();
            }
            if (seleccion2 == 2) {
                System.out.println("No lo sé"); //Luego lo redirecciona a la pantalla de consultar cliente
                
                GUI_ConsulCliente ventanaConsulCliente = new GUI_ConsulCliente();
                ventanaConsulCliente.setSize(780, 570);
                ventanaConsulCliente.setLocation(30, 60);

                PanelCentral.removeAll();
                PanelCentral.add(PanelConsulCliente, BorderLayout.CENTER);
                PanelCentral.revalidate();
                PanelCentral.repaint();
            }
        }
    }//GEN-LAST:event_BtnRegisVentActionPerformed

    private void BtnVerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVerClientesActionPerformed

        GUI_Clientes ventanaClientes = new GUI_Clientes();
        ventanaClientes.setSize(780, 570);
        ventanaClientes.setLocation(30, 60);

        PanelCentral.removeAll();
        PanelCentral.add(PanelClient, BorderLayout.CENTER);
        PanelCentral.revalidate();
        PanelCentral.repaint();

        //Para cambiar el icono del menu izq
        HomeBTN.setIcon(iconobtnNS);
        ClientesBTN.setIcon(iconobtn2);
        CajaBTN.setIcon(iconobtnNS3);
        InventarioBTN.setIcon(iconobtnNS4);
        AjusBTN.setIcon(iconobtnNS5);
        ReportesBTN.setIcon(iconobtnNS6);
    }//GEN-LAST:event_BtnVerClientesActionPerformed

    private void ClientesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesBTNActionPerformed

        GUI_Clientes ventanaClientes = new GUI_Clientes();
        ventanaClientes.setSize(1050, 600);
        ventanaClientes.setLocation(0, 0);

        PanelCentral.removeAll();
        PanelCentral.add(PanelClient, BorderLayout.CENTER);
        PanelCentral.revalidate();
        PanelCentral.repaint();
    }//GEN-LAST:event_ClientesBTNActionPerformed

    private void ClientesBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientesBTNMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ClientesBTNMouseClicked

    private void ReportesBTNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportesBTNMousePressed

        HomeBTN.setIcon(iconobtnNS);
        ClientesBTN.setIcon(iconobtnNS2);
        CajaBTN.setIcon(iconobtnNS3);
        InventarioBTN.setIcon(iconobtnNS4);
        AjusBTN.setIcon(iconobtnNS5);
        ReportesBTN.setIcon(iconobtn6);
    }//GEN-LAST:event_ReportesBTNMousePressed

    private void CajaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaBTNActionPerformed

        GUI_Compra_Venta ventanaCompraVenta = new GUI_Compra_Venta();
        ventanaCompraVenta.setSize(1050, 600);
        ventanaCompraVenta.setLocation(0, 0);

        PanelCentral.removeAll();
        PanelCentral.add(PanelCompraVenta, BorderLayout.CENTER);
        PanelCentral.revalidate();
        PanelCentral.repaint();
    }//GEN-LAST:event_CajaBTNActionPerformed

    private void InventarioBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventarioBTNActionPerformed

        GuiProducto ventanaProd = new GuiProducto();
        ventanaProd.setSize(1050, 600);
        ventanaProd.setLocation(0, 0);

        PanelCentral.removeAll();
        PanelCentral.add(PanelProduct, BorderLayout.CENTER);
        PanelCentral.revalidate();
        PanelCentral.repaint();
    }//GEN-LAST:event_InventarioBTNActionPerformed

    private void ReportesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportesBTNActionPerformed

        GUI_Reportes ventanaReportes = new GUI_Reportes();
        ventanaReportes.setSize(1050, 600);
        ventanaReportes.setLocation(0, 0);

        PanelCentral.removeAll();
        PanelCentral.add(PanelReportes, BorderLayout.CENTER);
        PanelCentral.revalidate();
        PanelCentral.repaint();
    }//GEN-LAST:event_ReportesBTNActionPerformed

    private void BtnRegisReporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegisReporActionPerformed

        GUI_Reportes ventanaReportes = new GUI_Reportes();
        ventanaReportes.setSize(1050, 600);
        ventanaReportes.setLocation(0, 0);

        PanelCentral.removeAll();
        PanelCentral.add(PanelReportes, BorderLayout.CENTER);
        PanelCentral.revalidate();
        PanelCentral.repaint();
    }//GEN-LAST:event_BtnRegisReporActionPerformed

    private void AjusBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjusBTNActionPerformed
  
        GUI_AjustesN ventanaAjustN = new GUI_AjustesN();
        ventanaAjustN.setSize(1050, 600);
        ventanaAjustN.setLocation(0, 0);

        PanelCentral.removeAll();
        PanelCentral.add(PanelAjustN, BorderLayout.CENTER);
        PanelCentral.revalidate();
        PanelCentral.repaint();
    }//GEN-LAST:event_AjusBTNActionPerformed

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
        GUIHome ventanaHome = new GUIHome();
        ventanaHome.setBounds(0, 0, 1244, 710);
        ventanaHome.setVisible(true);
        ventanaHome.setResizable(false);
        ventanaHome.setLocationRelativeTo(null);
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //  new GUIHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjusBTN;
    private javax.swing.JLabel BarraLateral;
    private javax.swing.JButton BtnRegisComp;
    private javax.swing.JButton BtnRegisRepor;
    private javax.swing.JButton BtnRegisVent;
    private javax.swing.JButton BtnVerClientes;
    private javax.swing.JButton BtnVerProduct;
    private javax.swing.JButton CajaBTN;
    private javax.swing.JButton ClientesBTN;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton HomeBTN;
    private javax.swing.JLabel ImagenHome;
    private javax.swing.JButton InventarioBTN;
    private javax.swing.JLabel MiniRecatanguloInferior;
    private javax.swing.JLabel MiniRecatanguloSuperior;
    private javax.swing.JLabel NombreEmpresa;
    private javax.swing.JPanel PanelCentral;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton ReportesBTN;
    private javax.swing.JLabel SubtitleEmpresa;
    private javax.swing.JLabel TituloSeccionInferior;
    private javax.swing.JLabel TituloSeccionInferior2;
    private javax.swing.JLabel TituloSeccionSuperior;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
