package modelo;

//import java.io.Serializable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "turnos")
public class Turno implements Serializable {

    @Id
    @SequenceGenerator(name = "sec_turnos", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_turnos")
    private long idturno;
    @ManyToOne
    private Paciente pacientes;
    @OneToOne
    private Medico medicos;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date horacomienzo;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date horatermina;
    private boolean disponible; //recomendacion del profesor 
    private boolean asistencia; //recomendacion del profesor 

    public Turno() {
    }

    public Turno(Medico medicos, Date horacomienzo,
            Date horatermina, Paciente pacientes) {
        this.pacientes = pacientes;
        this.medicos = medicos;
        this.horacomienzo = horacomienzo;
        this.horatermina = horatermina;

    }

    public Turno(Date horacomienzo, Date horatermina, boolean disponible) {
        this.horacomienzo = horacomienzo;
        this.horatermina = horatermina;
        this.disponible = disponible;

    }

    public long getIdturno() {
        return idturno;
    }

    public void setIdturno(long idturno) {
        this.idturno = idturno;
    }

    public Paciente getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente pacientes) {
        this.pacientes = pacientes;
    }

    public Medico getMedicos() {
        return medicos;
    }

    public void setMedicos(Medico medicos) {
        this.medicos = medicos;
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

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    @Override
    public String toString() {
        return this.idturno + " " + this.medicos + " ";

    }

}
