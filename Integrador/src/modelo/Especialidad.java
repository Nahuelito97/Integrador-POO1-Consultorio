/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author nahuel
 */
@Entity
@Table(name = "especialidades")
public class Especialidad implements Serializable {

    @SequenceGenerator(name = "sec_especialidad", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sec_especialidad")

    @Id
    private long id;
    private String nombre;

    @ManyToMany(mappedBy = "especialidades")
    private List<Medico> medico;

    public Especialidad() {
    }

    public Especialidad(String nombre) {
        this.nombre = nombre;
        //this.medico = new ArrayList<>();;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Medico> getMedico() {
        return medico;
    }

    public void setMedico(List<Medico> medico) {
        this.medico = medico;
    }

    public void agregarMedico(Medico m) {
        this.medico.add(m);
    }

    public void quitarMedico(Medico m) {
        this.medico.remove(m);
    }

    @Override
    public String toString() {
        return this.id + " : " + this.nombre;
    }
}
