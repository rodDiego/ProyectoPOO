/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;

/**
 *
 * @author drodr
 */
public class CrearUsuario extends javax.swing.JPanel {

    /**
     * Creates new form CrearUsuario
     */
    public CrearUsuario() {
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

        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblRut = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblNumeroCel = new javax.swing.JLabel();
        lblPremium = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtRut = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtNumeroCel = new javax.swing.JTextField();
        lblCrearUsuario = new javax.swing.JLabel();
        btnYes = new java.awt.Button();
        btnNO = new java.awt.Button();

        lblNombre.setText("Nombre");

        lblApellido.setText("Apellido");

        lblRut.setText("Rut");

        lblFechaNacimiento.setText("Fecha de nacimiento");

        lblCorreo.setText("Correo");

        lblNumeroCel.setText("Numero celular");

        lblPremium.setText("¿Quiere ser premium?");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        lblCrearUsuario.setText("Crear Usuario");

        btnYes.setLabel("SI");
        btnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesActionPerformed(evt);
            }
        });

        btnNO.setLabel("NO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFechaNacimiento)
                            .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRut, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumeroCel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPremium, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(btnNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addComponent(txtRut)
                            .addComponent(txtFechaNacimiento)
                            .addComponent(txtCorreo)
                            .addComponent(txtNumeroCel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(lblCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblCrearUsuario)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRut)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaNacimiento)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroCel)
                    .addComponent(txtNumeroCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPremium, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(89, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void btnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnYesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnNO;
    private java.awt.Button btnYes;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCrearUsuario;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumeroCel;
    private javax.swing.JLabel lblPremium;
    private javax.swing.JLabel lblRut;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroCel;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
