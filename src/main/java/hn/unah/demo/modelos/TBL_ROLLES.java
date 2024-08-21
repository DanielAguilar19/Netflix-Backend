package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_ROLLES")
@Data
public class TBL_ROLLES {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ROLL")
    private Long idRol;

    @Column(name = "NOMBRE_ROLL")
    private String nombreRoll;

    @Column(name = "DESCRIPCION_ROLL")
    private String descripcionRoll;

    // relacion con la tabla de usuarios;

}
