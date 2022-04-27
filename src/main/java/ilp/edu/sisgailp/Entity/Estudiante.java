package ilp.edu.sisgailp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "IDPERSONA")
public class Estudiante extends Persona {
    @Column(name ="codigo", length = 10, nullable = false)
    private String codigo;
    @Column(name ="serie", length = 10)
    private String serie;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
