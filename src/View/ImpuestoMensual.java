/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author gplaza
 */
public class ImpuestoMensual extends javax.swing.JInternalFrame {

    /**
     * Creates new form ImpuestoMensual
     */
    public ImpuestoMensual() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblRut = new javax.swing.JLabel();
        boxMes = new javax.swing.JComboBox();
        boxAnio = new javax.swing.JComboBox();
        btnSeleccionar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBorder(null);
        setClosable(true);
        setTitle("Impuesto Mensual");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Razon Social :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel2.setText("Direccion :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        lblNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 340, 20));

        lblDireccion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 480, 20));

        jLabel3.setText("Run:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        lblRut.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 210, 20));

        boxMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        boxMes.setBorder(null);
        getContentPane().add(boxMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 120, 30));

        boxAnio.setBorder(null);
        getContentPane().add(boxAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, 100, 30));

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setBorder(new javax.swing.border.MatteBorder(null));
        btnSeleccionar.setMargin(new java.awt.Insets(5, 14, 5, 14));
        getContentPane().add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 120, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 1000, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxAnio;
    private javax.swing.JComboBox boxMes;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRut;
    // End of variables declaration//GEN-END:variables
}
