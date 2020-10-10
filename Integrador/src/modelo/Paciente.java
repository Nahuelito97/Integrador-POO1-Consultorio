package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author wagne
 */
@Entity
@Table(name = "pacientes")
public class Paciente implements Serializable {

    //ATRIBUTOS DE UN PACIENTE
    @Id
    @SequenceGenerator(name = "sec_pac", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_pac")
    private long idpac;
    private String nombres;
    private String apellidos;
    private String dni;
    private String direccion;
    private String telefono;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechanacimiento;

    @OneToMany(mappedBy = "pacientes")
    private List<Turno> listaTurnos;

    @OneToMany(mappedBy = "pacienteH")
    private List<Historiaclinica> historiasClinicasCompletas;

    //Constructores
    public Paciente() {
        this.listaTurnos = new ArrayList<>();
        this.historiasClinicasCompletas = new ArrayList<>();
    }

    public Paciente(String nombres, String apellidos, String dni, String direccion, String telefono, Date fechanacimiento) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechanacimiento = fechanacimiento;
        this.listaTurnos = new ArrayList<>();
        this.historiasClinicasCompletas = new ArrayList<>();
    }

    //Getters y Setters
    public long getIdpac() {
        return idpac;
    }

    public void setIdpac(long idpac) {
        this.idpac = idpac;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public List<Historiaclinica> getHistoriasClinicasCompletas() {
        return historiasClinicasCompletas;
    }

    public void setHistoriasClinicasCompletas(List<Historiaclinica> historiasClinicasCompletas) {
        this.historiasClinicasCompletas = historiasClinicasCompletas;
    }

    public void agregarHistoriaClinica(Historiaclinica historias) {
        this.historiasClinicasCompletas.add(historias);
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public void agregarTurnoss(Turno tur) {
        this.listaTurnos.add(tur);
    }

    public void quitarTurnos(Turno tur) {
        this.listaTurnos.remove(tur);
    }

    @Override
    public String toString() {
        return this.idpac + " : " + this.apellidos + " " + this.nombres + " ";
    }
}
