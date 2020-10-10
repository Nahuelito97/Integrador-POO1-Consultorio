package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "medicos")
public class Medico implements Serializable {

    //atributos
    @SequenceGenerator(name = "sec_medicos ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_medicos")
    @Id
    private long id;
    private String matricula;
    private String apellidos;
    private String nombres;
    private String telefono;

    @ManyToMany//ARREGLAR
    private List<Especialidad> especialidades;//tener en cuanta crear el array list aca

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date horacomienzo;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date horatermina;
    private int duracionturno;

    //Constructores
    public Medico() {
        this.especialidades = new ArrayList<>();
    }

    public Medico(String matricula, String apellidos, String nombres, String telefono,
            Especialidad especialidades, Date horacomienzo, Date horatermina, int duracionturno) {
        this.matricula = matricula;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.telefono = telefono;
        this.especialidades = new ArrayList<>();
        this.horacomienzo = horacomienzo;
        this.horatermina = horatermina;
        this.duracionturno = duracionturno;
    }

    //Getters y Setters
    public long getId() {
        return this.id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getHoracomienzo() {
        return horacomienzo;
    }

    public void setHoracomienzo(Date horacomienzo) {
        this.horacomienzo = horacomienzo;
    }

    public Date getHoratermina() {
        return horatermina;
    }

    public void setHoratermina(Date horatermina) {
        this.horatermina = horatermina;
    }

    public int getDuracionturno() {
        return duracionturno;
    }

    public void setDuracionturno(int duracionturno) {
        this.duracionturno = duracionturno;
    }

    public void agregarEspecialidad(Especialidad e) {
        this.especialidades.add(e);
    }

    public void quitarEspecialidad(Especialidad e) {
        this.especialidades.remove(e);
    }

    @Override
    public String toString() {
        return this.id + " : " + " ( " + this.matricula + " ) " + this.apellidos + " " + this.nombres + " ";
    }

}
