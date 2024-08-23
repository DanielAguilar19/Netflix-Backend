package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_CONTENIDO_X_CATEGORIAS")
@Data
public class TBL_CONTENIDO_X_CATEGORIAS {
    @Id
    @Column(name = "CODIGO_CONTENIDO_X_CATEGORIAS")
    private Long codigoContenidoXcategorias;
    // relacion contenido

    @Column(name = "CODIGO_CATEGORIA") // FK
    private long categoria;

    @Column(name = "CODIGO_CONTENIDO") // FK
    private long contenido;

}
