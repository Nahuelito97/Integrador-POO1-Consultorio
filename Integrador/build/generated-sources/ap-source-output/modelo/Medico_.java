package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Especialidad;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-10T00:12:49")
@StaticMetamodel(Medico.class)
public class Medico_ { 

    public static volatile SingularAttribute<Medico, String> apellidos;
    public static volatile SingularAttribute<Medico, Integer> duracionturno;
    public static volatile ListAttribute<Medico, Especialidad> especialidades;
    public static volatile SingularAttribute<Medico, String> matricula;
    public static volatile SingularAttribute<Medico, Date> horatermina;
    public static volatile SingularAttribute<Medico, Date> horacomienzo;
    public static volatile SingularAttribute<Medico, Long> id;
    public static volatile SingularAttribute<Medico, String> telefono;
    public static volatile SingularAttribute<Medico, String> nombres;

}