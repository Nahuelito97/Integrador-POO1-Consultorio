/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import modelo.Especialidad;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nahuel
 */
public class VentanaEspecialidades extends javax.swing.JFrame {

    private final Controlador Controlador;
    private final JFrame previo;
    private Especialidad esp;

    public VentanaEspecialidades(Controlador c, JFrame p) {
        initComponents();
        this.Controlador = c;
        this.previo = p;
        limpiar();
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
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaEspecialidades = new javax.swing.JList();
        btnNuevo = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(385, 462));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(384, 462));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("ESPECIALIDADES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 250, 60));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/confirmar.png"))); // NOI18N
        btnAgregar.setText("Guardar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 240, 30));

        ListaEspecialidades.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaEspecialidadesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaEspecialidades);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 240, 170));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 240, 30));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 240, 30));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 240, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 20, 30));

        labelId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(labelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 30, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("(*)Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/espe.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 70, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/especialidades-1024x512.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-270, 0, 650, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (!this.ListaEspecialidades.isSelectionEmpty()) {
            Especialidad e = (Especialidad) this.ListaEspecialidades.getSelectedValue();
            this.Controlador.editarEspecialidades(esp, this.txtNombre.getText());
            JOptionPane.showMessageDialog(null, "ESPECIALIDAD MODIFICADA CON EXITO", "EXITO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            this.Controlador.agregarEspecialidades(this.txtNombre.getText());
            JOptionPane.showMessageDialog(null, "ESPECIALIDAD AGEGADA CON EXITO", "EXITO", JOptionPane.INFORMATION_MESSAGE);
        }
        limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void ListaEspecialidadesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaEspecialidadesValueChanged
        // TODO add your handling code here:
        if (!this.ListaEspecialidades.isSelectionEmpty()) {
            Especialidad espes = (Especialidad) this.ListaEspecialidades.getSelectedValue();
            this.labelId.setText(String.valueOf(espes.getId()));
            this.txtNombre.setText(espes.getNombre());

        }

    }//GEN-LAST:event_ListaEspecialidadesValueChanged

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here: 
        //this.setVisible(false);
        new VentanaRecepcionista(Controlador, previo).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped
    /*
      public void limpiar() {
        // pueblo la lista
        this.listaDoctores.setListData(this.controlador.listarDoctores().toArray());        
        // deselecciono la lista
        this.listaDoctores.clearSelection();
    }
    */
    public void limpiar() {
        this.txtNombre.setText("");
        this.labelId.setText("");
        //PUEBLO LA LISTA
        this.ListaEspecialidades.setListData(this.Controlador.listarEspecialidades().toArray());
        //DESELECCIONO LA LISTA
        this.ListaEspecialidades.clearSelection();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ListaEspecialidades;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
