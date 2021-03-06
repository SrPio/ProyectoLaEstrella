package estrella;

import static estrella.Conexion.getConection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUI_RepoCostos extends javax.swing.JFrame {

    public static String campo = "";
    public static String Id_guardado = "";

    public GUI_RepoCostos() {
        initComponents();
    }

    PreparedStatement ps;
    ResultSet rs;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRepoCostos = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        LineaDivisora = new javax.swing.JLabel();
        BtnBuscarProd = new javax.swing.JButton();
        BuscarProdu = new javax.swing.JTextField();
        FondoText10 = new javax.swing.JLabel();
        LabelBusqueda = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboBusqueda = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableRepoCost = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        CampoGuarda_IdProd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelRepoCostos.setBackground(new java.awt.Color(248, 248, 248));
        PanelRepoCostos.setPreferredSize(new java.awt.Dimension(1050, 600));
        PanelRepoCostos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 30)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Reporte de Costos");
        PanelRepoCostos.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        LineaDivisora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Linea001.png"))); // NOI18N
        PanelRepoCostos.add(LineaDivisora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 870, 20));

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
        PanelRepoCostos.add(BtnBuscarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        BuscarProdu.setBackground(new java.awt.Color(232, 232, 232));
        BuscarProdu.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        BuscarProdu.setForeground(new java.awt.Color(51, 51, 51));
        BuscarProdu.setBorder(null);
        PanelRepoCostos.add(BuscarProdu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 170, -1));

        FondoText10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search Bar.png"))); // NOI18N
        PanelRepoCostos.add(FondoText10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        LabelBusqueda.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        LabelBusqueda.setForeground(new java.awt.Color(0, 0, 0));
        LabelBusqueda.setText("Buscar:");
        PanelRepoCostos.add(LabelBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Buscar por:");
        PanelRepoCostos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, -1, -1));

        comboBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "Mes", "Semana" }));
        comboBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBusquedaActionPerformed(evt);
            }
        });
        PanelRepoCostos.add(comboBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, -1, -1));

        tableRepoCost.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "categoria", "cantidad", "precio_compra", "costo_ponderado", "precio_venta", "fecha_compra"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableRepoCost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRepoCostMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableRepoCost);

        PanelRepoCostos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 880, 250));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("SI DESEA VER TODOS LOS DATOS REGISTRADOS, DEJE LA BARRA DE BUSQUEDA EN BLANCO.");
        PanelRepoCostos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        CampoGuarda_IdProd.setEditable(false);
        CampoGuarda_IdProd.setBackground(new java.awt.Color(232, 232, 232));
        CampoGuarda_IdProd.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        CampoGuarda_IdProd.setForeground(new java.awt.Color(51, 51, 51));
        CampoGuarda_IdProd.setText("0");
        CampoGuarda_IdProd.setBorder(null);
        PanelRepoCostos.add(CampoGuarda_IdProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRepoCostos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelRepoCostos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarProdActionPerformed

        Connection con = null;

        if ((comboBusqueda.getSelectedItem().toString()).equals("Dia")) {

            campo = BuscarProdu.getText();
            String where = "";
            if (!"".equals(campo)) {
                where = "WHERE compra.fecha_compra LIKE '%" + campo + "'";
            }

            try {
                DefaultTableModel modelo = new DefaultTableModel();
                tableRepoCost.setModel(modelo);

                PreparedStatement ps = null;
                ResultSet rs = null;
                con = getConection();

                String sql = "SELECT producto.categoria, compra.cantidad, compra.precio_compra, \n"
                        + "producto.costo_ponderado, producto.precio_venta, compra.fecha_compra FROM producto\n"
                        + "INNER JOIN compra ON producto.id_producto=compra.id_producto " + where;
                System.out.println(sql);
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
                int cantidadColumnas = rsMd.getColumnCount();

                modelo.addColumn("categoria");
                modelo.addColumn("cantidad");
                modelo.addColumn("precio_compra");
                modelo.addColumn("costo_ponderado");
                modelo.addColumn("precio_venta");
                modelo.addColumn("fecha_compra");

                int[] anchos = {50, 50, 50, 50, 50, 50};
                for (int i = 0; i < tableRepoCost.getColumnCount(); i++) {
                    tableRepoCost.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
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
        } else if ((comboBusqueda.getSelectedItem().toString()).equals("Mes")) {

            campo = BuscarProdu.getText();
            String where = "";
            if (!"".equals(campo)) {
                where = "WHERE compra.fecha_compra LIKE '%" + campo + "%'";
            }

            try {
                DefaultTableModel modelo = new DefaultTableModel();
                tableRepoCost.setModel(modelo);

                PreparedStatement ps = null;
                ResultSet rs = null;
                con = getConection();

                String sql = "SELECT producto.categoria, compra.cantidad, compra.precio_compra, \n"
                        + "producto.costo_ponderado, producto.precio_venta, compra.fecha_compra FROM producto\n"
                        + "INNER JOIN compra ON producto.id_producto=compra.id_producto " + where;
                System.out.println(sql);
                ps = con.prepareStatement(sql);
                rs = ps.executeQuery();

                ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
                int cantidadColumnas = rsMd.getColumnCount();

                modelo.addColumn("categoria");
                modelo.addColumn("cantidad");
                modelo.addColumn("precio_compra");
                modelo.addColumn("costo_ponderado");
                modelo.addColumn("precio_venta");
                modelo.addColumn("fecha_compra");

                int[] anchos = {50, 50, 50, 50, 50, 50};
                for (int i = 0; i < tableRepoCost.getColumnCount(); i++) {
                    tableRepoCost.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
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

    }//GEN-LAST:event_BtnBuscarProdActionPerformed

    private void comboBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBusquedaActionPerformed

    private void tableRepoCostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRepoCostMouseClicked

        int selection = tableRepoCost.rowAtPoint(evt.getPoint());
        CampoGuarda_IdProd.setText(String.valueOf(tableRepoCost.getValueAt(selection, 0)));
    }//GEN-LAST:event_tableRepoCostMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        GUI_RepoCostos ventanaRepoCostos = new GUI_RepoCostos();
        ventanaRepoCostos.setBounds(0, 0, 1050, 600);
        ventanaRepoCostos.setVisible(true);
        ventanaRepoCostos.setResizable(false);
        ventanaRepoCostos.setLocationRelativeTo(null);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //  new GUI_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarProd;
    private javax.swing.JTextField BuscarProdu;
    private javax.swing.JTextField CampoGuarda_IdProd;
    private javax.swing.JLabel FondoText10;
    private javax.swing.JLabel LabelBusqueda;
    private javax.swing.JLabel LineaDivisora;
    public static javax.swing.JPanel PanelRepoCostos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JComboBox<String> comboBusqueda;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableRepoCost;
    // End of variables declaration//GEN-END:variables
}
