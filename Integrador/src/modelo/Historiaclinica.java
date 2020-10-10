/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "historiaclinica")
public class Historiaclinica implements Serializable {

    @Id
    @SequenceGenerator(name = "sec_hclinica", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_hclinica")

    private long id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechahistoriaclinica;
    private String observaciones;
    @ManyToOne
    private Paciente pacienteH;
    @OneToOne
    private Medico medico;
    private String medicamentos;

    public Historiaclinica() {
    }

    public Historiaclinica(Paciente pacientehis, Date fechahistoriaclinica, String observaciones, String medicamentos, Medico medico) {
        this.pacienteH = pacientehis;
        this.fechahistoriaclinica = fechahistoriaclinica;
        this.observaciones = observaciones;
        this.medicamentos = medicamentos;
        this.medico = medico;
    }

    public long getId() {
        return id;
    }

    public Paciente getPacientehis() {
        return pacienteH;
    }

    public void setPacientehis(Paciente pacientehis) {
        this.pacienteH = pacientehis;
    }

    public Date getFecha() {
        return fechahistoriaclinica;
    }

    public void setFecha(Date fecha) {
        this.fechahistoriaclinica = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return this.id + " : " +  this.pacienteH.getNombres() + " " + this.medico.getNombres() + "";

    }

}
