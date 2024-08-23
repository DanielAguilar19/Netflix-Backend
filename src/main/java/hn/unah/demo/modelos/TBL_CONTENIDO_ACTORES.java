package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Table(name = "TBL_CONTENIDO_ACTORES")
@Data

public class TBL_CONTENIDO_ACTORES {
    @Id
    @Column(name = "CODIGO_CONTENIDO_ACTORES")
    private Integer codigoContenidoActores;

    @Column(name = " CODIGO_CONTENIDO")
    private long codigoContenido;

    @Column(name = "CODIGO_ACTOR")
    private long codigoActor;
    // relacion entre contenido y contenido actores

    // relacion entre actores y contenido actores

}