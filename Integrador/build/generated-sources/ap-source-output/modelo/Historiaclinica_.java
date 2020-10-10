package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Medico;
import modelo.Paciente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-10T00:12:49")
@StaticMetamodel(Historiaclinica.class)
public class Historiaclinica_ { 

    public static volatile SingularAttribute<Historiaclinica, Date> fechahistoriaclinica;
    public static volatile SingularAttribute<Historiaclinica, Medico> medico;
    public static volatile SingularAttribute<Historiaclinica, String> observaciones;
    public static volatile SingularAttribute<Historiaclinica, Long> id;
    public static volatile SingularAttribute<Historiaclinica, Paciente> pacienteH;
    public static volatile SingularAttribute<Historiaclinica, String> medicamentos;

}