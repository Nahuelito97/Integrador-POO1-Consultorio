package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Historiaclinica;
import modelo.Turno;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-10T00:12:49")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, String> apellidos;
    public static volatile SingularAttribute<Paciente, Long> idpac;
    public static volatile SingularAttribute<Paciente, Date> fechanacimiento;
    public static volatile ListAttribute<Paciente, Historiaclinica> historiasClinicasCompletas;
    public static volatile SingularAttribute<Paciente, String> direccion;
    public static volatile SingularAttribute<Paciente, String> telefono;
    public static volatile SingularAttribute<Paciente, String> dni;
    public static volatile ListAttribute<Paciente, Turno> listaTurnos;
    public static volatile SingularAttribute<Paciente, String> nombres;

}