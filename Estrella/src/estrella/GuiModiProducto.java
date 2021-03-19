package estrella;

import static estrella.Conexion.getConection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class GuiModiProducto extends javax.swing.JFrame {

  public static String campo = "";

  public GuiModiProducto() {
    initComponents();
  }
    
  String fechaCaduci;
  String fechaAviso;

  PreparedStatement ps;
  PreparedStatement ps2;
  ResultSet rs;

  /**
   * Los comentarios de esta función (linea 31 hasta linea 310) no se pueden
   * modificar ya que son autogenerados por netbeans en el formulario
   * de la interfaz gráfica.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelModiProduct = new javax.swing.JPanel();
        Labelid_Prod = new javax.swing.JLabel();
        BtnModifiProdu = new javax.swing.JButton();
        FiledId_Prod = new javax.swing.JTextField();
        FieldCategoria = new javax.swing.JTextField();
        FieldCosto = new javax.swing.JTextField();
        FieldNombre = new javax.swing.JTextField();
        FieldConcepto = new javax.swing.JTextField();
        LabelNombre = new javax.swing.JLabel();
        LabelCategoria = new javax.swing.JLabel();
        LabelCosto = new javax.swing.JLabel();
        LabelConcepto = new javax.swing.JLabel();
        FondoText1 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        LineaDivisora = new javax.swing.JLabel();
        FondoText2 = new javax.swing.JLabel();
        FondoText3 = new javax.swing.JLabel();
        FondoText4 = new javax.swing.JLabel();
        FondoText5 = new javax.swing.JLabel();
        LabelPrecioVenta = new javax.swing.JLabel();
        FieldPreciVenta = new javax.swing.JTextField();
        FondoText6 = new javax.swing.JLabel();
        LabelBusqueda = new javax.swing.JLabel();
        BtnBuscarProd = new javax.swing.JButton();
        BuscarProdu = new javax.swing.JTextField();
        FondoText10 = new javax.swing.JLabel();
        LineaDivisora2 = new javax.swing.JLabel();
        txt_Id = new javax.swing.JTextField();
        LabelFechaCadu = new javax.swing.JLabel();
        LabelFechaAviso = new javax.swing.JLabel();
        LabelExistencias = new javax.swing.JLabel();
        FieldExistencias = new javax.swing.JTextField();
        FondoText9 = new javax.swing.JLabel();
        Cponder = new javax.swing.JTextField();
        estado = new javax.swing.JTextField();
        FieldFechaDia = new javax.swing.JTextField();
        FieldFechaMes = new javax.swing.JTextField();
        FieldFechaAño = new javax.swing.JTextField();
        LabelD_M_A = new javax.swing.JLabel();
        FieldFechaDiaAviso = new javax.swing.JTextField();
        FieldFechaMesAviso = new javax.swing.JTextField();
        FieldFechaAñoAviso = new javax.swing.JTextField();
        LabelD_M_A1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelModiProduct.setBackground(new java.awt.Color(248, 248, 248));
        PanelModiProduct.setPreferredSize(new java.awt.Dimension(1050, 600));
        PanelModiProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Labelid_Prod.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        Labelid_Prod.setText("Id Producto");
        PanelModiProduct.add(Labelid_Prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        BtnModifiProdu.setBackground(new java.awt.Color(248, 248, 248));
        BtnModifiProdu.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        BtnModifiProdu.setForeground(new java.awt.Color(255, 255, 255));
        BtnModifiProdu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Boton_morado2.png"))); // NOI18N
        BtnModifiProdu.setText("Modificar");
        BtnModifiProdu.setBorderPainted(false);
        BtnModifiProdu.setContentAreaFilled(false);
        BtnModifiProdu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnModifiProdu.setFocusPainted(false);
        BtnModifiProdu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnModifiProdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModifiProduActionPerformed(evt);
            }
        });
        PanelModiProduct.add(BtnModifiProdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 250, 90));

        FiledId_Prod.setEditable(false);
        FiledId_Prod.setBackground(new java.awt.Color(232, 232, 232));
        FiledId_Prod.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FiledId_Prod.setForeground(new java.awt.Color(51, 51, 51));
        FiledId_Prod.setBorder(null);
        PanelModiProduct.add(FiledId_Prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 180, -1));

        FieldCategoria.setBackground(new java.awt.Color(232, 232, 232));
        FieldCategoria.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldCategoria.setForeground(new java.awt.Color(51, 51, 51));
        FieldCategoria.setBorder(null);
        PanelModiProduct.add(FieldCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 180, -1));

        FieldCosto.setBackground(new java.awt.Color(232, 232, 232));
        FieldCosto.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldCosto.setForeground(new java.awt.Color(51, 51, 51));
        FieldCosto.setBorder(null);
        PanelModiProduct.add(FieldCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 180, -1));

        FieldNombre.setBackground(new java.awt.Color(232, 232, 232));
        FieldNombre.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldNombre.setForeground(new java.awt.Color(51, 51, 51));
        FieldNombre.setBorder(null);
        PanelModiProduct.add(FieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 180, -1));

        FieldConcepto.setBackground(new java.awt.Color(232, 232, 232));
        FieldConcepto.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldConcepto.setForeground(new java.awt.Color(51, 51, 51));
        FieldConcepto.setBorder(null);
        PanelModiProduct.add(FieldConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 180, -1));

        LabelNombre.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelNombre.setText("Nombre");
        PanelModiProduct.add(LabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        LabelCategoria.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelCategoria.setText("Categoria");
        PanelModiProduct.add(LabelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));

        LabelCosto.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelCosto.setText("Costo");
        PanelModiProduct.add(LabelCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        LabelConcepto.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelConcepto.setText("Concepto");
        PanelModiProduct.add(LabelConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        FondoText1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelModiProduct.add(FondoText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        Titulo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 30)); // NOI18N
        Titulo.setText("Modificar Producto");
        PanelModiProduct.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        LineaDivisora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Linea001.png"))); // NOI18N
        PanelModiProduct.add(LineaDivisora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 870, 20));

        FondoText2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelModiProduct.add(FondoText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        FondoText3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelModiProduct.add(FondoText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        FondoText4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelModiProduct.add(FondoText4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        FondoText5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelModiProduct.add(FondoText5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        LabelPrecioVenta.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelPrecioVenta.setText("Precio de Venta");
        PanelModiProduct.add(LabelPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, -1, -1));

        FieldPreciVenta.setBackground(new java.awt.Color(232, 232, 232));
        FieldPreciVenta.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldPreciVenta.setForeground(new java.awt.Color(51, 51, 51));
        FieldPreciVenta.setBorder(null);
        PanelModiProduct.add(FieldPreciVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 180, -1));

        FondoText6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelModiProduct.add(FondoText6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, -1, -1));

        LabelBusqueda.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelBusqueda.setText("Buscar Id del Producto:");
        PanelModiProduct.add(LabelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        BtnBuscarProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Boton_Buscar.png"))); // NOI18N
        BtnBuscarProd.setBorderPainted(false);
        BtnBuscarProd.setContentAreaFilled(false);
        BtnBuscarProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnBuscarProd.setFocusPainted(false);
        BtnBuscarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarProdActionPerformed(evt);
            }
        });
        PanelModiProduct.add(BtnBuscarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        BuscarProdu.setBackground(new java.awt.Color(232, 232, 232));
        BuscarProdu.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        BuscarProdu.setForeground(new java.awt.Color(51, 51, 51));
        BuscarProdu.setBorder(null);
        PanelModiProduct.add(BuscarProdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 160, -1));

        FondoText10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search Bar.png"))); // NOI18N
        PanelModiProduct.add(FondoText10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        LineaDivisora2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Linea001.png"))); // NOI18N
        PanelModiProduct.add(LineaDivisora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 870, 20));

        txt_Id.setEditable(false);
        PanelModiProduct.add(txt_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 80, -1));

        LabelFechaCadu.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelFechaCadu.setText("Fecha de Caducidad");
        PanelModiProduct.add(LabelFechaCadu, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, -1, -1));

        LabelFechaAviso.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelFechaAviso.setText("Fecha aviso de Caducidad");
        PanelModiProduct.add(LabelFechaAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, -1, -1));

        LabelExistencias.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelExistencias.setText("Existencias");
        PanelModiProduct.add(LabelExistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, -1, -1));

        FieldExistencias.setBackground(new java.awt.Color(232, 232, 232));
        FieldExistencias.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldExistencias.setForeground(new java.awt.Color(51, 51, 51));
        FieldExistencias.setBorder(null);
        PanelModiProduct.add(FieldExistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, 180, -1));

        FondoText9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelModiProduct.add(FondoText9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, -1, -1));

        Cponder.setBackground(new java.awt.Color(232, 232, 232));
        Cponder.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        Cponder.setForeground(new java.awt.Color(51, 51, 51));
        Cponder.setText("0");
        Cponder.setBorder(null);
        PanelModiProduct.add(Cponder, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 180, -1));

        estado.setEditable(false);
        estado.setBackground(new java.awt.Color(232, 232, 232));
        estado.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        estado.setForeground(new java.awt.Color(51, 51, 51));
        estado.setText("Activo");
        estado.setBorder(null);
        PanelModiProduct.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 180, -1));

        FieldFechaDia.setBackground(new java.awt.Color(232, 232, 232));
        FieldFechaDia.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldFechaDia.setForeground(new java.awt.Color(51, 51, 51));
        FieldFechaDia.setBorder(null);
        PanelModiProduct.add(FieldFechaDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 30, -1));

        FieldFechaMes.setBackground(new java.awt.Color(232, 232, 232));
        FieldFechaMes.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldFechaMes.setForeground(new java.awt.Color(51, 51, 51));
        FieldFechaMes.setBorder(null);
        PanelModiProduct.add(FieldFechaMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 30, -1));

        FieldFechaAño.setBackground(new java.awt.Color(232, 232, 232));
        FieldFechaAño.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldFechaAño.setForeground(new java.awt.Color(51, 51, 51));
        FieldFechaAño.setBorder(null);
        PanelModiProduct.add(FieldFechaAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, 50, -1));

        LabelD_M_A.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        LabelD_M_A.setText("dd - mm - aaa");
        PanelModiProduct.add(LabelD_M_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 250, -1, -1));

        FieldFechaDiaAviso.setBackground(new java.awt.Color(232, 232, 232));
        FieldFechaDiaAviso.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldFechaDiaAviso.setForeground(new java.awt.Color(51, 51, 51));
        FieldFechaDiaAviso.setBorder(null);
        PanelModiProduct.add(FieldFechaDiaAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 30, -1));

        FieldFechaMesAviso.setBackground(new java.awt.Color(232, 232, 232));
        FieldFechaMesAviso.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldFechaMesAviso.setForeground(new java.awt.Color(51, 51, 51));
        FieldFechaMesAviso.setBorder(null);
        PanelModiProduct.add(FieldFechaMesAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 320, 30, -1));

        FieldFechaAñoAviso.setBackground(new java.awt.Color(232, 232, 232));
        FieldFechaAñoAviso.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldFechaAñoAviso.setForeground(new java.awt.Color(51, 51, 51));
        FieldFechaAñoAviso.setBorder(null);
        PanelModiProduct.add(FieldFechaAñoAviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 320, 50, -1));

        LabelD_M_A1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        LabelD_M_A1.setText("dd - mm - aaa");
        PanelModiProduct.add(LabelD_M_A1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelModiProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelModiProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Los comentarios de la linea siguiente no se pueden modificar ya que
     * son autogenerados por netbeans en el formulario de la interfaz gráfica.
     */
    private void BtnModifiProduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifiProduActionPerformed

    fechaCaduci = (FieldFechaDia.getText() + " - " + FieldFechaMes.getText()
                   + " - " + FieldFechaAño.getText());
    fechaAviso = (FieldFechaDiaAviso.getText() + " - " + FieldFechaMesAviso.getText()
                  + " - " + FieldFechaAñoAviso.getText());
        
    if (estado.getText().equals("Activo")) {
      Connection con = null;

      try {

        con = getConection();
        ps = con.prepareStatement("UPDATE producto SET nombre_producto=?,"
                                  + "concepto=?, costo=?, existencias=?,costo_ponderado=?,"
                                  + "precio_venta=?, categoria=?, estado=?, fecha_caducidad=?,"
                                  + "fecha_aviso=? WHERE id_producto=?");

        ps.setString(1, FieldNombre.getText());
        ps.setString(2, FieldConcepto.getText());
        ps.setInt(3, Integer.parseInt(FieldCosto.getText()));
        ps.setInt(4, Integer.parseInt(FieldExistencias.getText()));
        ps.setInt(5, Integer.parseInt(Cponder.getText()));
        ps.setInt(6, Integer.parseInt(FieldPreciVenta.getText()));
        ps.setString(7, FieldCategoria.getText());
        ps.setString(8, estado.getText());
        ps.setString(9, fechaCaduci);
        ps.setString(10, fechaAviso);
        ps.setInt(11, Integer.parseInt(txt_Id.getText()));

        int res = ps.executeUpdate();

        if (res > 0) {
          JOptionPane.showMessageDialog(null, "Producto Modificado");
        } else {
          JOptionPane.showMessageDialog(null, "Error al Modificar Producto");
          //System.out.println("Error al Guardar Producto");
        }

        con.close();

      } catch (Exception e) {
        System.err.println(e);
      }
      
    } else {
      JOptionPane.showMessageDialog(null, "El producto está descontinuado, no se puede modificar");
    }
    
    /**
     * Los comentarios de la linea siguiente no se pueden modificar ya que
     * son autogenerados por netbeans en el formulario de la interfaz gráfica.
     */
    }//GEN-LAST:event_BtnModifiProduActionPerformed

    /**
     * Los comentarios de la linea siguiente no se pueden modificar ya que
     * son autogenerados por netbeans en el formulario de la interfaz gráfica.
     */
    private void BtnBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarProdActionPerformed

    Connection con = null;

    campo = BuscarProdu.getText();
    String where = "";
    if (!"".equals(campo)) {
      where = "WHERE id_producto = '" + campo + "'";
    }

    try {

      con = getConection();
      String sql = "SELECT * FROM public.producto " + where;
      ps = con.prepareStatement(sql);

      rs = ps.executeQuery();

      if (rs.next()) {
        FiledId_Prod.setText(rs.getString("id_producto"));
        FieldNombre.setText(rs.getString("nombre_producto"));
        FieldConcepto.setText(rs.getString("concepto"));
        FieldCosto.setText(rs.getString("costo"));
        FieldExistencias.setText(rs.getString("existencias"));
        Cponder.setText(rs.getString("costo_ponderado"));
        FieldPreciVenta.setText(rs.getString("precio_venta"));
        FieldCategoria.setText(rs.getString("categoria"));
        estado.setText(rs.getString("estado"));
        // FieldFechaCadu.setText(rs.getString("fecha_caducidad"));
        //  FieldFechaAvisoCadu.setText(rs.getString("fecha_aviso"));

        txt_Id.setText(FiledId_Prod.getText());

      } else {
        JOptionPane.showMessageDialog(null, "No existe un producto con ese Codigo");
      }

    } catch (Exception e) {
      System.err.println(e);
    }

    /**
     * Los comentarios de la linea siguiente no se pueden modificar ya que
     * son autogenerados por netbeans en el formulario de la interfaz gráfica.
     */
    }//GEN-LAST:event_BtnBuscarProdActionPerformed

  /**
    * Metodo main, aqui se instancia el objeto de tipo ventanaModiProd para que
    * sea visible.
    **/
  public static void main(String args[]) {

    GuiModiProducto ventanaModiProd = new GuiModiProducto();
    ventanaModiProd.setBounds(0, 0, 1050, 600);
    ventanaModiProd.setVisible(true);
    ventanaModiProd.setResizable(false);
    ventanaModiProd.setLocationRelativeTo(null);
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
            //  new GUI_Producto().setVisible(true);
      }
        });
  }

    /**
    * Los comentarios de estas ultimas lineas siguientes no se pueden modificar ya que
    * son autogenerados por netbeans en el formulario de la interfaz gráfica.
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarProd;
    private javax.swing.JButton BtnModifiProdu;
    private javax.swing.JTextField BuscarProdu;
    private javax.swing.JTextField Cponder;
    private javax.swing.JTextField FieldCategoria;
    private javax.swing.JTextField FieldConcepto;
    private javax.swing.JTextField FieldCosto;
    private javax.swing.JTextField FieldExistencias;
    private javax.swing.JTextField FieldFechaAño;
    private javax.swing.JTextField FieldFechaAñoAviso;
    private javax.swing.JTextField FieldFechaDia;
    private javax.swing.JTextField FieldFechaDiaAviso;
    private javax.swing.JTextField FieldFechaMes;
    private javax.swing.JTextField FieldFechaMesAviso;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JTextField FieldPreciVenta;
    private javax.swing.JTextField FiledId_Prod;
    private javax.swing.JLabel FondoText1;
    private javax.swing.JLabel FondoText10;
    private javax.swing.JLabel FondoText2;
    private javax.swing.JLabel FondoText3;
    private javax.swing.JLabel FondoText4;
    private javax.swing.JLabel FondoText5;
    private javax.swing.JLabel FondoText6;
    private javax.swing.JLabel FondoText9;
    private javax.swing.JLabel LabelBusqueda;
    private javax.swing.JLabel LabelCategoria;
    private javax.swing.JLabel LabelConcepto;
    private javax.swing.JLabel LabelCosto;
    private javax.swing.JLabel LabelD_M_A;
    private javax.swing.JLabel LabelD_M_A1;
    private javax.swing.JLabel LabelExistencias;
    private javax.swing.JLabel LabelFechaAviso;
    private javax.swing.JLabel LabelFechaCadu;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelPrecioVenta;
    private javax.swing.JLabel Labelid_Prod;
    private javax.swing.JLabel LineaDivisora;
    private javax.swing.JLabel LineaDivisora2;
    public static javax.swing.JPanel PanelModiProduct;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField estado;
    private javax.swing.JTextField txt_Id;
    // End of variables declaration//GEN-END:variables
}