package estrella;

import static estrella.Conexion.getConection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class GUI_RegisVentaContado extends javax.swing.JFrame {

    public GUI_RegisVentaContado() {
        initComponents();
    }

    PreparedStatement ps, ps2, ps3, ps4;
    ResultSet rs;
    String existencia, fecha;
    int nuevaExistencia = 0, costo, costo1;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRegisVentContado = new javax.swing.JPanel();
        BtnRegisVent = new javax.swing.JButton();
        FieldCosto = new javax.swing.JTextField();
        FieldHora = new javax.swing.JTextField();
        LabelCostoTotal = new javax.swing.JLabel();
        LabelHora = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        LineaDivisora = new javax.swing.JLabel();
        FondoText3 = new javax.swing.JLabel();
        FondoText4 = new javax.swing.JLabel();
        LabelFecha = new javax.swing.JLabel();
        FieldCantidad = new javax.swing.JTextField();
        LabelCantidad = new javax.swing.JLabel();
        FondoText7 = new javax.swing.JLabel();
        IdProducto = new javax.swing.JTextField();
        estado = new javax.swing.JTextField();
        FondoText9 = new javax.swing.JLabel();
        LabelCostoTotal1 = new javax.swing.JLabel();
        IdVenta = new javax.swing.JTextField();
        FondoText10 = new javax.swing.JLabel();
        LabelidVenta = new javax.swing.JLabel();
        FieldFechaDia = new javax.swing.JTextField();
        FieldFechaMes = new javax.swing.JTextField();
        FieldFechaAño = new javax.swing.JTextField();
        LabelD_M_A = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelRegisVentContado.setBackground(new java.awt.Color(248, 248, 248));
        PanelRegisVentContado.setPreferredSize(new java.awt.Dimension(1050, 600));
        PanelRegisVentContado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnRegisVent.setBackground(new java.awt.Color(248, 248, 248));
        BtnRegisVent.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        BtnRegisVent.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegisVent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Boton_morado2.png"))); // NOI18N
        BtnRegisVent.setText("Registrar");
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
        PanelRegisVentContado.add(BtnRegisVent, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, 250, 90));

        FieldCosto.setEditable(false);
        FieldCosto.setBackground(new java.awt.Color(232, 232, 232));
        FieldCosto.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldCosto.setForeground(new java.awt.Color(51, 51, 51));
        FieldCosto.setBorder(null);
        PanelRegisVentContado.add(FieldCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 180, -1));

        FieldHora.setBackground(new java.awt.Color(232, 232, 232));
        FieldHora.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldHora.setForeground(new java.awt.Color(51, 51, 51));
        FieldHora.setBorder(null);
        PanelRegisVentContado.add(FieldHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 180, -1));

        LabelCostoTotal.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelCostoTotal.setText("Costo Total");
        PanelRegisVentContado.add(LabelCostoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        LabelHora.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelHora.setText("Hora de la Venta");
        PanelRegisVentContado.add(LabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        Titulo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 30)); // NOI18N
        Titulo.setText("Registar Venta");
        PanelRegisVentContado.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        LineaDivisora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Linea001.png"))); // NOI18N
        PanelRegisVentContado.add(LineaDivisora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 870, 20));

        FondoText3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisVentContado.add(FondoText3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        FondoText4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisVentContado.add(FondoText4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        LabelFecha.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelFecha.setText("Fecha de la Venta");
        PanelRegisVentContado.add(LabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        FieldCantidad.setBackground(new java.awt.Color(232, 232, 232));
        FieldCantidad.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldCantidad.setForeground(new java.awt.Color(51, 51, 51));
        FieldCantidad.setBorder(null);
        FieldCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FieldCantidadKeyReleased(evt);
            }
        });
        PanelRegisVentContado.add(FieldCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 180, -1));

        LabelCantidad.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelCantidad.setText("Cantidad");
        PanelRegisVentContado.add(LabelCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        FondoText7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisVentContado.add(FondoText7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, -1, -1));

        IdProducto.setBackground(new java.awt.Color(232, 232, 232));
        IdProducto.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        IdProducto.setForeground(new java.awt.Color(51, 51, 51));
        IdProducto.setBorder(null);
        PanelRegisVentContado.add(IdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 180, -1));

        estado.setBackground(new java.awt.Color(232, 232, 232));
        estado.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        estado.setForeground(new java.awt.Color(51, 51, 51));
        estado.setText("Activo");
        estado.setBorder(null);
        PanelRegisVentContado.add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 180, -1));

        FondoText9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisVentContado.add(FondoText9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        LabelCostoTotal1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelCostoTotal1.setText("Id Producto");
        PanelRegisVentContado.add(LabelCostoTotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        IdVenta.setBackground(new java.awt.Color(232, 232, 232));
        IdVenta.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        IdVenta.setForeground(new java.awt.Color(51, 51, 51));
        IdVenta.setBorder(null);
        PanelRegisVentContado.add(IdVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 180, -1));

        FondoText10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CampoDeText.png"))); // NOI18N
        PanelRegisVentContado.add(FondoText10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        LabelidVenta.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelidVenta.setText("Id Venta");
        PanelRegisVentContado.add(LabelidVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, -1, -1));

        FieldFechaDia.setBackground(new java.awt.Color(232, 232, 232));
        FieldFechaDia.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldFechaDia.setForeground(new java.awt.Color(51, 51, 51));
        FieldFechaDia.setBorder(null);
        PanelRegisVentContado.add(FieldFechaDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 30, -1));

        FieldFechaMes.setBackground(new java.awt.Color(232, 232, 232));
        FieldFechaMes.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldFechaMes.setForeground(new java.awt.Color(51, 51, 51));
        FieldFechaMes.setBorder(null);
        PanelRegisVentContado.add(FieldFechaMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 30, -1));

        FieldFechaAño.setBackground(new java.awt.Color(232, 232, 232));
        FieldFechaAño.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        FieldFechaAño.setForeground(new java.awt.Color(51, 51, 51));
        FieldFechaAño.setBorder(null);
        PanelRegisVentContado.add(FieldFechaAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 50, -1));

        LabelD_M_A.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        LabelD_M_A.setForeground(new java.awt.Color(0, 0, 0));
        LabelD_M_A.setText("dd - mm - aaa");
        PanelRegisVentContado.add(LabelD_M_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegisVentContado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRegisVentContado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegisVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegisVentActionPerformed

        Connection con = null;

        try {

            con = getConection();

            String sql = "SELECT * FROM public.producto " + "WHERE id_producto = '" + Integer.parseInt(IdProducto.getText()) + "'";
            ps4 = con.prepareStatement(sql);

            rs = ps4.executeQuery();

            if (rs.next()) {
                costo = rs.getInt("costo");
                existencia = rs.getString("existencias");
                nuevaExistencia = Integer.parseInt(existencia) - Integer.parseInt(FieldCantidad.getText());
            } else {
                JOptionPane.showMessageDialog(null, "No existe el producto");
            }
            
            fecha = (FieldFechaDia.getText() + " - " + FieldFechaMes.getText() + " - " + FieldFechaAño.getText());

            if (nuevaExistencia > 0) {

                costo *= Integer.parseInt(FieldCantidad.getText());
                FieldCosto.setText(String.valueOf(costo));
                ps = con.prepareStatement("INSERT INTO ventas(codigo, cantidad, costo_total, estado, hora, fecha) VALUES (?,?,?,?,?,?)");
                ps.setInt(1, Integer.parseInt(IdVenta.getText()));
                ps.setInt(2, Integer.parseInt(FieldCantidad.getText()));
                ps.setInt(3, costo);
                ps.setString(4, estado.getText());
              //  ps.setInt(5, Integer.parseInt(FieldIdCliente.getText()));
                ps.setString(5, FieldHora.getText());
                ps.setString(6, fecha);

                int res = ps.executeUpdate();

                ps2 = con.prepareStatement("INSERT INTO producto_ventas(id_producto, codigo_venta) VALUES (?,?)");
                ps2.setInt(1, Integer.parseInt(IdProducto.getText()));
                ps2.setInt(2, Integer.parseInt(IdVenta.getText()));

                int res2 = ps2.executeUpdate();

                ps3 = con.prepareStatement("UPDATE producto SET existencias = ?  where id_producto= " + Integer.parseInt(IdProducto.getText()) + "");
                ps3.setInt(1, nuevaExistencia);

                int res4 = ps3.executeUpdate();

                if (res > 0 && res2 > 0 && res4 > 0) {
                    JOptionPane.showMessageDialog(null, "Venta Exitosa");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Guardar la Venta");
                    //  System.out.println("Error al Guardar Producto");
                }

                con.close();
            } else {
                JOptionPane.showMessageDialog(null, "La cantidad a vender es mayor que la cantidad en stock \n La cantidad disponible en stock es de " + existencia);
            }

        } catch (Exception e) {
            System.err.println(e);
        }

        // Opcion para imprimir la factura
        int seleccion = JOptionPane.showOptionDialog(
                null,
                "¿Desea guardar la factura?",
                "Facturación",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, // null para icono por defecto.
                new Object[]{"Sí", "No"}, // null para YES, NO y CANCEL
                "opcion 1");

        if (seleccion == 0) {
            System.out.println("Guardar");
        } else {

            System.out.println("No Guardar");
        }
    }//GEN-LAST:event_BtnRegisVentActionPerformed

    private void FieldCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FieldCantidadKeyReleased
        // TODO add your handling code here:
        Connection con = null;

        if (FieldCantidad.getText().isEmpty()) {

        } else {

            try {

                con = getConection();

                String sql = "SELECT * FROM public.producto " + "WHERE id_producto = '" + Integer.parseInt(IdProducto.getText()) + "'";
                ps4 = con.prepareStatement(sql);

                rs = ps4.executeQuery();

                if (rs.next()) {
                    costo1 = rs.getInt("costo");
                    costo1 *= Integer.parseInt(FieldCantidad.getText());
                    FieldCosto.setText(String.valueOf(costo1));

                } else {
                    JOptionPane.showMessageDialog(null, "No existe el producto");
                }

            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_FieldCantidadKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        GUI_RegisVentaContado ventanaRegisVentaContado = new GUI_RegisVentaContado();
        ventanaRegisVentaContado.setBounds(0, 0, 1050, 600);
        ventanaRegisVentaContado.setVisible(true);
        ventanaRegisVentaContado.setResizable(false);
        ventanaRegisVentaContado.setLocationRelativeTo(null);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //  new GUI_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegisVent;
    private javax.swing.JTextField FieldCantidad;
    private javax.swing.JTextField FieldCosto;
    private javax.swing.JTextField FieldFechaAño;
    private javax.swing.JTextField FieldFechaDia;
    private javax.swing.JTextField FieldFechaMes;
    private javax.swing.JTextField FieldHora;
    private javax.swing.JLabel FondoText10;
    private javax.swing.JLabel FondoText3;
    private javax.swing.JLabel FondoText4;
    private javax.swing.JLabel FondoText7;
    private javax.swing.JLabel FondoText9;
    private javax.swing.JTextField IdProducto;
    private javax.swing.JTextField IdVenta;
    private javax.swing.JLabel LabelCantidad;
    private javax.swing.JLabel LabelCostoTotal;
    private javax.swing.JLabel LabelCostoTotal1;
    private javax.swing.JLabel LabelD_M_A;
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JLabel LabelidVenta;
    private javax.swing.JLabel LineaDivisora;
    public static javax.swing.JPanel PanelRegisVentContado;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField estado;
    // End of variables declaration//GEN-END:variables
}
