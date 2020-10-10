/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import javax.swing.JFrame;

/**
 *
 * @author wagne
 */
public class VentanaRecepcionista extends javax.swing.JFrame {

    private final Controlador Controlador;
    private final JFrame previo;

  
    public VentanaRecepcionista(Controlador c, JFrame p) {

        this.Controlador = c;
        this.previo = p;
        initComponents();
        //ANCHO, ALTO
        this.setSize(630, 645);
        this.setLocationRelativeTo(null);
        //agregar para que se sentre la ventana
        //limpiar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LlamarMedicos = new javax.swing.JButton();
        VolverPrincipal = new javax.swing.JButton();
        LlamarHistorial = new javax.swing.JButton();
        LamarTurnos = new javax.swing.JButton();
        LamarPacientes = new javax.swing.JButton();
        btnRecordatorios = new javax.swing.JButton();
        btnEspecialidades = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();

        setTitle("VentanaRecepcionista");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LlamarMedicos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LlamarMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        LlamarMedicos.setText("Medicos");
        LlamarMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LlamarMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(LlamarMedicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 170, 30));

        VolverPrincipal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VolverPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        VolverPrincipal.setText("Volver");
        VolverPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(VolverPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, 170, 30));

        LlamarHistorial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LlamarHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listado.png"))); // NOI18N
        LlamarHistorial.setText("Historial");
        LlamarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LlamarHistorialActionPerformed(evt);
            }
        });
        getContentPane().add(LlamarHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 510, 170, 30));

        LamarTurnos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LamarTurnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ticket.png"))); // NOI18N
        LamarTurnos.setText("Turnos");
        LamarTurnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LamarTurnosActionPerformed(evt);
            }
        });
        getContentPane().add(LamarTurnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 170, 30));

        LamarPacientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LamarPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vendedor.png"))); // NOI18N
        LamarPacientes.setText("Pacientes");
        LamarPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LamarPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(LamarPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 170, 30));

        btnRecordatorios.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRecordatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recordatorio.png"))); // NOI18N
        btnRecordatorios.setText("Recordatorio");
        btnRecordatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordatoriosActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecordatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 170, -1));

        btnEspecialidades.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        btnEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/grabar.png"))); // NOI18N
        btnEspecialidades.setText("Especialidades");
        btnEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(btnEspecialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 170, 30));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recepcion-hospital-diseno-plano_23-2147981197.jpg"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 630, 660));
    }// </editor-fold>//GEN-END:initComponents

    private void LlamarMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LlamarMedicosActionPerformed

        VentanaMedicos med = new VentanaMedicos(this.Controlador, this);
        this.setVisible(false);
        med.setLocationRelativeTo(null);
        med.setResizable(false);
        med.setVisible(true);
    }//GEN-LAST:event_LlamarMedicosActionPerformed

    private void LamarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LamarPacientesActionPerformed
        // TODO add your handling code here:
        VentanaPacientes p = new VentanaPacientes(this.Controlador, this);
        this.setVisible(false);
        p.setLocationRelativeTo(null);
        p.setResizable(false);
        p.setVisible(true);

    }//GEN-LAST:event_LamarPacientesActionPerformed

    private void VolverPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverPrincipalActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new VentanaLogin(Controlador).setVisible(true);
    }//GEN-LAST:event_VolverPrincipalActionPerformed

    private void LlamarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LlamarHistorialActionPerformed
        // TODO add your handling code here:
        
        VentanaHistoriales vh = new VentanaHistoriales(Controlador, this);
        this.setVisible(false);
        vh.setLocationRelativeTo(null);
        vh.setResizable(false);
        vh.setVisible(true);
            
        
    }//GEN-LAST:event_LlamarHistorialActionPerformed

    private void LamarTurnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LamarTurnosActionPerformed
        // TODO add your handling code here:

        VentanaTurnos tur = new VentanaTurnos(this.Controlador, this);
        this.setVisible(false);
        tur.setLocationRelativeTo(null);
        tur.setResizable(false);
        tur.setVisible(true);
        
    }//GEN-LAST:event_LamarTurnosActionPerformed

    private void btnRecordatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordatoriosActionPerformed
        // TODO add your handling code here:
        VentanaRecordatorios rec = new VentanaRecordatorios(this.Controlador, this);
        this.setVisible(false);
        rec.setLocationRelativeTo(null);
        rec.setResizable(false);
        rec.setVisible(true);
    }//GEN-LAST:event_btnRecordatoriosActionPerformed

    private void btnEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspecialidadesActionPerformed
        // TODO add your handling code here:
        VentanaEspecialidades esp = new VentanaEspecialidades(this.Controlador, this);
        this.setVisible(false);
        esp.setLocationRelativeTo(null);
        esp.setResizable(false);
        esp.setVisible(true);
    }//GEN-LAST:event_btnEspecialidadesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LamarPacientes;
    private javax.swing.JButton LamarTurnos;
    private javax.swing.JButton LlamarHistorial;
    private javax.swing.JButton LlamarMedicos;
    private javax.swing.JButton VolverPrincipal;
    private javax.swing.JButton btnEspecialidades;
    private javax.swing.JButton btnRecordatorios;
    private javax.swing.JLabel labelFondo;
    // End of variables declaration//GEN-END:variables
}
