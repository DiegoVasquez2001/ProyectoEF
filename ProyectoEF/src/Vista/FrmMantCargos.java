/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */



public class FrmMantCargos extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form FrmMantCargos
     */
    public FrmMantCargos() {
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

        panelMantPuesto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodPuesto = new javax.swing.JTextField();
        txtNomPuesto = new javax.swing.JTextField();
        txtEstadoPuesto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnGenCod = new javax.swing.JButton();
        btnAlta = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        btnCambio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtBuscarxCodigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBuscarxNom = new javax.swing.JTextField();
        btnBuscarxNom = new javax.swing.JButton();
        btnBuscarxCod = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setClosable(true);
        setTitle("Mantenimiento Puestos");

        panelMantPuesto.setBackground(new java.awt.Color(51, 51, 51));
        panelMantPuesto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código Puesto:");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre Puesto:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estad Puesto:");

        txtCodPuesto.setEditable(false);
        txtCodPuesto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtNomPuesto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txtEstadoPuesto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MANTENIMIENTO PUESTOS");

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

        txtBuscarxCodigo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Buscar por Nombre:");

        txtBuscarxNom.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        btnBuscarxNom.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBuscarxNom.setText("Buscar");
        btnBuscarxNom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarxNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarxNomActionPerformed(evt);
            }
        });

        btnBuscarxCod.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnBuscarxCod.setText("Buscar");
        btnBuscarxCod.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBuscarxCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarxCodActionPerformed(evt);
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
                            .addComponent(txtCodPuesto)
                            .addComponent(txtNomPuesto)
                            .addComponent(txtEstadoPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGenCod))
                    .addGroup(panelMantPuestoLayout.createSequentialGroup()
                        .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(47, 47, 47)
                        .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBuscarxNom)
                            .addComponent(txtBuscarxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarxNom, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarxCod, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panelMantPuestoLayout.setVerticalGroup(
            panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMantPuestoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEstadoPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlta)
                    .addComponent(btnBaja)
                    .addComponent(btnCambio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBuscarxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarxNom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMantPuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBuscarxNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarxCod))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMantPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnGenCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenCodActionPerformed
        String validacion;
        Random random = new Random();
        int valorRandom = random.nextInt(9999)+1;
        validacion=txtNomPuesto.getText();
        if(validacion.equals("")){
            JOptionPane.showMessageDialog(null, "Por Favor, ingrese un nombre para el Puesto");
        }else{
            ObtenerInicial(txtNomPuesto.getText());
            iTexto+=valorRandom;
            txtCodPuesto.setText(iTexto.toLowerCase());
        }
    }//GEN-LAST:event_btnGenCodActionPerformed

    private void btnBuscarxNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarxNomActionPerformed
        try{
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
            PreparedStatement pst = (PreparedStatement) cn.prepareStatement("select * from puesto where id_puesto = ?");
            pst.setString(1, txtBuscarxCodigo.getText().trim());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                txtCodPuesto.setText(rs.getString("id_puesto"));
                txtNomPuesto.setText(rs.getString("nombre_puesto"));
                txtEstadoPuesto.setText(rs.getString("estado_puesto"));
            }else{
                JOptionPane.showMessageDialog(null, "Puesto no registrado!");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnBuscarxNomActionPerformed

    private void btnBuscarxCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarxCodActionPerformed
       try{
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
            PreparedStatement pst = (PreparedStatement) cn.prepareStatement("select * from puesto where nombre_puesto = ?");
            pst.setString(1, txtBuscarxNom.getText().trim());
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                txtCodPuesto.setText(rs.getString("id_puesto"));
                txtNomPuesto.setText(rs.getString("nombre_puesto"));
                txtEstadoPuesto.setText(rs.getString("estado_puesto"));
            }else{
                JOptionPane.showMessageDialog(null, "Puesto no registrado!");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnBuscarxCodActionPerformed

    private void btnCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioActionPerformed
        try{
            String ID = txtCodPuesto.getText().trim();
            Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
            PreparedStatement pst = (PreparedStatement) cn.prepareStatement("UPDATE puesto SET nombre_puesto=?, estado_puesto=? WHERE id_puesto='"+ID+"'");
            pst.setString(1, txtNomPuesto.getText().trim());
            pst.setString(2, txtEstadoPuesto.getText().trim());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Modificación Realizada!");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnCambioActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        // TODO add your handling code here:
                //Eliminar por Codigo
         try {
             java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
            java.sql.PreparedStatement pst = cn.prepareStatement("delete from puesto where id_puesto = ?");
            
            pst.setString(1, txtBuscarxCodigo.getText().trim());
            pst.executeUpdate();
            
            txtCodPuesto.setText("");
            txtNomPuesto.setText("");
            txtEstadoPuesto.setText("");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }    
    }//GEN-LAST:event_btnBajaActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        try{
            java.sql.Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/planilla_sys", "root", "informaticdv2016");
            java.sql.PreparedStatement pst = cn.prepareStatement("insert into puesto values(?,?,?)");
            pst.setString(1, txtCodPuesto.getText().trim());
            pst.setString(2, txtNomPuesto.getText().trim());
            pst.setString(3, txtEstadoPuesto.getText().trim());
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
    private javax.swing.JTextField txtBuscarxCodigo;
    private javax.swing.JTextField txtBuscarxNom;
    private javax.swing.JTextField txtCodPuesto;
    private javax.swing.JTextField txtEstadoPuesto;
    private javax.swing.JTextField txtNomPuesto;
    // End of variables declaration//GEN-END:variables
}