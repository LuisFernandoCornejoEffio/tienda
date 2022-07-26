/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.Formularios;

import Beans.bArticulo;
import Controller.ArticuloController;
import Models.mArticulo;

/**
 *
 * @author USUARIO
 */
public class frmArticulo extends javax.swing.JPanel {

    /**
     * Creates new form frmArticulo
     */
    bArticulo bArticulo = new bArticulo();
    mArticulo mArticulo = new mArticulo();
    public frmArticulo() {
        initComponents();
        ArticuloController articuloC = new ArticuloController(this, bArticulo, mArticulo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuTbl = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblArticulos = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        SelectBuscar = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        MenuTbl.getAccessibleContext().setAccessibleParent(tblArticulos);

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRODUCTOS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 250, 40));

        btnNuevo.setBackground(new java.awt.Color(0, 0, 102));
        btnNuevo.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("NUEVO");
        btnNuevo.setBorder(null);
        add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 50));

        tblArticulos.setBackground(new java.awt.Color(255, 255, 255));
        tblArticulos.setForeground(new java.awt.Color(0, 0, 0));
        tblArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "N°", "CODIGO", "NOMBRE", "STOCK", "PRECIO", "CATEGORIA", "DESCRIPCION", "ESTADO"
            }
        ));
        jScrollPane1.setViewportView(tblArticulos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 1210, 680));

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        txtBuscar.setBorder(null);
        add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 90, 350, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, 350, 10));

        SelectBuscar.setBackground(new java.awt.Color(255, 255, 255));
        SelectBuscar.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        SelectBuscar.setForeground(new java.awt.Color(0, 0, 0));
        SelectBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOMBRE", "CODIGO", "CATEGORIA" }));
        add(SelectBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 150, 40));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("BUSCAR:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 80, 40));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPopupMenu MenuTbl;
    public javax.swing.JComboBox<String> SelectBuscar;
    public javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable tblArticulos;
    public javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}