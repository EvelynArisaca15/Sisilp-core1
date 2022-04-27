package ilp.edu.sisgailp.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "docente")

public class Docente {

    private String codigodocente;
    private String cursos;
    private int horas;
}
