package estrella;

import static estrella.Conexion.getConection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class GuiRegisCompra extends javax.swing.JFrame {

  public GuiRegisCompra() {
    initComponents();
  }

  // String fechita = "January 2, 2010";
  // DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
  // Date date = format.parse(fechita);

  PreparedStatement ps;
  PreparedStatement ps2; 
  PreparedStatement ps3;
  PreparedStatement ps4;
  ResultSet rs;
  String existencia;
  String fecha;
  double cpp;
  int res;
  int nuevaExistencia = 0; 
  int costo; 
  int costoNuevo; 
  int cantidad;
  int existenciaOriginal;

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
  **/
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRegisComp = new javax.swing.JPanel();
        BtnRegisComp = new javax.swing.JButton();
        FieldPrecioCompra = new javax.swing.JTextField();
        LabelPrecioCompra = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        LineaDivisora = new javax.swing.JLabel();
        FondoText3 = new javax.swing.JLabel();
        FieldCantidad = new javax.swing.JTextField();
        LabelCantidad = new javax.swing.JLabel();
        FondoText7 = new javax.swing.JLabel();
        IdProducto = new javax.swing.JTextField();
        FondoText9 = new javax.swing.JLabel();
        LabelCostoTotal1 = new javax.swing.JLabel();
        IdCompra = new javax.swing.JTextField();
        FondoText10 = new javax.swing.JLabel();
        LabelidCompra = new javax.swing.JLabel();
        cPonder = new javax.swing.JTextField();
        LabelFecha = new javax.swing.JLabel();
        FieldFechaDia = new javax.swing.JTextField();
        FieldFechaMes = new javax.swing.JTextField();
        FieldFechaA??o = new javax.swing.JTextField();
        LabelD_M_A = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelRegisComp.setBackground(new java.awt.Color(248, 248, 248));
        PanelRegisComp.setPreferredSize(new java.awt.Dimension(1050, 600));
        PanelRegisComp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnRegisComp.setBackground(new java.awt.Color(248, 248, 248));
        BtnRegisComp.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        BtnRegisComp.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegisComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Boton_morado2.png"))); // NOI18N
        BtnRegisComp.setText("Registrar");
        BtnRegisComp.setBorderPainted(false);
        BtnRegisComp.setContentAreaFilled(false);
        BtnRegisComp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegisComp.setFocusPainted(false);
        BtnRegisComp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnRegisComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegisCompActionPerformed(evt);
            }
        });
        PanelRegisComp.add(BtnRegisComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 250, 90));

        FieldPrecioCompra.setBackground(new java.awt.Color(232, 232, 232));
        FieldPrecioCompra.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldPrecioCompra.setForeground(new java.awt.Color(51, 51, 51));
        FieldPrecioCompra.setBorder(null);
        PanelRegisComp.add(FieldPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 180, -1));

        LabelPrecioCompra.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelPrecioCompra.setForeground(new java.awt.Color(0, 0, 0));
        LabelPrecioCompra.setText("Precio Compra");
        PanelRegisComp.add(LabelPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        Titulo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 30)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Registar Compra");
        PanelRegisComp.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        LineaDivisora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Linea001.png"))); // NOI18N
        PanelRegisComp.add(LineaDivisora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 870, 20));

        FondoText3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisComp.add(FondoText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        FieldCantidad.setBackground(new java.awt.Color(232, 232, 232));
        FieldCantidad.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldCantidad.setForeground(new java.awt.Color(51, 51, 51));
        FieldCantidad.setBorder(null);
        PanelRegisComp.add(FieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 180, -1));

        LabelCantidad.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelCantidad.setForeground(new java.awt.Color(0, 0, 0));
        LabelCantidad.setText("Cantidad");
        PanelRegisComp.add(LabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        FondoText7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisComp.add(FondoText7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        IdProducto.setBackground(new java.awt.Color(232, 232, 232));
        IdProducto.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        IdProducto.setForeground(new java.awt.Color(51, 51, 51));
        IdProducto.setBorder(null);
        PanelRegisComp.add(IdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 180, -1));

        FondoText9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisComp.add(FondoText9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, -1, -1));

        LabelCostoTotal1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelCostoTotal1.setForeground(new java.awt.Color(0, 0, 0));
        LabelCostoTotal1.setText("Id Producto");
        PanelRegisComp.add(LabelCostoTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        IdCompra.setBackground(new java.awt.Color(232, 232, 232));
        IdCompra.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        IdCompra.setForeground(new java.awt.Color(51, 51, 51));
        IdCompra.setBorder(null);
        PanelRegisComp.add(IdCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 180, -1));

        FondoText10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisComp.add(FondoText10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        LabelidCompra.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelidCompra.setForeground(new java.awt.Color(0, 0, 0));
        LabelidCompra.setText("Id Compra");
        PanelRegisComp.add(LabelidCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        cPonder.setEditable(false);
        cPonder.setBackground(new java.awt.Color(232, 232, 232));
        cPonder.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        cPonder.setForeground(new java.awt.Color(51, 51, 51));
        cPonder.setText("cPonder");
        cPonder.setBorder(null);
        PanelRegisComp.add(cPonder, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 180, -1));

        LabelFecha.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelFecha.setForeground(new java.awt.Color(0, 0, 0));
        LabelFecha.setText("Fecha Compra");
        PanelRegisComp.add(LabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        FieldFechaDia.setBackground(new java.awt.Color(232, 232, 232));
        FieldFechaDia.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldFechaDia.setForeground(new java.awt.Color(51, 51, 51));
        FieldFechaDia.setBorder(null);
        PanelRegisComp.add(FieldFechaDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 30, -1));

        FieldFechaMes.setBackground(new java.awt.Color(232, 232, 232));
        FieldFechaMes.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldFechaMes.setForeground(new java.awt.Color(51, 51, 51));
        FieldFechaMes.setBorder(null);
        PanelRegisComp.add(FieldFechaMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 30, -1));

        FieldFechaA??o.setBackground(new java.awt.Color(232, 232, 232));
        FieldFechaA??o.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldFechaA??o.setForeground(new java.awt.Color(51, 51, 51));
        FieldFechaA??o.setBorder(null);
        PanelRegisComp.add(FieldFechaA??o, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 50, -1));

        LabelD_M_A.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        LabelD_M_A.setForeground(new java.awt.Color(0, 0, 0));
        LabelD_M_A.setText("aaaa/mm/dd");
        PanelRegisComp.add(LabelD_M_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegisComp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegisComp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * No es posible modificar la linea de codigo siguiente.
    **/
    private void BtnRegisCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegisCompActionPerformed

    Connection con = null;

    try {

      con = getConection();

      String sql = "SELECT * FROM public.producto " + "WHERE id_producto = '" 
              + Integer.parseInt(IdProducto.getText()) + "'";
      ps4 = con.prepareStatement(sql);

      rs = ps4.executeQuery();

      if (rs.next()) {
        costo = rs.getInt("costo");
        existencia = rs.getString("existencias");
        nuevaExistencia = Integer.parseInt(existencia) + Integer.parseInt(FieldCantidad.getText());

        //Para Calcular cpp
        cantidad = Integer.parseInt(FieldCantidad.getText());
        costoNuevo = Integer.parseInt(FieldPrecioCompra.getText());
        existenciaOriginal = Integer.parseInt(existencia);
        cpp = Math.round(((existenciaOriginal * costo) 
                + (cantidad * costoNuevo)) / nuevaExistencia);

      } else {
        JOptionPane.showMessageDialog(null, "No existe un producto con ese codigo");
      }

      fecha = (FieldFechaA??o.getText() + "-" 
              + FieldFechaMes.getText() + "-" 
              + FieldFechaDia.getText());

      if (nuevaExistencia > 0) {

        ps = con.prepareStatement("INSERT INTO compra(id, id_producto," 
                + "cantidad, precio_compra," 
                + "fecha_compra) VALUES (?,?,?,?,?)");
        ps.setInt(1, Integer.parseInt(IdCompra.getText()));
        ps.setInt(2, Integer.parseInt(IdProducto.getText()));
        ps.setInt(3, Integer.parseInt(FieldCantidad.getText()));
        ps.setInt(4, Integer.parseInt(FieldPrecioCompra.getText()));
        ps.setString(5, fecha);

        res = ps.executeUpdate();

        ps3 = con.prepareStatement("UPDATE producto SET existencias = ?, costo_ponderado = ?" 
                + "where id_producto= " + Integer.parseInt(IdProducto.getText()) + "");
        ps3.setInt(1, nuevaExistencia);
        ps3.setInt(2, (int) cpp);

        int res4 = ps3.executeUpdate();

        if (res > 0 && res4 > 0) {
          JOptionPane.showMessageDialog(null, "Compra Exitosa");
        } else {
          JOptionPane.showMessageDialog(null, "Error al Guardar la Compra");
          //  System.out.println("Error al Guardar Producto");
        }

        con.close();
      }

    } catch (Exception e) {
      System.err.println(e);
    }
    
    /**
     * No es posible modificar la linea de codigo siguiente.
    **/
    }//GEN-LAST:event_BtnRegisCompActionPerformed

  /**
   * @param args the command line arguments.
  **/
  public static void main(String args[]) {

    GuiRegisCompra ventanaRegisCompra = new GuiRegisCompra();
    ventanaRegisCompra.setBounds(0, 0, 1050, 600);
    ventanaRegisCompra.setVisible(true);
    ventanaRegisCompra.setResizable(false);
    ventanaRegisCompra.setLocationRelativeTo(null);
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
                //  new GUI_Producto().setVisible(true);
          }
      }
    );
    
    /**
     * No es posible modificar la linea de codigo siguiente.
    **/
    }

    /**
     * No es posible modificar la linea de codigo siguiente.
    **/
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegisComp;
    private javax.swing.JTextField FieldCantidad;
    private javax.swing.JTextField FieldFechaA??o;
    private javax.swing.JTextField FieldFechaDia;
    private javax.swing.JTextField FieldFechaMes;
    private javax.swing.JTextField FieldPrecioCompra;
    private javax.swing.JLabel FondoText10;
    private javax.swing.JLabel FondoText3;
    private javax.swing.JLabel FondoText7;
    private javax.swing.JLabel FondoText9;
    private javax.swing.JTextField IdCompra;
    private javax.swing.JTextField IdProducto;
    private javax.swing.JLabel LabelCantidad;
    private javax.swing.JLabel LabelCostoTotal1;
    private javax.swing.JLabel LabelD_M_A;
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JLabel LabelPrecioCompra;
    private javax.swing.JLabel LabelidCompra;
    private javax.swing.JLabel LineaDivisora;
    public static javax.swing.JPanel PanelRegisComp;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField cPonder;
    // End of variables declaration//GEN-END:variables
}
