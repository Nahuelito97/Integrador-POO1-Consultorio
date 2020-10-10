
package sistema;

import controlador.Controlador;
import dao.Persistencia;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import vista.VentanaLogin;


public class sistema {

    public static void main(String[] args) {
        // TODO code application logic 

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SoftwarePoliConsultorioPU");
        // creo objeto de Persistencia (DAO)
        Persistencia persistencia = new Persistencia(emf);
        // creo controlador y asocio (inyecto) al controlador el objeto de Persistencia (DAO)
        Controlador c = new Controlador(persistencia);
        
        // creo la ventana principal, asocio (inyecto) el controlador
        VentanaLogin  vl = new VentanaLogin(c);
        vl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vl.setResizable(false);
        vl.setLocationRelativeTo(null);
        vl.setVisible(true); //hacemos visible la ventana
            
    }
}
