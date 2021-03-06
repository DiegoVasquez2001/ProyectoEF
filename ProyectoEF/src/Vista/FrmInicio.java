/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author diego
 */
public class FrmInicio extends javax.swing.JFrame {

    static Object frmLog;

    /**
     * Creates new form FrmLogin
     */
    public FrmInicio() {
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

        JPanelInicio = new javax.swing.JPanel();
        JLabelTitulo = new javax.swing.JLabel();
        JBtnAcceso = new javax.swing.JButton();
        JBtnRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Nóminas");
        setResizable(false);

        JPanelInicio.setBackground(new java.awt.Color(204, 204, 204));

        JLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JLabelTitulo.setForeground(new java.awt.Color(51, 51, 51));
        JLabelTitulo.setText("Sistema de Nóminas");

        JBtnAcceso.setBackground(new java.awt.Color(0, 50, 60));
        JBtnAcceso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JBtnAcceso.setForeground(new java.awt.Color(255, 255, 255));
        JBtnAcceso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/User_24x24.png"))); // NOI18N
        JBtnAcceso.setText("Acceder");
        JBtnAcceso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBtnAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnAccesoActionPerformed(evt);
            }
        });

        JBtnRegistro.setBackground(new java.awt.Color(0, 50, 60));
        JBtnRegistro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JBtnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        JBtnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Add_24x24.png"))); // NOI18N
        JBtnRegistro.setText("Registrarse");
        JBtnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBtnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelInicioLayout = new javax.swing.GroupLayout(JPanelInicio);
        JPanelInicio.setLayout(JPanelInicioLayout);
        JPanelInicioLayout.setHorizontalGroup(
            JPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelInicioLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(JLabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelInicioLayout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(JBtnAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBtnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        JPanelInicioLayout.setVerticalGroup(
            JPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelInicioLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(JLabelTitulo)
                .addGap(54, 54, 54)
                .addGroup(JPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBtnAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBtnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnAccesoActionPerformed
        FrmLogin frmLogin = new FrmLogin();
        frmLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBtnAccesoActionPerformed

    private void JBtnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnRegistroActionPerformed
        FrmRegistro frmRegistro = new FrmRegistro();
        frmRegistro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBtnRegistroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new AcrylLookAndFeel());
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBtnAcceso;
    private javax.swing.JButton JBtnRegistro;
    private javax.swing.JLabel JLabelTitulo;
    private javax.swing.JPanel JPanelInicio;
    // End of variables declaration//GEN-END:variables
}
