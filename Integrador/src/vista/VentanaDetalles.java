package vista;

import controlador.Controlador;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.*;


/**
 *
 * @author nahuel
 */
public class VentanaDetalles extends javax.swing.JFrame {

    private final Controlador controlador;
    private final JFrame previo;
    private Turno turnos;

   
    public VentanaDetalles(Controlador c, JFrame p) {
        this.controlador = c;
        this.previo = p;
        initComponents();

    }

    public VentanaDetalles(Controlador c, JFrame p, Turno tu, int i) {
        initComponents();
        this.controlador = c;
        this.previo = p;
        this.turnos = tu;
        limpiar(i);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboPacientes = new javax.swing.JComboBox();
        ComboMedicos = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblInicio = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblFinal = new javax.swing.JLabel();
        lblContacto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TurnoPaciente");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        getContentPane().add(ComboPacientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 400, 30));

        ComboMedicos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(ComboMedicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 400, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel2.setText("ASOCIAR TURNO  PACIENTE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 50));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("(*)Seleccione un Medico");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("(*) Seleccione un Paciente");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 40));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setText("Detalles de Turnos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnConfirmar.setText("Volver");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 160, 30));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        btnGuardar.setText("Guardar Turno");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 160, 30));

        lblInicio.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblInicio.setText("Inicio:");
        getContentPane().add(lblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setText("08:00");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel8.setText("12:00");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        lblFinal.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblFinal.setText("Fin:");
        getContentPane().add(lblFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));
        getContentPane().add(lblContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 380, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Aplicaciones-El-medico-en-el-bolsillo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 430, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        
        // TODO add your handling code here:
        /*
         new VentanaRecepcionista(controlador, previo).setVisible(true);
        this.dispose(
        */
       
        new VentanaTurnos(controlador, previo).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        this.turnos.setDisponible(false);
        this.turnos.setPacientes((Paciente)this.ComboPacientes.getSelectedItem());
        if (this.ComboPacientes.getSelectedIndex()!= -1){
            JOptionPane.showMessageDialog(rootPane, " TURNOS AGREGADO DE FORMA EXITOSA ", " EXITO ", JOptionPane.INFORMATION_MESSAGE);
            this.controlador.editarTurno(this.turnos);
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void limpiar(int i) {
        System.out.println(turnos.getPacientes());

        if (turnos.getPacientes() == null) {
            //entra si el nombre de la cita del paciente es vacio
                        if (i == 0) {
                DefaultComboBoxModel modeloComboPacientes = new DefaultComboBoxModel(this.controlador.listarPaciente().toArray());
                this.ComboPacientes.setModel(modeloComboPacientes);
                this.ComboPacientes.setSelectedIndex(-1);
            } else {
                this.btnGuardar.setEnabled(false);
            }

        } else {
            this.ComboPacientes.addItem(turnos.getPacientes());
            this.lblContacto.setText("Tel: " + turnos.getPacientes().getTelefono());
            this.btnGuardar.setEnabled(false);
        }
        //
        this.ComboMedicos.addItem(this.turnos.getMedicos());
        //
        //las horas saco de la lista que seleccione
        //FORMATEO LA HORA
       // SimpleDateFormat formatoFecha = new SimpleDateFormat("HH:mm");
       //this.lblHoraComienza.setText(formatoFecha.format(this.cita.getHoraComienzo()));
       // this.lblHoraTermina.setText(formatoFecha.format(this.cita.getHoraTermina()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboMedicos;
    private javax.swing.JComboBox ComboPacientes;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblContacto;
    private javax.swing.JLabel lblFinal;
    private javax.swing.JLabel lblInicio;
    // End of variables declaration//GEN-END:variables
}
