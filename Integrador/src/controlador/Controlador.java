package controlador;

import modelo.*;
import dao.Persistencia;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wagne
 */
public class Controlador {

    Persistencia persistencia;

    public Controlador(Persistencia p) {
        this.persistencia = p;
    }

    //METODOS DEL PACIENTE
    public List listarPaciente() {
        return this.persistencia.buscarTodos(Paciente.class);
    }

    public Paciente buscarPaciente(String id) {
        return this.persistencia.buscar(Paciente.class, id);
    }

    public void agregarPaciente(String nombres, String apellidos, String dni, String direccion,
            String telefono, String txtfecha) {
        this.persistencia.iniciarTransaccion();
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            Paciente p = new Paciente(nombres.toUpperCase(), apellidos.toUpperCase(), dni.toUpperCase(),
                    direccion.toUpperCase(), telefono.toUpperCase(), formatoFecha.parse(txtfecha));
            this.persistencia.insertar(p);
            this.persistencia.confirmarTransaccion();
            //this.persistencia.descartarTransaccion();
        } catch (ParseException ex) {

            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void editarPaciente(Paciente p, String direccion,
            String telefono) {
        this.persistencia.iniciarTransaccion();

        if (p != null) {
          
            p.setDireccion(direccion.toUpperCase());
            p.setTelefono(telefono.toUpperCase());

            this.persistencia.modificar(p);
            this.persistencia.confirmarTransaccion();
        }

    }

    //METODOS DEL MEDICO
    public List listarMedico() {
        return this.persistencia.buscarTodos(Medico.class);
    }

    public Medico buscarMedico(String idMatricula) {
        return this.persistencia.buscar(Medico.class, idMatricula);
    }

    public void agregarMedico(String matricula, String nombre, String apellido, String telefono, Especialidad especialidad,
            Date txthoracomienzo, Date txthorafinal, int txtDuracion) {
        this.persistencia.iniciarTransaccion();
        //SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Medico m = new Medico(matricula, nombre.toUpperCase(),
                apellido.toUpperCase(), telefono.toUpperCase(), especialidad,
                txthoracomienzo, txthorafinal, txtDuracion);
        // si es un departamento valido
        if (especialidad != null) {
            m.agregarEspecialidad(especialidad); //agrego al medico la especialidad y en la base de datos
            especialidad.agregarMedico(m);  //agrego en especialidad al medico. hago de los 2 lados.

        }
        this.persistencia.insertar(m);
        this.persistencia.confirmarTransaccion();
    }

    public void editarMedico(Medico m, String telefono,
            Date txthoracomienzo, Date txthorafinal, int txtDuracionturno) {

        this.persistencia.iniciarTransaccion();

        if (m != null) {
           
            m.setTelefono(telefono.toUpperCase());
            m.setHoracomienzo(txthoracomienzo);
            m.setHoratermina(txthorafinal);
            m.setDuracionturno(txtDuracionturno);
            this.persistencia.modificar(m);
            this.persistencia.confirmarTransaccion();
        }
    }

//METODOS DE LAS HISTORIAS CLINICAS
    public void agregarHistoria(Paciente p, String txtfecha, String descripcion, String medicamentos, Medico m) {
        this.persistencia.iniciarTransaccion();

        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

            Historiaclinica historia = new Historiaclinica(p, formatoFecha.parse(txtfecha),
                    descripcion.toUpperCase(), medicamentos.toUpperCase(), m);
            p.agregarHistoriaClinica(historia);

            this.persistencia.modificar(p);

            this.persistencia.insertar(historia);
            this.persistencia.confirmarTransaccion();
        } catch (ParseException ex) {
            this.persistencia.descartarTransaccion();
            System.out.println("ERROR, NO SE PUEDE AGREGAR LA HISTORIA DE ESTE PASCIENTE" + ex.getMessage());
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//METODOS DE LAS ESPECIALIDADES

    public List listarEspecialidades() {
        // retorno valores ordenados de la consulta
        //System.out.println(" ACA ENTRO ");
        ArrayList<Especialidad> listaResultante = new ArrayList<>(this.persistencia.buscarTodos(Especialidad.class));
        return listaResultante;

    }

    public void agregarEspecialidades(String nombre) {
        this.persistencia.iniciarTransaccion();
        Especialidad e = new Especialidad(nombre.toUpperCase());
        this.persistencia.insertar(e);
        this.persistencia.confirmarTransaccion();
    }

    public void editarEspecialidades(Especialidad esp, String nombre) {
        this.persistencia.iniciarTransaccion();
        if (esp != null) {
            esp.setNombre(nombre);

            this.persistencia.modificar(esp);
            this.persistencia.confirmarTransaccion();
        }
    }

    //TURNOS 
    public List listarTurnos() {
        return this.persistencia.buscarTodos(Turno.class);
    }

    public Object[] listarTurnos(Medico m, Object[] turnos) {
        //entra un medico y las citas del dia. tengo que sacar solo las del medico
        ArrayList<Turno> listaResultante = new ArrayList<>();
        Turno aux;
        for (int i = 0; i < turnos.length; i++) {
            aux = (Turno) turnos[i];
            if (m == aux.getMedicos()) {
                listaResultante.add(aux);
            } else {
                //break;
            }
        }
        //LISTA ORDENADA
        listaResultante.sort(Comparator.comparing(Turno::getIdturno));

        return listaResultante.toArray();
    }

    public Object[] listarTurnos(Date d) {
        //Cita_.horaComienzo
        ArrayList<Turno> lista = new ArrayList<>(this.persistencia.buscarTodosOrdenadosPor(Turno.class, Turno_.medicos));
        ArrayList<Turno> listaResultante = new ArrayList<>();
        Turno aux;
        //todas las citas de ese doctor van a estar al principio de la lista.
        for (int i = 0; i < lista.size(); i++) {
            aux = lista.get(i);
            //pregunto si el dia que le pase es igual al de la cita
            if (d.getDate() == aux.getHoracomienzo().getDate()) {
                System.out.println(d.getDate() + " = " + aux.getHoracomienzo().getDate());
                //agrego si esta diponible, si esta ocupado no lo listo
                if (aux.isDisponible()) {
                    listaResultante.add(aux);
                }
            }
        }
        return listaResultante.toArray();
    }

    public Object[] listarTurnos(Paciente p) {
        ArrayList<Turno> lista = new ArrayList<>(this.persistencia.buscarTodosOrdenadosPor(Turno.class, Turno_.pacientes));
        ArrayList<Turno> listaResultante = new ArrayList<>();
        Turno aux;

        for (int i = 0; i < lista.size(); i++) {
            aux = lista.get(i);
            if (p == aux.getPacientes()) {
                //si esta disponible no deberia aparecer aqui.
                if (!aux.isDisponible()) {
                    listaResultante.add(aux);
                }
            } else {
                //break;
            }
        }
        listaResultante.sort(Comparator.comparing(Turno::getHoracomienzo));

        return listaResultante.toArray();
    }

    public Object[] listarTurnosRecordatorio(Date d) {
        //Cita_.horaComienzo
        ArrayList<Turno> lista = new ArrayList<>(this.persistencia.buscarTodosOrdenadosPor(Turno.class, Turno_.medicos));
        ArrayList<Turno> listaResultante = new ArrayList<>();
        Turno aux;
        //todas las citas de ese doctor van a estar al principio de la lista.
        for (int i = 0; i < lista.size(); i++) {
            aux = lista.get(i);
            //pregunto si el dia que le pase es igual al de la cita
            if (d.getDate() == aux.getHoracomienzo().getDate()) {
                //System.out.println(aux);
                //agrego si esta diponible, si esta ocupado no lo listo
                //if(aux.isDisponible()){
                listaResultante.add(aux);
                //}

            }

        }

        listaResultante.sort(Comparator.comparing(Turno::getHoracomienzo));
        return listaResultante.toArray();
    }

    //se usa para crear vacio
    public void agregarTurno(Medico m, Date horacomienzo, Date horatermina) {
        this.persistencia.iniciarTransaccion();
        Turno t = new Turno(horacomienzo, horatermina, true);
        t.setMedicos(m);
        this.persistencia.insertar(t);
        this.persistencia.confirmarTransaccion();
    }

    public void editarTurno(Turno tur) {
        this.persistencia.iniciarTransaccion();
        this.persistencia.modificar(tur);
        //agrego la cita al perfil del paciente
        //tur.getPacientes().agregarTurnos(tur);
        this.persistencia.modificar(tur.getPacientes());
        this.persistencia.confirmarTransaccion();
    }

    public void cancelarTurno(Turno t) {
        this.persistencia.iniciarTransaccion();
        t.setAsistencia(false);
        t.setPacientes(null);
        this.persistencia.modificar(t);

        this.persistencia.confirmarTransaccion();
    }

}
