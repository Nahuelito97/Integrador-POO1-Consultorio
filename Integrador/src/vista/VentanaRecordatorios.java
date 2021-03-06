package vista;

import controlador.Controlador;
import javax.swing.JFrame;
import modelo.*;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author nahuel
 */
public class VentanaRecordatorios extends javax.swing.JFrame {

    private final Controlador Controlador;
    private final JFrame previo;
    private Turno tur;

    public VentanaRecordatorios(Controlador c, JFrame p) {
        this.Controlador = c;
        this.previo = p;
        initComponents();
        //ANCHO, ALTO
        this.setSize(665, 483);
        this.setLocationRelativeTo(null);
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

        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaRecordatrios = new javax.swing.JList();
        btnRecordatorios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(665, 480));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(665, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 140, 30));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel2.setText("LISTADO DE TURNOS ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 500, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel3.setText("RECORDATORIOS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 400, 50));

        jScrollPane1.setViewportView(ListaRecordatrios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 450, 310));

        btnRecordatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/listado.png"))); // NOI18N
        btnRecordatorios.setText("Ver Turnos");
        btnRecordatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordatoriosActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecordatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 140, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/importante.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        //this.setVisible(false);
        new VentanaRecepcionista(Controlador, previo).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRecordatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordatoriosActionPerformed
        // TODO add your handling code here:
        this.tur = (Turno) ListaRecordatrios.getSelectedValue();
        VentanaDetalles vdt = new VentanaDetalles(this.Controlador, this, this.tur, 1);
        this.setVisible(false);
        vdt.setLocationRelativeTo(null);
        vdt.setResizable(false);
        vdt.setVisible(true);

    }//GEN-LAST:event_btnRecordatoriosActionPerformed

    private void limpiar() {
        ArrayList<Turno> lista = new ArrayList<>();
        Object[] listaResultante = null;
        Date diaDeHoy = new Date();
        Date diaAux = new Date();
        //por que son 2 semanas.
        for (int i = 0; i < 15; i++) {
            diaAux.setDate(diaDeHoy.getDate() + i);

            listaResultante = this.Controlador.listarTurnosRecordatorio(diaAux);
            for (int j = 0; j < listaResultante.length; j++) {
                lista.add((Turno) listaResultante[j]);
            }
        }
        ListaRecordatrios.setListData(lista.toArray());
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList ListaRecordatrios;
    private javax.swing.JButton btnRecordatorios;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
