/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Cliente;
import Model.ClienteDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author gplaza
 */
public class BuscarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form EditarCliente
     */
    public BuscarCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtGiro = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        boxComuna = new javax.swing.JComboBox();
        btnEliminar = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setTitle("Buscar Cliente/Empresa");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 226, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 120, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Buscar Cliente/Empresa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Run :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Razón social :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Giro :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Correo :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Telefono :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Direccion :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Comuna :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, -1, -1));
        getContentPane().add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 236, -1));

        txtNombre.setMaximumSize(new java.awt.Dimension(226, 226));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 380, -1));

        txtGiro.setMaximumSize(new java.awt.Dimension(226, 226));
        getContentPane().add(txtGiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 740, -1));

        txtCorreo.setMaximumSize(new java.awt.Dimension(226, 226));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 236, -1));

        txtTelefono.setMaximumSize(new java.awt.Dimension(150, 150));
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 371, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 413, -1));

        boxComuna.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(boxComuna, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, 226, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 230, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        ClienteDAO clDaos = new ClienteDAO();
        Cliente cl1s = new Cliente(txtRut.getText(), txtNombre.getText(),
                txtGiro.getText(), txtCorreo.getText(), Integer.parseInt(txtTelefono.getText()),
                txtDireccion.getText(), boxComuna.getSelectedItem().toString());
        clDaos.editarCliente(cl1s);
        txtRut.setText("");
        txtNombre.setText("");
        txtGiro.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        boxComuna.setSelectedIndex(0);
        txtRut.setEnabled(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtRut.setText("");
        txtNombre.setText("");
        txtGiro.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        boxComuna.setSelectedIndex(0);
        txtRut.setEnabled(true);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ClienteDAO clDao2 = new ClienteDAO();
        Cliente client = clDao2.mostrarCliente(txtRut.getText());
        txtRut.setText(client.getRut());
        txtRut.setEnabled(false);
        txtNombre.setText(client.getNombre());
        txtGiro.setText(client.getGiro());
        txtCorreo.setText(client.getEmail());
        txtTelefono.setText(String.valueOf(client.getFono()));
        txtDireccion.setText(client.getDireccion());
        boxComuna.setSelectedItem(client.getComuna());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "¿Realmente desea eliminar el registro?", "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == 0) {
            ClienteDAO clDao2 = new ClienteDAO();
            clDao2.eliminarCliente(txtRut.getText());
            txtRut.setEnabled(true);
            txtRut.setText("");
            txtNombre.setText("");
            txtGiro.setText("");
            txtCorreo.setText("");
            txtTelefono.setText("");
            txtDireccion.setText("");
            boxComuna.setSelectedItem(0);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxComuna;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtGiro;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
