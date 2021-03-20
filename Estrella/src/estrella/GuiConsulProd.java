package estrella;

import static estrella.Conexion.getConection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GuiConsulProd extends javax.swing.JFrame {

  public static String campo = "";
  public static String Id_guardado = "";

  public GuiConsulProd() {
    initComponents();
  }

  PreparedStatement ps;
  ResultSet rs;

  /**
   * Los comentarios de esta función (linea 30 hasta linea 182) no se pueden
   * modificar ya que son autogenerados por netbeans en el formulario
   * de la interfaz gráfica.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelConsulPro = new javax.swing.JPanel();
        BtnModifiProd = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        LineaDivisora = new javax.swing.JLabel();
        BtnBuscarProd = new javax.swing.JButton();
        BuscarProdu = new javax.swing.JTextField();
        FondoText10 = new javax.swing.JLabel();
        LabelBusqueda = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBusqueda = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProducto = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        BtnDescontinuar = new javax.swing.JButton();
        CampoGuarda_IdProd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelConsulPro.setBackground(new java.awt.Color(248, 248, 248));
        PanelConsulPro.setPreferredSize(new java.awt.Dimension(1050, 600));
        PanelConsulPro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnModifiProd.setBackground(new java.awt.Color(248, 248, 248));
        BtnModifiProd.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        BtnModifiProd.setForeground(new java.awt.Color(255, 255, 255));
        BtnModifiProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Boton_morado2.png"))); // NOI18N
        BtnModifiProd.setText("Modificar");
        BtnModifiProd.setBorderPainted(false);
        BtnModifiProd.setContentAreaFilled(false);
        BtnModifiProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnModifiProd.setFocusPainted(false);
        BtnModifiProd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnModifiProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModifiProdActionPerformed(evt);
            }
        });
        PanelConsulPro.add(BtnModifiProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 250, 90));

        Titulo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 30)); // NOI18N
        Titulo.setText("Consultar Producto");
        PanelConsulPro.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        LineaDivisora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Linea001.png"))); // NOI18N
        PanelConsulPro.add(LineaDivisora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 870, 20));

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
        PanelConsulPro.add(BtnBuscarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        BuscarProdu.setBackground(new java.awt.Color(232, 232, 232));
        BuscarProdu.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        BuscarProdu.setForeground(new java.awt.Color(51, 51, 51));
        BuscarProdu.setBorder(null);
        PanelConsulPro.add(BuscarProdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 170, -1));

        FondoText10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search Bar.png"))); // NOI18N
        PanelConsulPro.add(FondoText10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        LabelBusqueda.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelBusqueda.setText("Buscar:");
        PanelConsulPro.add(LabelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel3.setText("Buscar por:");
        PanelConsulPro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        comboBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre" }));
        comboBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBusquedaActionPerformed(evt);
            }
        });
        PanelConsulPro.add(comboBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, -1, -1));

        tableProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_producto", "nombre_producto", "concepto", "costo", "existencias", "costo_ponderado", "precio_venta", "categoria", "estado", "fecha_caducidad", "fecha_aviso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableProducto);

        PanelConsulPro.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 880, 250));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel2.setText("SI DESEA VER TODOS LOS DATOS REGISTRADOS, DEJE LA BARRA DE BUSQUEDA EN BLANCO.");
        PanelConsulPro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        BtnDescontinuar.setBackground(new java.awt.Color(248, 248, 248));
        BtnDescontinuar.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        BtnDescontinuar.setForeground(new java.awt.Color(255, 255, 255));
        BtnDescontinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Boton_morado2.png"))); // NOI18N
        BtnDescontinuar.setText("Descontinuar");
        BtnDescontinuar.setBorderPainted(false);
        BtnDescontinuar.setContentAreaFilled(false);
        BtnDescontinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDescontinuar.setFocusPainted(false);
        BtnDescontinuar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnDescontinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDescontinuarActionPerformed(evt);
            }
        });
        PanelConsulPro.add(BtnDescontinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 250, 90));

        CampoGuarda_IdProd.setEditable(false);
        CampoGuarda_IdProd.setBackground(new java.awt.Color(232, 232, 232));
        CampoGuarda_IdProd.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        CampoGuarda_IdProd.setForeground(new java.awt.Color(51, 51, 51));
        CampoGuarda_IdProd.setText("0");
        CampoGuarda_IdProd.setBorder(null);
        PanelConsulPro.add(CampoGuarda_IdProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelConsulPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelConsulPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Los comentarios de la linea siguiente no se pueden modificar ya que
     * son autogenerados por netbeans en el formulario de la interfaz gráfica.
     */
    private void BtnModifiProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifiProdActionPerformed
    /**
     * Los comentarios de la linea siguiente no se pueden modificar ya que
     * son autogenerados por netbeans en el formulario de la interfaz gráfica.
     */
    }//GEN-LAST:event_BtnModifiProdActionPerformed

    /**
     * Los comentarios de la linea siguiente no se pueden modificar ya que
     * son autogenerados por netbeans en el formulario de la interfaz gráfica.
     */
    private void BtnBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarProdActionPerformed

    Connection con = null;

    if ((comboBusqueda.getSelectedItem().toString()).equals("Nombre")) {

      campo = BuscarProdu.getText();
      String where = "";
      if (!"".equals(campo)) {
        where = "WHERE nombre_producto LIKE '%" + campo + "%'";
      }

      try {
        DefaultTableModel modelo = new DefaultTableModel();
        tableProducto.setModel(modelo);

        ps = null;
        rs = null;
        con = getConection();

        String sql = "SELECT * FROM public.producto " + where;
        System.out.println(sql);
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();

        ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
        int cantidadColumnas = rsMd.getColumnCount();

        modelo.addColumn("id_producto");
        modelo.addColumn("nombre_producto");
        modelo.addColumn("concepto");
        modelo.addColumn("costo");
        modelo.addColumn("existencias");
        modelo.addColumn("costo_ponderado");
        modelo.addColumn("precio_venta");
        modelo.addColumn("categoria");
        modelo.addColumn("estado");
        modelo.addColumn("fecha_caducidad");
        modelo.addColumn("fecha_aviso");

        int[] anchos = {50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50};
        for (int i = 0; i < tableProducto.getColumnCount(); i++) {
          tableProducto.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

        while (rs.next()) {
          Object[] filas = new Object[cantidadColumnas];
          for (int i = 0; i < cantidadColumnas; i++) {
            filas[i] = rs.getObject(i + 1);
          }
          modelo.addRow(filas);
        }

      } catch (Exception ex) {
        System.err.println(ex.toString());
      }
      System.out.println(where);
    }
    
    /**
    * Los comentarios de la linea siguiente no se pueden modificar ya que
    * son autogenerados por netbeans en el formulario de la interfaz gráfica.
    */
    }//GEN-LAST:event_BtnBuscarProdActionPerformed

    /**
     * Los comentarios de las dos lineas siguientes no se pueden modificar ya que
     * son autogenerados por netbeans en el formulario de la interfaz gráfica.
     */
    private void comboBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBusquedaActionPerformed
    }//GEN-LAST:event_comboBusquedaActionPerformed

    /**
     * Los comentarios de las dos lineas siguientes no se pueden modificar ya que
     * son autogenerados por netbeans en el formulario de la interfaz gráfica.
     */
    private void BtnDescontinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDescontinuarActionPerformed

    Connection con = null;
    //Id_guardado = CampoGuarda_IdProd.getText();
    // System.out.println(Id_guardado);

    if (CampoGuarda_IdProd.getText().equals("0")) {

      System.out.println("Entré");
      JOptionPane.showMessageDialog(null, "Debe seleccionar una casilla de la tabla");

    } else {
      Id_guardado = CampoGuarda_IdProd.getText();
      String where = "";
      if (!"".equals(Id_guardado)) {
        where = "WHERE id_producto = '" + Id_guardado + "'";
      }

      try {

        con = getConection();
        ps = con.prepareStatement("UPDATE producto SET estado = 'Descontinuado'" + where);

        int res = ps.executeUpdate();

        if (res > 0) {
          JOptionPane.showMessageDialog(null, "Se descontinuó el producto");
        } else {
          JOptionPane.showMessageDialog(null, "Error al descontinuar el producto");
          //  System.out.println("Error al Guardar Producto");
        }

        con.close();

      } catch (Exception e) {
        System.err.println(e);
      }
    }
    
    /**
    * Los comentarios de la linea siguiente no se pueden modificar ya que
    * son autogenerados por netbeans en el formulario de la interfaz gráfica.
    */
    }//GEN-LAST:event_BtnDescontinuarActionPerformed

    /**
    * Los comentarios de la linea siguiente no se pueden modificar ya que
    * son autogenerados por netbeans en el formulario de la interfaz gráfica.
    */
    private void tableProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductoMouseClicked
    
    int selection = tableProducto.rowAtPoint(evt.getPoint());
    CampoGuarda_IdProd.setText(String.valueOf(tableProducto.getValueAt(selection, 0)));
    
    /**
    * Los comentarios de la linea siguiente no se pueden modificar ya que
    * son autogenerados por netbeans en el formulario de la interfaz gráfica.
    */
    }//GEN-LAST:event_tableProductoMouseClicked

  /**
  * Metodo main, aqui se instancia el objeto de tipo ventanaConsulProdu para que
  * sea visible.
  **/
  public static void main(String [] args) {

    GuiConsulProd ventanaConsulProdu = new GuiConsulProd();
    ventanaConsulProdu.setBounds(0, 0, 1050, 600);
    ventanaConsulProdu.setVisible(true);
    ventanaConsulProdu.setResizable(false);
    ventanaConsulProdu.setLocationRelativeTo(null);
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
    private javax.swing.JButton BtnDescontinuar;
    private javax.swing.JButton BtnModifiProd;
    private javax.swing.JTextField BuscarProdu;
    private javax.swing.JTextField CampoGuarda_IdProd;
    private javax.swing.JLabel FondoText10;
    private javax.swing.JLabel LabelBusqueda;
    private javax.swing.JLabel LineaDivisora;
    public static javax.swing.JPanel PanelConsulPro;
    private javax.swing.JLabel Titulo;
    private javax.swing.JComboBox<String> comboBusqueda;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableProducto;
    // End of variables declaration//GEN-END:variables
}