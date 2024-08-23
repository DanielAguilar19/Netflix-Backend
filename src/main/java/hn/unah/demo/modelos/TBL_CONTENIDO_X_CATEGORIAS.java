package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_CONTENIDO_X_CATEGORIAS")
@Data
public class TBL_CONTENIDO_X_CATEGORIAS {
    @Id
    @Column(name = "id_subcategoria")
    Long idSubcategoria;
    // relacion contenido

    @ManyToOne()
    TBL_CATEGORIAS categoria;

    @ManyToOne()
    TBL_CONTENIDO contenido;
    // relacion subcategoria

}
