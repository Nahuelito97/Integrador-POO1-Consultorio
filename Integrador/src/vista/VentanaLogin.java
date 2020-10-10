package vista;

import controlador.Controlador;
import java.awt.*;
import javax.swing.*;

public class VentanaLogin extends javax.swing.JFrame {

    private final Controlador controlador;
    private String usuario;
    private String contraseña;

    public VentanaLogin(Controlador c) {
        this.controlador = c;
        initComponents();
        txtContraseña.setFocusable(true);
        this.setSize(510, 410);
        this.setLocationRelativeTo(null);

    }

    public void datos(String us, String ps) {
        usuario = "Admin";
        contraseña = "Admin";

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        IngresarSistema = new javax.swing.JButton();
        SalirSistema = new javax.swing.JButton();
        txtContraseña = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelinicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VentanaLogin");
        setMinimumSize(new java.awt.Dimension(510, 410));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(510, 410));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("POLICONSULTORIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtUsuario.setText("Admin");
        txtUsuario.setBorder(null);
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 320, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("USUARIO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("CONTRASEÑA:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        IngresarSistema.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        IngresarSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enter.png"))); // NOI18N
        IngresarSistema.setText("Ingresar");
        IngresarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarSistemaActionPerformed(evt);
            }
        });
        getContentPane().add(IngresarSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 140, 30));

        SalirSistema.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SalirSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        SalirSistema.setText("Salir");
        SalirSistema.setBorder(null);
        SalirSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirSistemaActionPerformed(evt);
            }
        });
        getContentPane().add(SalirSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 140, 30));

        txtContraseña.setBorder(null);
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyTyped(evt);
            }
        });
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 320, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 110, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administrador.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 40, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contrasena.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 292, 40, 40));

        labelinicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Actualidad_241740063_129998100_1024x576.jpg"))); // NOI18N
        getContentPane().add(labelinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, -30, 800, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarSistemaActionPerformed
        datos(usuario, contraseña);
        if (usuario.equals(txtUsuario.getText()) && contraseña.equals(txtContraseña.getText())) {
            VentanaRecepcionista vp = new VentanaRecepcionista(this.controlador, this);
            this.setVisible(false);
            vp.setLocationRelativeTo(null);
            vp.setResizable(false);
            vp.setVisible(true);
        } else if (txtUsuario.getText().equals("") && txtContraseña.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "USUARIO Y/O CONTRASEÑA ESTAN VACIOS, TRATE NUEVAMENTE");
            txtUsuario.setFocusable(true);
        } else if (txtUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "EL USUARIO ESTA VACIO");
            txtUsuario.setFocusable(true);
        } else if (txtContraseña.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "CONTRASEÑA VACIA");
            txtContraseña.setFocusable(true);
        } else if (txtUsuario.getText().compareTo(usuario) != 0 && txtContraseña.getText().compareTo(contraseña) != 0) {
            JOptionPane.showMessageDialog(this, "USUARIO Y CONTRASEÑA NO VALIDOS, INGRESE NUEVAMENTE");
            txtUsuario.setFocusable(true);
        } else if (txtUsuario.getText().compareTo(usuario) != 0) {
            JOptionPane.showMessageDialog(this, "USUARIO  NO VALIDO, INGRESE NUEVAMENTE");
            txtUsuario.setFocusable(true);
        } else if (txtContraseña.getText().compareTo(contraseña) != 0) {
            JOptionPane.showMessageDialog(this, "CONTRASEÑA NO VALIDA, INGRESE NUEVAMENTE");
            txtContraseña.setFocusable(true);
        }


    }//GEN-LAST:event_IngresarSistemaActionPerformed

    private void SalirSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirSistemaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirSistemaActionPerformed

    private void txtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyTyped
        // TODO add your handling code here:
       char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtContraseñaKeyTyped

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IngresarSistema;
    private javax.swing.JButton SalirSistema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelinicio;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
