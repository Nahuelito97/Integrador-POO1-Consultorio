package vista;

import modelo.Medico;
import modelo.Especialidad;
import controlador.Controlador;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author nahuel
 */
public class VentanaMedicos extends javax.swing.JFrame {

    private final Controlador Controlador;
    private final JFrame previo;
    private Medico me;

    public VentanaMedicos(Controlador c, JFrame p) {
        this.Controlador = c;
        this.previo = p;
        initComponents();
        txtMatriculaMed.setFocusable(true);

        DefaultComboBoxModel mCombo1 = new DefaultComboBoxModel(this.Controlador.listarEspecialidades().toArray());
        this.ComboEspecialidades.setModel(mCombo1);
        limpiar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nuevo_Medico = new javax.swing.JButton();
        Guardar_Medico = new javax.swing.JButton();
        Volver_V_Anterior = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaMedicosEspecialidades = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        Label_Matricula = new javax.swing.JLabel();
        txtMatriculaMed = new javax.swing.JTextField();
        Label_Apellido = new javax.swing.JLabel();
        txtApellidoMed = new javax.swing.JTextField();
        Label_Duracion = new javax.swing.JLabel();
        LabelFinal = new javax.swing.JLabel();
        LabelComienzo = new javax.swing.JLabel();
        txtTelefonoMed = new javax.swing.JTextField();
        Label_Telefono = new javax.swing.JLabel();
        txtNombreMed = new javax.swing.JTextField();
        Label_Nombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ComboEspecialidades = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtHoraComienzo = new javax.swing.JTextField();
        txtHoraFinal = new javax.swing.JTextField();
        txtDuracionTurno = new javax.swing.JTextField();
        labelId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VentanaMedicos");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nuevo_Medico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nuevo_Medico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add.png"))); // NOI18N
        Nuevo_Medico.setText("Nuevo");
        Nuevo_Medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nuevo_MedicoActionPerformed(evt);
            }
        });
        getContentPane().add(Nuevo_Medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        Guardar_Medico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Guardar_Medico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enter.png"))); // NOI18N
        Guardar_Medico.setText("Guardar");
        Guardar_Medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar_MedicoActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar_Medico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, 26));

        Volver_V_Anterior.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Volver_V_Anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        Volver_V_Anterior.setText("Volver");
        Volver_V_Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver_V_AnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(Volver_V_Anterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 125, 25));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LISTADO DE MEDICOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Y");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ESPECIALIDADES");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, -1, -1));

        ListaMedicosEspecialidades.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ListaMedicosEspecialidades.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ListaMedicosEspecialidades.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaMedicosEspecialidadesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaMedicosEspecialidades);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 377, 408));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("DATOS PERSONALES DEL MEDICO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        Label_Matricula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_Matricula.setText("(*)Matricula");
        getContentPane().add(Label_Matricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        txtMatriculaMed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMatriculaMedKeyTyped(evt);
            }
        });
        getContentPane().add(txtMatriculaMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 360, 30));

        Label_Apellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_Apellido.setText("(*)Apellido");
        getContentPane().add(Label_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        txtApellidoMed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMedKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellidoMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 360, 30));

        Label_Duracion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_Duracion.setText("(*)Duaracion");
        getContentPane().add(Label_Duracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        LabelFinal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelFinal.setText("(*)Hora Final");
        getContentPane().add(LabelFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        LabelComienzo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelComienzo.setText("(*)Hora Comienzo");
        getContentPane().add(LabelComienzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        txtTelefonoMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoMedActionPerformed(evt);
            }
        });
        txtTelefonoMed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoMedKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelefonoMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 360, 30));

        Label_Telefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_Telefono.setText("(*)Telefono");
        getContentPane().add(Label_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        txtNombreMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreMedActionPerformed(evt);
            }
        });
        txtNombreMed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreMedKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombreMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 360, 30));

        Label_Nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Label_Nombre.setText("(*)Nombre");
        getContentPane().add(Label_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("IdMedico");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("(*)Especialidades");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        ComboEspecialidades.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(ComboEspecialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 360, 30));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 65, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/medic.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(70, 70));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 60, 80));

        txtHoraComienzo.setText("08:00");
        getContentPane().add(txtHoraComienzo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 80, 30));

        txtHoraFinal.setText("12:00");
        getContentPane().add(txtHoraFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 80, 40));
        getContentPane().add(txtDuracionTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 80, 30));

        labelId.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/healthcare-1078x516.jpg"))); // NOI18N
        getContentPane().add(labelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Volver_V_AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver_V_AnteriorActionPerformed

        //this.setVisible(false);
        new VentanaRecepcionista(Controlador, previo).setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_Volver_V_AnteriorActionPerformed

    private void txtNombreMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMedActionPerformed

    private void txtTelefonoMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoMedActionPerformed

    private void Nuevo_MedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nuevo_MedicoActionPerformed
        limpiar();
        desbloquear();
    }//GEN-LAST:event_Nuevo_MedicoActionPerformed

    private void Guardar_MedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar_MedicoActionPerformed
        //AGREGO UN MEDICO NUEVO A LA BD
        if (validarMatricula() == 0 && validarTelefono() == 0) {

            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
            String auxHoraComienzo = this.txtHoraComienzo.getText();
            String auxHoraFinal = this.txtHoraFinal.getText();
            try {
                if (!this.ListaMedicosEspecialidades.isSelectionEmpty()) {

                    Medico m = (Medico) this.ListaMedicosEspecialidades.getSelectedValue();
                    this.Controlador.editarMedico(me, this.txtTelefonoMed.getText(),
                            formatoHora.parse(auxHoraComienzo), formatoHora.parse(auxHoraFinal),
                            Integer.parseInt(this.txtDuracionTurno.getText()));
                    JOptionPane.showMessageDialog(null, "MEDICO MODIFICADO CON EXITO", "EXITO", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    this.Controlador.agregarMedico(this.txtMatriculaMed.getText(), this.txtApellidoMed.getText(),
                            this.txtNombreMed.getText(), this.txtTelefonoMed.getText(), (Especialidad) this.ComboEspecialidades.getSelectedItem(),
                            formatoHora.parse(auxHoraComienzo), formatoHora.parse(auxHoraFinal),
                            Integer.parseInt(this.txtDuracionTurno.getText()));
                    JOptionPane.showMessageDialog(null, "MEDICO AGREADO CON EXITO", "EXITO", JOptionPane.INFORMATION_MESSAGE);

                }
            } catch (ParseException ex) {
                Logger.getLogger(VentanaMedicos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        limpiar();//Limpio la ventana medicos
    }//GEN-LAST:event_Guardar_MedicoActionPerformed

    private void ListaMedicosEspecialidadesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaMedicosEspecialidadesValueChanged
        //VERIFICAMOS QUE LA LISTA TENGA UN ITEM SELECCIONADO
        if (!this.ListaMedicosEspecialidades.isSelectionEmpty()) {
            //obtener la fila seleccionada
            Medico medic = (Medico) this.ListaMedicosEspecialidades.getSelectedValue();
            //LLEVAMOS LOS ATRIBUTOS A LAS CAJAS DE TEXTO
            this.labelId.setText(String.valueOf(medic.getId()));
            this.txtMatriculaMed.setText(medic.getMatricula());
            this.txtApellidoMed.setText(medic.getApellidos());
            this.txtNombreMed.setText(medic.getNombres());
            this.txtTelefonoMed.setText(medic.getTelefono());
            this.ComboEspecialidades.setSelectedItem(medic.getEspecialidades().get(0));
            
            
            this.txtHoraComienzo.setText(String.valueOf(medic.getHoracomienzo().getHours()) + ":00");
            this.txtHoraFinal.setText(String.valueOf(medic.getHoratermina().getHours()) + ":00");
            this.txtDuracionTurno.setText(String.valueOf(medic.getDuracionturno()));

        }
    }//GEN-LAST:event_ListaMedicosEspecialidadesValueChanged

    private void txtMatriculaMedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatriculaMedKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtMatriculaMedKeyTyped

    private void txtApellidoMedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMedKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoMedKeyTyped

    private void txtNombreMedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreMedKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreMedKeyTyped

    private void txtTelefonoMedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoMedKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoMedKeyTyped
    /**/
    private void desbloquear() {
        this.txtApellidoMed.setEditable(true);
        this.txtMatriculaMed.setEditable(true);
        this.txtNombreMed.setEditable(true);
        this.txtTelefonoMed.setEditable(true);
        this.txtDuracionTurno.setEditable(true);
        this.txtHoraComienzo.setEditable(true);
        this.txtHoraFinal.setEditable(true);

    }

    private void limpiar() {
        // limpio las cajas de texto y labels
        this.txtMatriculaMed.setText("");
        this.txtApellidoMed.setText("");
        this.txtNombreMed.setText("");
        this.txtTelefonoMed.setText("");
        this.txtDuracionTurno.setText("");
        this.txtHoraComienzo.setText("");
        this.txtHoraFinal.setText("");
        this.labelId.setText("");
        //PUEBLO LA LISTA
        this.ListaMedicosEspecialidades.setListData(this.Controlador.listarMedico().toArray());
        //DESELECCIONO LA LISTA
        this.ListaMedicosEspecialidades.clearSelection();

        DefaultComboBoxModel modeloComboMedico = new DefaultComboBoxModel(this.Controlador.listarEspecialidades().toArray());
        this.ComboEspecialidades.setModel(modeloComboMedico);
        //deselecciono el combo
        this.ComboEspecialidades.setSelectedIndex(-1);

    }

    //AGREGAR MAS METODOS PARA PODER VALIDAR LOS DEMAS CAMPOS QUE SEAN DE TIPO NUMERICO
    public int validarMatricula() {
        try {
            Integer.parseInt(this.txtMatriculaMed.getText());
            //JOptionPane.showMessageDialog(null, "DATOS VALIDOS");
            this.txtMatriculaMed.setBorder(BorderFactory.createLineBorder(Color.GREEN, 1));
            return 0; //ok
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "LA MATRICULA DEL MEDICO DEBE DE SER NUMERICA");
            this.txtMatriculaMed.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            return 1; //no ok
        }
    }

    public int validarTelefono() {
        try {
            Long.parseLong(this.txtTelefonoMed.getText());
            //JOptionPane.showMessageDialog(null, "DATOS VALIDOS");
            this.txtTelefonoMed.setBorder(BorderFactory.createLineBorder(Color.GREEN, 1));
            return 0;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "EL TELEFONO DEBE DE SER NUMERICO");
            this.txtTelefonoMed.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            return 1;
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboEspecialidades;
    private javax.swing.JButton Guardar_Medico;
    private javax.swing.JLabel LabelComienzo;
    private javax.swing.JLabel LabelFinal;
    private javax.swing.JLabel Label_Apellido;
    private javax.swing.JLabel Label_Duracion;
    private javax.swing.JLabel Label_Matricula;
    private javax.swing.JLabel Label_Nombre;
    private javax.swing.JLabel Label_Telefono;
    private javax.swing.JList ListaMedicosEspecialidades;
    private javax.swing.JButton Nuevo_Medico;
    private javax.swing.JButton Volver_V_Anterior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelId;
    private javax.swing.JTextField txtApellidoMed;
    private javax.swing.JTextField txtDuracionTurno;
    private javax.swing.JTextField txtHoraComienzo;
    private javax.swing.JTextField txtHoraFinal;
    private javax.swing.JTextField txtMatriculaMed;
    private javax.swing.JTextField txtNombreMed;
    private javax.swing.JTextField txtTelefonoMed;
    // End of variables declaration//GEN-END:variables

}
