package vista;

import modelo.Historiaclinica;
//import modelo.Medico;
import modelo.Paciente;

import controlador.Controlador;
import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Nahu
 */
public class VentanaListadoHistorias extends javax.swing.JFrame {

    private final Controlador Controlador;
    private final JFrame previo;

    
    public VentanaListadoHistorias(Controlador c, JFrame p) {
        this.Controlador = c;
        this.previo = p;
        initComponents();

        DefaultComboBoxModel mCombo = new DefaultComboBoxModel(this.Controlador.listarPaciente().toArray());
        this.ComboPaciente1.setModel(mCombo);

        if (ListaHistorias.isSelectionEmpty()) {
            Paciente pa = (Paciente) this.ComboPaciente1.getSelectedItem();
            this.ListaHistorias.setListData(pa.getHistoriasClinicasCompletas().toArray());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BtnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaHistorias = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComboPaciente1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtobservaciones = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtmedicamentos = new javax.swing.JTextArea();
        LabelId = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(472, 557));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(472, 557));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Listado de Historias Clinicas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        BtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/escoba.png"))); // NOI18N
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 110, 30));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 110, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Descripcion");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 30));

        ListaHistorias.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaHistoriasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaHistorias);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 440, 120));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel6.setText("Medicamentos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Lista de Historias Clinicas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 210, 30));

        ComboPaciente1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboPaciente1ItemStateChanged(evt);
            }
        });
        getContentPane().add(ComboPaciente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 370, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Paciente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 77, -1, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Id:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 30));

        txtobservaciones.setColumns(20);
        txtobservaciones.setRows(5);
        jScrollPane3.setViewportView(txtobservaciones);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 330, 80));

        txtmedicamentos.setColumns(20);
        txtmedicamentos.setRows(5);
        jScrollPane4.setViewportView(txtmedicamentos);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 330, -1));
        getContentPane().add(LabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 30, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aerial-3242869_1920_0.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        new VentanaHistoriales(Controlador, previo).setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnVolverActionPerformed

    private void ComboPaciente1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboPaciente1ItemStateChanged
        // TODO add your handling code here:

        if (ListaHistorias.isSelectionEmpty()) {
            Paciente pa = (Paciente) this.ComboPaciente1.getSelectedItem();
            this.ListaHistorias.setListData(pa.getHistoriasClinicasCompletas().toArray());
        }
    }//GEN-LAST:event_ComboPaciente1ItemStateChanged

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        this.ComboPaciente1.setEnabled(true);
        if (!ListaHistorias.isSelectionEmpty()) {
            this.ListaHistorias.clearSelection();
        }

        this.txtobservaciones.setText("");
        this.txtmedicamentos.setText("");
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void ListaHistoriasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaHistoriasValueChanged

        //VERIFICAMOS QUE LA LISTA TENGA UN ITEM SELECCIONADO
        if (!this.ListaHistorias.isSelectionEmpty()) {
            //obtener la fila seleccionada
            Historiaclinica h = (Historiaclinica) this.ListaHistorias.getSelectedValue();
            //Medico m = (Medico) this.ListaHistorias.getSelectedValue();
            //LLEVAMOS LOS ATRIBUTOS A LAS CAJAS DE TEXTO
            this.LabelId.setText(Long.toString(h.getId()));
            //this.txtMedico.setText(m.getNombres());
            this.txtobservaciones.setText(h.getObservaciones());
            this.txtmedicamentos.setText(h.getMedicamentos());
        }

    }//GEN-LAST:event_ListaHistoriasValueChanged

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JComboBox<String> ComboPaciente1;
    private javax.swing.JLabel LabelId;
    private javax.swing.JList ListaHistorias;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtmedicamentos;
    private javax.swing.JTextArea txtobservaciones;
    // End of variables declaration//GEN-END:variables

}
