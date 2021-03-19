/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estrella;

import static estrella.GUI_ConsulProd.PanelConsulPro;
import static estrella.GUI_ModiProducto.PanelModiProduct;
import static estrella.GUI_RegisProducto.PanelRegisPro;

import java.awt.BorderLayout;

/**
 * @author Andres.
**/
public class GuiProducto extends javax.swing.JFrame {

  /**
   * Creates new form GuiProducto.
  **/
  public GuiProducto() {
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

        PanelProduct = new javax.swing.JPanel();
        BotonFindProd = new javax.swing.JButton();
        BotonAddProd = new javax.swing.JButton();
        BotonModProdu = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        LineaDivisora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelProduct.setBackground(new java.awt.Color(248, 248, 248));
        PanelProduct.setPreferredSize(new java.awt.Dimension(1050, 600));

        BotonFindProd.setBackground(new java.awt.Color(248, 248, 248));
        BotonFindProd.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        BotonFindProd.setForeground(new java.awt.Color(255, 255, 255));
        BotonFindProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BotonM001.png"))); // NOI18N
        BotonFindProd.setText("Buscar Producto");
        BotonFindProd.setBorderPainted(false);
        BotonFindProd.setContentAreaFilled(false);
        BotonFindProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonFindProd.setFocusPainted(false);
        BotonFindProd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonFindProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFindProdActionPerformed(evt);
            }
        });

        BotonAddProd.setBackground(new java.awt.Color(248, 248, 248));
        BotonAddProd.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        BotonAddProd.setForeground(new java.awt.Color(255, 255, 255));
        BotonAddProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BotonM002.png"))); // NOI18N
        BotonAddProd.setText("Agregar Producto");
        BotonAddProd.setBorderPainted(false);
        BotonAddProd.setContentAreaFilled(false);
        BotonAddProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAddProd.setFocusPainted(false);
        BotonAddProd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonAddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAddProdActionPerformed(evt);
            }
        });

        BotonModProdu.setBackground(new java.awt.Color(248, 248, 248));
        BotonModProdu.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        BotonModProdu.setForeground(new java.awt.Color(255, 255, 255));
        BotonModProdu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BotonM003.png"))); // NOI18N
        BotonModProdu.setText("Modificar Producto");
        BotonModProdu.setBorderPainted(false);
        BotonModProdu.setContentAreaFilled(false);
        BotonModProdu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonModProdu.setFocusPainted(false);
        BotonModProdu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonModProdu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModProduActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Microsoft JhengHei", 1, 30)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Producto");

        LineaDivisora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Linea001.png"))); // NOI18N

        javax.swing.GroupLayout PanelProductLayout = new javax.swing.GroupLayout(PanelProduct);
        PanelProduct.setLayout(PanelProductLayout);
        PanelProductLayout.setHorizontalGroup(
            PanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProductLayout.createSequentialGroup()
                .addGroup(PanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelProductLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(PanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LineaDivisora, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Titulo)))
                    .addGroup(PanelProductLayout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addGroup(PanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonFindProd, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonAddProd, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonModProdu, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(90, 90, 90))
        );
        PanelProductLayout.setVerticalGroup(
            PanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProductLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelProductLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(LineaDivisora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Titulo))
                .addGap(52, 52, 52)
                .addComponent(BotonFindProd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonAddProd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonModProdu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * No es posible modificar la linea de codigo siguiente.
    **/
    private void BotonFindProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFindProdActionPerformed

    GUI_ConsulProd ventanaConsulProdu = new GUI_ConsulProd();
    ventanaConsulProdu.setSize(1050, 600);
    ventanaConsulProdu.setLocation(0,0);

    PanelProduct.removeAll();
    PanelProduct.add(PanelConsulPro, BorderLayout.CENTER);
    PanelProduct.revalidate();
    PanelProduct.repaint();
    
    /**
     * No es posible modificar la linea de codigo siguiente.
    **/
    }//GEN-LAST:event_BotonFindProdActionPerformed

    
    /**
     * No es posible modificar la linea de codigo siguiente.
    **/    
    private void BotonAddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAddProdActionPerformed

    GUI_RegisProducto ventanaRegisProd = new GUI_RegisProducto();
    ventanaRegisProd.setSize(1050, 600);
    ventanaRegisProd.setLocation(0,0);

    PanelProduct.removeAll();
    PanelProduct.add(PanelRegisPro, BorderLayout.CENTER);
    PanelProduct.revalidate();
    PanelProduct.repaint();
    
    /**
     * No es posible modificar la linea de codigo siguiente.
    **/
    }//GEN-LAST:event_BotonAddProdActionPerformed

    /**
     * No es posible modificar la linea de codigo siguiente.
    **/
    private void BotonModProduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModProduActionPerformed

    GUI_ModiProducto ventanaModiProd = new GUI_ModiProducto();
    ventanaModiProd.setSize(1050, 600);
    ventanaModiProd.setLocation(0,0);

    PanelProduct.removeAll();
    PanelProduct.add(PanelModiProduct, BorderLayout.CENTER);
    PanelProduct.revalidate();
    PanelProduct.repaint();
    
    /**
     * No es posible modificar la linea de codigo siguiente.
    **/
    }//GEN-LAST:event_BotonModProduActionPerformed

  /**
   * @param args the command line arguments.
  **/
  public static void main(String args[]) {
        
    GuiProducto ventanaProd = new GuiProducto();
    ventanaProd.setBounds(0, 0, 1050, 600);
    ventanaProd.setVisible(true);
    ventanaProd.setResizable(false);
    ventanaProd.setLocationRelativeTo(null);
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new GuiProducto().setVisible(true);
          }
        }
    );
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAddProd;
    private javax.swing.JButton BotonFindProd;
    private javax.swing.JButton BotonModProdu;
    private javax.swing.JLabel LineaDivisora;
    public static javax.swing.JPanel PanelProduct;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}