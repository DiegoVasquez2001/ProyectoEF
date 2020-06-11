/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Modelo.Conexion;
import com.mysql.jdbc.Connection; //librerias que se usaron
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */


public class FrmMantDeptos extends javax.swing.JInternalFrame {

    /** Creates new form FrmMantDeptos */
    public FrmMantDeptos() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMantPuesto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodDepto = new javax.swing.JTextField();
        txtNomDepto = new javax.swing.JTextField();
        txtEstadoDepto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnGenCod = new javax.swing.JButton();
        btnAlta = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        btnCambio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtBuscaxCod = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBuscaxNom = new javax.swing.JTextField();
        btnBuscarxCod = new javax.swing.JButton();
        btnBuscarxNom = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setTitle("Mantenimiento Departamentos");

        panelMantPuesto.setBackground(new java.awt.Color(51, 51, 51));
        panelMantPuesto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código Departamento:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre Departamento:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estado Departamento:");

        txtCodDepto.setEditable(false);
        txtCodDepto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtNomDepto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtEstadoDepto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MANTENIMIENTO DEPARTAMENTOS");

        btnGenCod.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnGenCod.setText("Generar Código");
        btnGenCod.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGenCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenCodActionPerformed(evt);
            }
        });

        btnAlta.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnAlta.setText("Alta");
        btnAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        btnBaja.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBaja.setText("Baja");
        btnBaja.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });

        btnCambio.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnCambio.setText("Cambio");
        btnCambio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buscar por Código:");

        txtBuscaxCod.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Buscar por Nombre:");

        txtBuscaxNom.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        btnBuscarxCod.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBuscarxCod.setText("Buscar");
        btnBuscarxCod.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarxCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarxCodActionPerformed(evt);
            }
        });

        btnBuscarxNom.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBuscarxNom.setText("Buscar");
        btnBuscarxNom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarxNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarxNomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMantPuestoLayout = new javax.swing.GroupLayout(panelMantPuesto);
        panelMantPuesto.setLayout(panelMantPuestoLayout);
        panelMantPuestoLayout.setHorizontalGroup(
            panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMantPuestoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(panelMantPuestoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(panelMantPuestoLayout.createSequentialGroup()
                        .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(47, 47, 47)
                        .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodDepto)
                            .addComponent(txtNomDepto)
                            .addComponent(txtEstadoDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGenCod))
                    .addGroup(panelMantPuestoLayout.createSequentialGroup()
                        .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(47, 47, 47)
                        .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBuscaxNom)
                            .addComponent(txtBuscaxCod, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarxCod, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarxNom, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelMantPuestoLayout.setVerticalGroup(
            panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMantPuestoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEstadoDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlta)
                    .addComponent(btnBaja)
                    .addComponent(btnCambio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBuscaxCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarxCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBuscaxNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarxNom))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMantPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMantPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Conexion con = new Conexion();
    Connection cn = con.getConexion();
    private void btnGenCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenCodActionPerformed
        String validacion;
        Random random = new Random();
        int valorRandom = random.nextInt(9999)+1;
        validacion=txtNomDepto.getText();
        if(validacion.equals("")){
            JOptionPane.showMessageDialog(null, "Por Favor, ingrese un nombre para el Departamento");
        }else{
            ObtenerInicial(txtNomDepto.getText());
            iTexto+=valorRandom;
            txtCodDepto.setText(iTexto.toLowerCase());
        }
    }//GEN-LAST:event_btnGenCodActionPerformed

    private void btnCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioActionPerformed
        try{
            String ID = txtCodDepto.getText().trim();

            
           //coneccion de datos 

            PreparedStatement pst = (PreparedStatement) cn.prepareStatement("UPDATE departamento SET nombre_departamento=?, estado_departamento=? WHERE id_departamento='"+ID+"'");
            //insertar datos 
            pst.setString(1, txtNomDepto.getText().trim());
            pst.setString(2, txtEstadoDepto.getText().trim());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificación Realizada!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnCambioActionPerformed

    private void btnBuscarxCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarxCodActionPerformed
        try{
            PreparedStatement pst = (PreparedStatement) cn.prepareStatement("select * from departamento where id_departamento = ?");
            pst.setString(1, txtBuscaxCod.getText().trim());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                txtCodDepto.setText(rs.getString("id_departamento"));
                txtNomDepto.setText(rs.getString("nombre_departamento"));
                txtEstadoDepto.setText(rs.getString("estado_departamento"));
            }else{
                JOptionPane.showMessageDialog(null, "Departamento no registrado!");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnBuscarxCodActionPerformed

    private void btnBuscarxNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarxNomActionPerformed
        try{
            PreparedStatement pst = (PreparedStatement) cn.prepareStatement("select * from departamento where nombre_departamento = ?");
            pst.setString(1, txtBuscaxNom.getText().trim());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                txtCodDepto.setText(rs.getString("id_departamento"));
                txtNomDepto.setText(rs.getString("nombre_departamento"));
                txtEstadoDepto.setText(rs.getString("estado_departamento"));
            }else{
                JOptionPane.showMessageDialog(null, "Departamento no registrado!");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnBuscarxNomActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        // TODO add your handling code here:
        try {
            java.sql.PreparedStatement pst = cn.prepareStatement("delete from departamento where id_departamento = ?");
            
            pst.setString(1, txtBuscaxCod.getText().trim());
            pst.executeUpdate();
            
            txtCodDepto.setText("");
            txtNomDepto.setText("");
            txtEstadoDepto.setText("");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }    
    }//GEN-LAST:event_btnBajaActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        try{
            java.sql.PreparedStatement pst = cn.prepareStatement("insert into departamento values(?,?,?)");
            pst.setString(1, txtCodDepto.getText().trim());
            pst.setString(2, txtNomDepto.getText().trim());
            pst.setString(3, txtEstadoDepto.getText().trim());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Realizado!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnAltaActionPerformed
    String iTexto="";
    private void ObtenerInicial(String texto){
        for(int i=0; i<5; i++){
            iTexto=iTexto+texto.charAt(i);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnBuscarxCod;
    private javax.swing.JButton btnBuscarxNom;
    private javax.swing.JButton btnCambio;
    private javax.swing.JButton btnGenCod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel panelMantPuesto;
    private javax.swing.JTextField txtBuscaxCod;
    private javax.swing.JTextField txtBuscaxNom;
    private javax.swing.JTextField txtCodDepto;
    private javax.swing.JTextField txtEstadoDepto;
    private javax.swing.JTextField txtNomDepto;
    // End of variables declaration//GEN-END:variables

}
