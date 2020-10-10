package vista;

import controlador.Controlador;
import javax.swing.JFrame;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import modelo.*;

/**
 *
 * @author nahuel
 */
public class VentanaTurnos extends javax.swing.JFrame {

    private final Controlador controlador;
    private final JFrame previo;
    private Turno turnos;
    private Object[] listaTurnosDia;

    public VentanaTurnos(Controlador c, JFrame p) {
        this.controlador = c;
        this.previo = p;
        this.turnos = new Turno();
        initComponents();
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

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ComboMedicos = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        ComboEspecialidades = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaTurnos = new javax.swing.JList();
        fechasturnos = new rojeru_san.componentes.RSDateChooser();
        lblHorarioTurno = new javax.swing.JLabel();
        lblDuracionTurno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(669, 521));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(669, 521));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("GENERAR TURNO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 180, 50));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TURNOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 240, 40));

        ComboMedicos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ComboMedicos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboMedicosItemStateChanged(evt);
            }
        });
        ComboMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(ComboMedicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 390, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("(*)Seleccione un Medico");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 200, 30));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enter.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 160, 30));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnSalir.setText("Volver");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, 160, 30));

        btnSeleccionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listado.png"))); // NOI18N
        btnSeleccionar.setText("Selecionar");
        btnSeleccionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 160, 30));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("IdTurno");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));
        getContentPane().add(labelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 30, 30));

        ComboEspecialidades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboEspecialidadesItemStateChanged(evt);
            }
        });
        getContentPane().add(ComboEspecialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 390, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("(*)Seleccione una especialidad");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tur.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 80, 70));

        jScrollPane1.setViewportView(ListaTurnos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 340, 250));
        getContentPane().add(fechasturnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 390, 30));

        lblHorarioTurno.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        lblHorarioTurno.setForeground(java.awt.Color.white);
        getContentPane().add(lblHorarioTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 280, 30));

        lblDuracionTurno.setFont(new java.awt.Font("Ubuntu", 1, 16)); // NOI18N
        lblDuracionTurno.setForeground(java.awt.Color.white);
        getContentPane().add(lblDuracionTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 280, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PRL-Trabajo-Turnos.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 670, 590));
        jLabel1.getAccessibleContext().setAccessibleName("labelfondo");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        //CREO UN TURNO PARA UN MEDICO SELECCIONADO EN EN COMBOBOX
        Medico m = (Medico) ComboMedicos.getSelectedItem();
        if (ComboEspecialidades.getSelectedIndex() != -1 && ComboMedicos.getSelectedIndex() != -1) {
            crearTurnos();
        }
        visualizarTurnos();

    }//GEN-LAST:event_btnGuardarActionPerformed


    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        new VentanaRecepcionista(controlador, previo).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // TODO add your handling code here:
        this.turnos = (Turno) ListaTurnos.getSelectedValue();
        VentanaDetalles vdt = new VentanaDetalles(this.controlador, this, this.turnos, 0);
        this.setVisible(true);
        vdt.setLocationRelativeTo(null);
        vdt.setResizable(false);
        vdt.setVisible(true);
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void ComboMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboMedicosActionPerformed

    private void ComboEspecialidadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboEspecialidadesItemStateChanged
        // TODO add your handling code here:
        Especialidad espes = (Especialidad) ComboEspecialidades.getSelectedItem();

        mostrarMedico();
        if (espes != null) {
            comparacionFecha();
            verTurnosDia(fechasturnos.getDatoFecha());
        } else {
            deshabilitarBotonCrear();
        }

        this.lblDuracionTurno.setText("");
    }//GEN-LAST:event_ComboEspecialidadesItemStateChanged

    private void ComboMedicosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboMedicosItemStateChanged
        // TODO add your handling code here:
        Medico m = (Medico) ComboMedicos.getSelectedItem();
        if (m != null) {
            this.lblDuracionTurno.setText(" DURACION TURNO: " + m.getDuracionturno() + " min");
            mostrarHorarioTurno();
            this.turnos.setMedicos(m);
            verTurnoMedico(m);
        } else {
            deshabilitarBotonCrear();
            btnSeleccionar.setEnabled(false);
            this.ListaTurnos.setListData(new String[0]);    //limpia la lista
        }
    }//GEN-LAST:event_ComboMedicosItemStateChanged

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:comparacionFecha();
        comparacionFecha();

        Especialidad e = (Especialidad) ComboEspecialidades.getSelectedItem();
        Medico m = (Medico) ComboMedicos.getSelectedItem();
        mostrarMedico();
        this.ComboMedicos.setSelectedItem(m);
        if (e != null) {
            //verTurnosDia(dateSeleccion.getDatoFecha());
            deshabilitarBotonCrear();

        }
        visualizarTurnos();
        //System.out.println("GANO EL FOCO");
        //si es domingo no deberia aparecer el "crear"
        if (fechasturnos.getDatoFecha().getDay() == 0) {
            deshabilitarBotonCrear();
        }
    }//GEN-LAST:event_formWindowGainedFocus
    /*
    private void deshabilitarBotonNuevoTurno() {
        this.btnGuardarTurno.setEnabled(false);
    }
     */
    private void limpiar() {
        //LIMPIO LAS CAJAS DE TEXTO
        DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel(this.controlador.listarEspecialidades().toArray());
        this.ComboEspecialidades.setModel(modeloCombo);
        this.ComboEspecialidades.setSelectedIndex(-1);
        this.ComboMedicos.setSelectedIndex(-1);
        this.fechasturnos.setFormatoFecha("dd/MM/yyyy");
        this.fechasturnos.setDatoFecha(new Date());
        deshabilitarBotonSeleccionar();
        this.labelId.setText("");

    }

    private void crearTurnos() {
        //YA TENGO SELECCIONAD AL DOCTOR Y LUEGO CREO TURNOS PARA ESTE MEDICO
        Date a = new Date();
        if (fechasturnos.getDatoFecha().getDay() != 0) {
            if (fechasturnos.getDatoFecha().compareTo(a) > 0 || fechasturnos.getDatoFecha().getDate() == a.getDate()) {
                //System.out.println("entro");
                Calendar dia = Calendar.getInstance();//crear una instancia de calendario se usa para hora empieza
                Calendar aux = Calendar.getInstance();//instancia para horatermina 
                dia.setTime(fechasturnos.getDatoFecha()); //dia que seleccione en el combo
                //  System.out.println(dateSeleccion.getDatoFecha());
                dia.set(Calendar.HOUR_OF_DAY, this.turnos.getMedicos().getHoracomienzo().getHours());
                dia.set(Calendar.MINUTE, this.turnos.getMedicos().getHoracomienzo().getMinutes());
                aux.setTime(fechasturnos.getDatoFecha()); //dia que seleccione en el combo
                aux.set(Calendar.HOUR_OF_DAY, this.turnos.getMedicos().getHoracomienzo().getHours());
                aux.set(Calendar.MINUTE, this.turnos.getMedicos().getHoracomienzo().getMinutes() + this.turnos.getMedicos().getDuracionturno());
                int rango = (this.turnos.getMedicos().getHoratermina().getHours()
                        - this.turnos.getMedicos().getHoracomienzo().getHours()) * 60;
                int cantTurnosDia = rango / this.turnos.getMedicos().getDuracionturno();
                for (int i = 1; i <= cantTurnosDia; i++) {
                    this.controlador.agregarTurno(this.turnos.getMedicos(), dia.getTime(), aux.getTime());
                    aux.add(Calendar.MINUTE, this.turnos.getMedicos().getDuracionturno());
                    dia.add(Calendar.MINUTE, this.turnos.getMedicos().getDuracionturno());
                }
                //se pueden crear duplicados
            }
        }

    }

    public void mostrarMedico() {
        Especialidad e = (Especialidad) ComboEspecialidades.getSelectedItem();
        if (e != null) {
            DefaultComboBoxModel modeloComboMedicos = new DefaultComboBoxModel(e.getMedico().toArray());
            this.ComboMedicos.setModel(modeloComboMedicos);
            this.ComboMedicos.setSelectedIndex(-1);
        }

    }

    public void visualizarTurnos() {
        Medico m = (Medico) ComboMedicos.getSelectedItem();
        habilitarBotonSeleccionar();

        verTurnosDia(fechasturnos.getDatoFecha());
        //System.out.println(dateSeleccion.getDatoFecha());
        verTurnoMedico(m);
        if (ComboMedicos.getSelectedIndex() == -1) {
            lblHorarioTurno.setText("");
        }
    }

    private void verTurnoMedico(Medico m) {
        //System.out.println("imprime? verTurnosDoctor");
        Object[] aux = this.controlador.listarTurnos(m, this.listaTurnosDia);
        this.ListaTurnos.setListData(aux);
        if (aux.length == 0) {
            comparacionFecha();
            deshabilitarBotonSeleccionar();
        }

    }

    private void verTurnosDia(Date d) {

        //System.out.println("imprime? verTurnosDia");
        this.listaTurnosDia = this.controlador.listarTurnos(d);
        //no muestro las citas
        //this.ListaTurnos.setListData(this.listaTurnosDia);
    }

    private void comparacionFecha() {
        //System.out.println("imprime comparacion fecha");
        if ((this.fechasturnos.getDatoFecha().getDate() < (new Date().getDate())
                && (this.fechasturnos.getDatoFecha().getYear() <= (new Date().getYear())))
                || (this.ComboMedicos.getSelectedIndex() == -1
                || this.ComboEspecialidades.getSelectedIndex() == -1)) {
            deshabilitarBotonCrear();
        } else {
            habilitarBotonCrear();
        }
    }

    private void habilitarBotonCrear() {
        this.btnGuardar.setEnabled(true);
    }

    private void deshabilitarBotonCrear() {
        this.btnGuardar.setEnabled(false);
    }

    private void habilitarBotonSeleccionar() {
        this.btnSeleccionar.setEnabled(true);
    }

    private void deshabilitarBotonSeleccionar() {
        this.btnSeleccionar.setEnabled(false);
    }

    private void mostrarHorarioTurno() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("HH:mm");
        Medico m = (Medico) ComboMedicos.getSelectedItem();
        if (ComboMedicos.getSelectedIndex() != -1) {
            lblHorarioTurno.setText("Turno: " + formatoFecha.format(m.getHoracomienzo())
                    + " - " + formatoFecha.format(m.getHoratermina()));
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboEspecialidades;
    private javax.swing.JComboBox<String> ComboMedicos;
    private javax.swing.JList ListaTurnos;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSeleccionar;
    private rojeru_san.componentes.RSDateChooser fechasturnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel lblDuracionTurno;
    private javax.swing.JLabel lblHorarioTurno;
    // End of variables declaration//GEN-END:variables
}
