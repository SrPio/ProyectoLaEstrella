package estrella;

import static estrella.Conexion.getConection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class GuiModiCliente extends javax.swing.JFrame {

  public static String campo = "";

  public GuiModiCliente() {
    initComponents();
  }

  PreparedStatement ps;
  PreparedStatement ps2;
  ResultSet rs;

  /**
  * This method is called from within the constructor to initialize the form.
  * WARNING: Do NOT modify this code. The content of this method is always
  * regenerated by the Form Editor.
  */
  @SuppressWarnings("unchecked")
    /**
    *  No es posible modificar las lineas de codigo dentro del metodo initComponents.
    **/
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelModifClient = new javax.swing.JPanel();
        Labelid_client = new javax.swing.JLabel();
        BtnModifiClient = new javax.swing.JButton();
        FiledId_client = new javax.swing.JTextField();
        FieldApellido = new javax.swing.JTextField();
        FieldDeuda = new javax.swing.JTextField();
        FieldNombre = new javax.swing.JTextField();
        FieldTelefono = new javax.swing.JTextField();
        LabelNombre = new javax.swing.JLabel();
        LabelApellido = new javax.swing.JLabel();
        LabelDeuda = new javax.swing.JLabel();
        LabelTelefono = new javax.swing.JLabel();
        FondoText1 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        LineaDivisora = new javax.swing.JLabel();
        FondoText2 = new javax.swing.JLabel();
        FondoText3 = new javax.swing.JLabel();
        FondoText4 = new javax.swing.JLabel();
        FondoText5 = new javax.swing.JLabel();
        LabelDireccion = new javax.swing.JLabel();
        BtnBuscarProd = new javax.swing.JButton();
        FieldDireccion = new javax.swing.JTextField();
        FondoText6 = new javax.swing.JLabel();
        LabelBusqueda = new javax.swing.JLabel();
        BuscarProdu = new javax.swing.JTextField();
        FondoText10 = new javax.swing.JLabel();
        LineaDivisora2 = new javax.swing.JLabel();
        txt_Id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelModifClient.setBackground(new java.awt.Color(248, 248, 248));
        PanelModifClient.setPreferredSize(new java.awt.Dimension(1050, 600));
        PanelModifClient.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Labelid_client.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        Labelid_client.setText("Id Cliente");
        PanelModifClient.add(Labelid_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        BtnModifiClient.setBackground(new java.awt.Color(248, 248, 248));
        BtnModifiClient.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        BtnModifiClient.setForeground(new java.awt.Color(255, 255, 255));
        BtnModifiClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Boton_morado2.png"))); // NOI18N
        BtnModifiClient.setText("Modificar");
        BtnModifiClient.setBorderPainted(false);
        BtnModifiClient.setContentAreaFilled(false);
        BtnModifiClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnModifiClient.setFocusPainted(false);
        BtnModifiClient.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnModifiClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModifiClientActionPerformed(evt);
            }
        });
        PanelModifClient.add(BtnModifiClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 250, 90));

        FiledId_client.setEditable(false);
        FiledId_client.setBackground(new java.awt.Color(232, 232, 232));
        FiledId_client.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FiledId_client.setForeground(new java.awt.Color(51, 51, 51));
        FiledId_client.setBorder(null);
        PanelModifClient.add(FiledId_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 180, -1));

        FieldApellido.setBackground(new java.awt.Color(232, 232, 232));
        FieldApellido.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldApellido.setForeground(new java.awt.Color(51, 51, 51));
        FieldApellido.setBorder(null);
        PanelModifClient.add(FieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 180, -1));

        FieldDeuda.setBackground(new java.awt.Color(232, 232, 232));
        FieldDeuda.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldDeuda.setForeground(new java.awt.Color(51, 51, 51));
        FieldDeuda.setBorder(null);
        PanelModifClient.add(FieldDeuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 180, -1));

        FieldNombre.setBackground(new java.awt.Color(232, 232, 232));
        FieldNombre.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldNombre.setForeground(new java.awt.Color(51, 51, 51));
        FieldNombre.setBorder(null);
        PanelModifClient.add(FieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 180, -1));

        FieldTelefono.setBackground(new java.awt.Color(232, 232, 232));
        FieldTelefono.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldTelefono.setForeground(new java.awt.Color(51, 51, 51));
        FieldTelefono.setBorder(null);
        PanelModifClient.add(FieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 180, -1));

        LabelNombre.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelNombre.setText("Nombre");
        PanelModifClient.add(LabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        LabelApellido.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelApellido.setText("Apellido");
        PanelModifClient.add(LabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        LabelDeuda.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelDeuda.setText("Deuda");
        PanelModifClient.add(LabelDeuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        LabelTelefono.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelTelefono.setText("Telefono");
        PanelModifClient.add(LabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, -1, -1));

        FondoText1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelModifClient.add(FondoText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        Titulo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 30)); // NOI18N
        Titulo.setText("Modificar Cliente");
        PanelModifClient.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        LineaDivisora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Linea001.png"))); // NOI18N
        PanelModifClient.add(LineaDivisora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 870, 20));

        FondoText2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelModifClient.add(FondoText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        FondoText3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelModifClient.add(FondoText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        FondoText4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelModifClient.add(FondoText4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, -1, -1));

        FondoText5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelModifClient.add(FondoText5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, -1));

        LabelDireccion.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelDireccion.setText("Direccion");
        PanelModifClient.add(LabelDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, -1));

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
        PanelModifClient.add(BtnBuscarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        FieldDireccion.setBackground(new java.awt.Color(232, 232, 232));
        FieldDireccion.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldDireccion.setForeground(new java.awt.Color(51, 51, 51));
        FieldDireccion.setBorder(null);
        PanelModifClient.add(FieldDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 180, -1));

        FondoText6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelModifClient.add(FondoText6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, -1));

        LabelBusqueda.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelBusqueda.setText("Buscar Id del cliente:");
        PanelModifClient.add(LabelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        BuscarProdu.setBackground(new java.awt.Color(232, 232, 232));
        BuscarProdu.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        BuscarProdu.setForeground(new java.awt.Color(51, 51, 51));
        BuscarProdu.setBorder(null);
        PanelModifClient.add(BuscarProdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 160, -1));

        FondoText10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search Bar.png"))); // NOI18N
        PanelModifClient.add(FondoText10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        LineaDivisora2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Linea001.png"))); // NOI18N
        PanelModifClient.add(LineaDivisora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 870, 20));

        txt_Id.setEditable(false);
        PanelModifClient.add(txt_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelModifClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelModifClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    *  No es posible modificar la linea de codigo siguiente.
    **/
    private void BtnModifiClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifiClientActionPerformed

    //Funcion Costo promedio Ponderado
    Connection con = null;

    try {

      con = getConection();
      ps = con.prepareStatement("UPDATE cliente SET nombre=?, apellido=?, telefono=?,"
              + " deuda=?, direccion=? WHERE id_cliente=?");
            
      ps.setString(1, FieldNombre.getText());
      ps.setString(2, FieldApellido.getText());
      ps.setString(3, FieldTelefono.getText());
      ps.setInt(4, Integer.parseInt(FieldDeuda.getText()));
      ps.setString(5, FieldDireccion.getText());
      ps.setInt(6, Integer.parseInt(txt_Id.getText()));

      int res = ps.executeUpdate();

      if (res > 0) {
        JOptionPane.showMessageDialog(null, "Cliente Modificado");
      } else {
        JOptionPane.showMessageDialog(null, "Error al Modificar Cliente");
      }

      con.close();

    } catch (Exception e) {
      System.err.println(e);
    }
    /**
    *  No es posible modificar la linea de codigo siguiente.
    **/
    }//GEN-LAST:event_BtnModifiClientActionPerformed

    /**
    *  No es posible modificar la linea de codigo siguiente.
    **/
    private void BtnBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarProdActionPerformed

    Connection con = null;

    campo = BuscarProdu.getText();
    String where = "";
    if (!"".equals(campo)) {
      where = "WHERE id_cliente = '" + campo + "'";
    }

    try {

      con = getConection();
      String sql = "SELECT * FROM public.cliente " + where;
      ps = con.prepareStatement(sql);

      rs = ps.executeQuery();

      if (rs.next()) {
        FiledId_client.setText(rs.getString("id_cliente"));
        FieldNombre.setText(rs.getString("nombre"));
        FieldApellido.setText(rs.getString("apellido"));
        FieldTelefono.setText(rs.getString("telefono"));
        FieldDeuda.setText(rs.getString("deuda"));
        FieldDireccion.setText(rs.getString("direccion"));


        txt_Id.setText(FiledId_client.getText());

      } else {
        JOptionPane.showMessageDialog(null, "No existe una persona"
            + " con ese Documento de Identidad");
      }

    } catch (Exception e) {
      System.err.println(e);
    }
    /**
    *  No es posible modificar la linea de codigo siguiente.
    **/
    }//GEN-LAST:event_BtnBuscarProdActionPerformed

  /**
  * @param args the command line arguments.
  **/
  public static void main(String args[]) {

    GuiModiCliente ventanaModiCliente = new GuiModiCliente();
    ventanaModiCliente.setBounds(0, 0, 1050, 600);
    ventanaModiCliente.setVisible(true);
    ventanaModiCliente.setResizable(false);
    ventanaModiCliente.setLocationRelativeTo(null);
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
    private javax.swing.JButton BtnBuscarProd;
    private javax.swing.JButton BtnModifiClient;
    private javax.swing.JTextField BuscarProdu;
    private javax.swing.JTextField FieldApellido;
    private javax.swing.JTextField FieldDeuda;
    private javax.swing.JTextField FieldDireccion;
    private javax.swing.JTextField FieldNombre;
    private javax.swing.JTextField FieldTelefono;
    private javax.swing.JTextField FiledId_client;
    private javax.swing.JLabel FondoText1;
    private javax.swing.JLabel FondoText10;
    private javax.swing.JLabel FondoText2;
    private javax.swing.JLabel FondoText3;
    private javax.swing.JLabel FondoText4;
    private javax.swing.JLabel FondoText5;
    private javax.swing.JLabel FondoText6;
    private javax.swing.JLabel LabelApellido;
    private javax.swing.JLabel LabelBusqueda;
    private javax.swing.JLabel LabelDeuda;
    private javax.swing.JLabel LabelDireccion;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JLabel Labelid_client;
    private javax.swing.JLabel LineaDivisora;
    private javax.swing.JLabel LineaDivisora2;
    public static javax.swing.JPanel PanelModifClient;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField txt_Id;
    // End of variables declaration//GEN-END:variables
}