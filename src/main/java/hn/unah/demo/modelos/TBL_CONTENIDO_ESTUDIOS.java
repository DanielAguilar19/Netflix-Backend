package hn.unah.demo.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_CONTENIDO_ESTUDIO")
@Data

public class TBL_CONTENIDO_ESTUDIOS {

    @Id
    @Column(name = "CODIGO_CONTENIDO_ESTUDIO")
    private Integer codigoEntityContenidoEstudio;

    @Column(name = "CODIGO_CONTENIDO") // FK
    private long contenido;

    @Column(name = "CODIGO_ESTUDIO") // FK
    private long estudio; // estudio de grabacion
    // relacion entre estudio y contenido estadio

    // relacion entre contenido y contenido estudio

}
