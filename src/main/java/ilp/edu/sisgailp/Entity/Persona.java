package ilp.edu.sisgailp.Entity;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="persona")
@Inheritance(strategy = InheritanceType.JOINED)

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona", length = 100)
    private Long idpersona;

    @Column(name = "nombre", length = 100)
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private Date fechanacimiento;
    private String genero
}
