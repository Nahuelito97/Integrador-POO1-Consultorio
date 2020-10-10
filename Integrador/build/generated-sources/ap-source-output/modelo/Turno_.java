package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Medico;
import modelo.Paciente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-10T00:12:49")
@StaticMetamodel(Turno.class)
public class Turno_ { 

    public static volatile SingularAttribute<Turno, Boolean> asistencia;
    public static volatile SingularAttribute<Turno, Date> horatermina;
    public static volatile SingularAttribute<Turno, Paciente> pacientes;
    public static volatile SingularAttribute<Turno, Medico> medicos;
    public static volatile SingularAttribute<Turno, Date> horacomienzo;
    public static volatile SingularAttribute<Turno, Long> idturno;
    public static volatile SingularAttribute<Turno, Boolean> disponible;

}