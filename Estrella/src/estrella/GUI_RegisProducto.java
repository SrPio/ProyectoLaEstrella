package estrella;

import static estrella.Conexion.getConection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class GUI_RegisProducto extends javax.swing.JFrame {

    public GUI_RegisProducto() {
        initComponents();
    }

    String fechaCaduci, fechaAviso;

    PreparedStatement ps, ps2;
    ResultSet rs;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRegisPro = new javax.swing.JPanel();
        LabelNombProduct = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        FiledNombProd = new javax.swing.JTextField();
        FieldCosto = new javax.swing.JTextField();
        FieldPrecioVenta = new javax.swing.JTextField();
        FieldConcept = new javax.swing.JTextField();
        LabelConcept = new javax.swing.JLabel();
        LabelCosto = new javax.swing.JLabel();
        LabelPreciVen = new javax.swing.JLabel();
        LabelFechaCadu = new javax.swing.JLabel();
        FondoText1 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        LineaDivisora = new javax.swing.JLabel();
        FondoText2 = new javax.swing.JLabel();
        FondoText3 = new javax.swing.JLabel();
        FondoText4 = new javax.swing.JLabel();
        LabelFechaAvisoCadu = new javax.swing.JLabel();
        FieldCantidad = new javax.swing.JTextField();
        LabelCantidad = new javax.swing.JLabel();
        FondoText7 = new javax.swing.JLabel();
        FieldCategoria = new javax.swing.JTextField();
        FondoText8 = new javax.swing.JLabel();
        LabelCategoria = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        estado = new javax.swing.JTextField();
        Cponder = new javax.swing.JTextField();
        FieldFechaDia = new javax.swing.JTextField();
        FieldFechaMes = new javax.swing.JTextField();
        FieldFechaAño = new javax.swing.JTextField();
        LabelD_M_A = new javax.swing.JLabel();
        FieldFechaDiaAviso = new javax.swing.JTextField();
        FieldFechaMesAviso = new javax.swing.JTextField();
        FieldFechaAñoAviso = new javax.swing.JTextField();
        LabelD_M_A1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelRegisPro.setBackground(new java.awt.Color(248, 248, 248));
        PanelRegisPro.setPreferredSize(new java.awt.Dimension(1050, 600));
        PanelRegisPro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelNombProduct.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelNombProduct.setForeground(new java.awt.Color(0, 0, 0));
        LabelNombProduct.setText("Nombre del Producto");
        PanelRegisPro.add(LabelNombProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jButton1.setBackground(new java.awt.Color(248, 248, 248));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Boton_morado2.png"))); // NOI18N
        jButton1.setText("Registrar");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelRegisPro.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 250, 90));

        FiledNombProd.setBackground(new java.awt.Color(232, 232, 232));
        FiledNombProd.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FiledNombProd.setForeground(new java.awt.Color(51, 51, 51));
        FiledNombProd.setBorder(null);
        PanelRegisPro.add(FiledNombProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 180, -1));

        FieldCosto.setBackground(new java.awt.Color(232, 232, 232));
        FieldCosto.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldCosto.setForeground(new java.awt.Color(51, 51, 51));
        FieldCosto.setBorder(null);
        PanelRegisPro.add(FieldCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 180, -1));

        FieldPrecioVenta.setBackground(new java.awt.Color(232, 232, 232));
        FieldPrecioVenta.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldPrecioVenta.setForeground(new java.awt.Color(51, 51, 51));
        FieldPrecioVenta.setBorder(null);
        PanelRegisPro.add(FieldPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 180, -1));

        FieldConcept.setBackground(new java.awt.Color(232, 232, 232));
        FieldConcept.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldConcept.setForeground(new java.awt.Color(51, 51, 51));
        FieldConcept.setBorder(null);
        PanelRegisPro.add(FieldConcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 180, -1));

        LabelConcept.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelConcept.setForeground(new java.awt.Color(0, 0, 0));
        LabelConcept.setText("Concepto");
        PanelRegisPro.add(LabelConcept, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        LabelCosto.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelCosto.setForeground(new java.awt.Color(0, 0, 0));
        LabelCosto.setText("Costo");
        PanelRegisPro.add(LabelCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        LabelPreciVen.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelPreciVen.setForeground(new java.awt.Color(0, 0, 0));
        LabelPreciVen.setText("Precio de venta");
        PanelRegisPro.add(LabelPreciVen, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        LabelFechaCadu.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelFechaCadu.setForeground(new java.awt.Color(0, 0, 0));
        LabelFechaCadu.setText("Fecha de Caducidad");
        PanelRegisPro.add(LabelFechaCadu, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        FondoText1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisPro.add(FondoText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        Titulo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 30)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Añadir Producto");
        PanelRegisPro.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        LineaDivisora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Linea001.png"))); // NOI18N
        PanelRegisPro.add(LineaDivisora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 870, 20));

        FondoText2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisPro.add(FondoText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        FondoText3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisPro.add(FondoText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        FondoText4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisPro.add(FondoText4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        LabelFechaAvisoCadu.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelFechaAvisoCadu.setForeground(new java.awt.Color(0, 0, 0));
        LabelFechaAvisoCadu.setText("Fecha de aviso de Caducidad");
        PanelRegisPro.add(LabelFechaAvisoCadu, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        FieldCantidad.setBackground(new java.awt.Color(232, 232, 232));
        FieldCantidad.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldCantidad.setForeground(new java.awt.Color(51, 51, 51));
        FieldCantidad.setBorder(null);
        PanelRegisPro.add(FieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 180, -1));

        LabelCantidad.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelCantidad.setForeground(new java.awt.Color(0, 0, 0));
        LabelCantidad.setText("Cantidad");
        PanelRegisPro.add(LabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        FondoText7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisPro.add(FondoText7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        FieldCategoria.setBackground(new java.awt.Color(232, 232, 232));
        FieldCategoria.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldCategoria.setForeground(new java.awt.Color(51, 51, 51));
        FieldCategoria.setBorder(null);
        PanelRegisPro.add(FieldCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, 180, -1));

        FondoText8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisPro.add(FondoText8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, -1, -1));

        LabelCategoria.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelCategoria.setForeground(new java.awt.Color(0, 0, 0));
        LabelCategoria.setText("Categoria");
        PanelRegisPro.add(LabelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, -1));

        Id.setBackground(new java.awt.Color(232, 232, 232));
        Id.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        Id.setForeground(new java.awt.Color(51, 51, 51));
        Id.setText("id");
        Id.setBorder(null);
        PanelRegisPro.add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 180, -1));

        estado.setBackground(new java.awt.Color(232, 232, 232));
        estado.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        estado.setForeground(new java.awt.Color(51, 51, 51));
        estado.setText("Activo");
        estado.setBorder(null);
        PanelRegisPro.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 180, -1));

        Cponder.setBackground(new java.awt.Color(232, 232, 232));
        Cponder.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        Cponder.setForeground(new java.awt.Color(51, 51, 51));
        Cponder.setText("0");
        Cponder.setBorder(null);
        PanelRegisPro.add(Cponder, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 180, -1));

        FieldFechaDia.setBackground(new java.awt.Color(232, 232, 232));
        FieldFechaDia.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldFechaDia.setForeground(new java.awt.Color(51, 51, 51));
        FieldFechaDia.setBorder(null);
        PanelRegisPro.add(FieldFechaDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 30, -1));

        FieldFechaMes.setBackground(new java.awt.Color(232, 232, 232));
        FieldFechaMes.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldFechaMes.setForeground(new java.awt.Color(51, 51, 51));
        FieldFechaMes.setBorder(null);
        PanelRegisPro.add(FieldFechaMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 30, -1));

        FieldFechaAño.setBackground(new java.awt.Color(232, 232, 232));
        FieldFechaAño.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldFechaAño.setForeground(new java.awt.Color(51, 51, 51));
        FieldFechaAño.setBorder(null);
        PanelRegisPro.add(FieldFechaAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 50, -1));

        LabelD_M_A.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        LabelD_M_A.setForeground(new java.awt.Color(0, 0, 0));
        LabelD_M_A.setText("dd - mm - aaa");
        PanelRegisPro.add(LabelD_M_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        FieldFechaDiaAviso.setBackground(new java.awt.Color(232, 232, 232));
        FieldFechaDiaAviso.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldFechaDiaAviso.setForeground(new java.awt.Color(51, 51, 51));
        FieldFechaDiaAviso.setBorder(null);
        PanelRegisPro.add(FieldFechaDiaAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 30, -1));

        FieldFechaMesAviso.setBackground(new java.awt.Color(232, 232, 232));
        FieldFechaMesAviso.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldFechaMesAviso.setForeground(new java.awt.Color(51, 51, 51));
        FieldFechaMesAviso.setBorder(null);
        PanelRegisPro.add(FieldFechaMesAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 30, -1));

        FieldFechaAñoAviso.setBackground(new java.awt.Color(232, 232, 232));
        FieldFechaAñoAviso.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldFechaAñoAviso.setForeground(new java.awt.Color(51, 51, 51));
        FieldFechaAñoAviso.setBorder(null);
        PanelRegisPro.add(FieldFechaAñoAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 50, -1));

        LabelD_M_A1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        LabelD_M_A1.setForeground(new java.awt.Color(0, 0, 0));
        LabelD_M_A1.setText("dd - mm - aaa");
        PanelRegisPro.add(LabelD_M_A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegisPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegisPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        fechaCaduci = (FieldFechaDia.getText() + " - " + FieldFechaMes.getText() + " - " + FieldFechaAño.getText());
        fechaAviso = (FieldFechaDiaAviso.getText() + " - " + FieldFechaMesAviso.getText() + " - " + FieldFechaAñoAviso.getText());

        Connection con = null;

        try {

            con = getConection();
            ps = con.prepareStatement("INSERT INTO producto(id_producto, nombre_producto, concepto, costo, existencias, costo_ponderado, precio_venta, categoria, estado, Fecha_caducidad, fecha_aviso) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, Integer.parseInt(Id.getText()));
            ps.setString(2, FiledNombProd.getText());
            ps.setString(3, FieldConcept.getText());
            ps.setInt(4, Integer.parseInt(FieldCosto.getText()));
            ps.setInt(5, Integer.parseInt(FieldCantidad.getText()));
            ps.setInt(6, Integer.parseInt(Cponder.getText()));
            ps.setInt(7, Integer.parseInt(FieldPrecioVenta.getText()));
            ps.setString(8, FieldCategoria.getText());
            ps.setString(9, estado.getText());
            ps.setString(10, fechaCaduci);
            ps.setString(11, fechaAviso);

            int res = ps.executeUpdate();

            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Producto Guardado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar Producto");
                System.out.println("Error al Guardar Producto");
            }

            con.close();

        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        GUI_RegisProducto ventanaRegisProd = new GUI_RegisProducto();
        ventanaRegisProd.setBounds(0, 0, 1050, 600);
        ventanaRegisProd.setVisible(true);
        ventanaRegisProd.setResizable(false);
        ventanaRegisProd.setLocationRelativeTo(null);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //  new GUI_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cponder;
    private javax.swing.JTextField FieldCantidad;
    private javax.swing.JTextField FieldCategoria;
    private javax.swing.JTextField FieldConcept;
    private javax.swing.JTextField FieldCosto;
    private javax.swing.JTextField FieldFechaAño;
    private javax.swing.JTextField FieldFechaAñoAviso;
    private javax.swing.JTextField FieldFechaDia;
    private javax.swing.JTextField FieldFechaDiaAviso;
    private javax.swing.JTextField FieldFechaMes;
    private javax.swing.JTextField FieldFechaMesAviso;
    private javax.swing.JTextField FieldPrecioVenta;
    private javax.swing.JTextField FiledNombProd;
    private javax.swing.JLabel FondoText1;
    private javax.swing.JLabel FondoText2;
    private javax.swing.JLabel FondoText3;
    private javax.swing.JLabel FondoText4;
    private javax.swing.JLabel FondoText7;
    private javax.swing.JLabel FondoText8;
    private javax.swing.JTextField Id;
    private javax.swing.JLabel LabelCantidad;
    private javax.swing.JLabel LabelCategoria;
    private javax.swing.JLabel LabelConcept;
    private javax.swing.JLabel LabelCosto;
    private javax.swing.JLabel LabelD_M_A;
    private javax.swing.JLabel LabelD_M_A1;
    private javax.swing.JLabel LabelFechaAvisoCadu;
    private javax.swing.JLabel LabelFechaCadu;
    private javax.swing.JLabel LabelNombProduct;
    private javax.swing.JLabel LabelPreciVen;
    private javax.swing.JLabel LineaDivisora;
    public static javax.swing.JPanel PanelRegisPro;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField estado;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
