package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Table(name = "")
@Data

public class TBL_REPARTO_CONTENIDO {
    @Id
    @Column(name = "CODIGO_REPARTO_CONTENIDO")
    private Long codigoRepartoContenido;

    @Column(name = "CODIGO_REPARTO")
    private TBL_REPARTO reparto;

    @Column(name = "CODIGO_CONTENIDO")
    private TBL_CONTENIDO contenido;

}
