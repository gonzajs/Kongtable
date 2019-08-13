/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kongtable;

import View.CrearCliente;
import View.MostrarTodos;

/**
 *
 * @author gplaza
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        itemGuardar = new javax.swing.JMenuItem();
        mnuCliente = new javax.swing.JMenu();
        itemBuscarCliente = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemCrearCliente = new javax.swing.JMenuItem();
        itemEditarCliente = new javax.swing.JMenuItem();
        itemEliminarCliente = new javax.swing.JMenuItem();
        itemMostrarTodos = new javax.swing.JMenuItem();
        mnuLibroContable = new javax.swing.JMenu();
        itemImpuestoMensual = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        mnuArchivo.setText("Archivo");

        itemGuardar.setText("Guardar");
        mnuArchivo.add(itemGuardar);

        jMenuBar1.add(mnuArchivo);

        mnuCliente.setText("Cliente");

        itemBuscarCliente.setText("Buscar Cliente");
        mnuCliente.add(itemBuscarCliente);
        mnuCliente.add(jSeparator1);

        itemCrearCliente.setText("Crear Cliente");
        itemCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCrearClienteActionPerformed(evt);
            }
        });
        mnuCliente.add(itemCrearCliente);

        itemEditarCliente.setText("Editar Cliente");
        mnuCliente.add(itemEditarCliente);

        itemEliminarCliente.setText("Eliminar Cliente");
        mnuCliente.add(itemEliminarCliente);

        itemMostrarTodos.setText("Mostrar Todos");
        itemMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMostrarTodosActionPerformed(evt);
            }
        });
        mnuCliente.add(itemMostrarTodos);

        jMenuBar1.add(mnuCliente);

        mnuLibroContable.setText("Libro Contable");

        itemImpuestoMensual.setText("Impuesto Mensual");
        mnuLibroContable.add(itemImpuestoMensual);

        jMenuBar1.add(mnuLibroContable);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCrearClienteActionPerformed
        crearCliente = new CrearCliente();
        panel.removeAll();
        panel.repaint();
        panel.add(crearCliente);
        crearCliente.show();
    }//GEN-LAST:event_itemCrearClienteActionPerformed

    private void itemMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMostrarTodosActionPerformed
        mTodos = new MostrarTodos();
        panel.removeAll();
        panel.repaint();
        panel.add(mTodos);
        mTodos.show();
    }//GEN-LAST:event_itemMostrarTodosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    CrearCliente crearCliente;
    MostrarTodos mTodos;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemBuscarCliente;
    private javax.swing.JMenuItem itemCrearCliente;
    private javax.swing.JMenuItem itemEditarCliente;
    private javax.swing.JMenuItem itemEliminarCliente;
    private javax.swing.JMenuItem itemGuardar;
    private javax.swing.JMenuItem itemImpuestoMensual;
    private javax.swing.JMenuItem itemMostrarTodos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuCliente;
    private javax.swing.JMenu mnuLibroContable;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}