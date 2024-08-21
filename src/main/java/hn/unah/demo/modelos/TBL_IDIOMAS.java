package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "")
@Data

public class TBL_IDIOMAS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DESCRIPCION")
    private Long idDescripcion;

    @Column(name = "TITULO_DESCRIPCION")
    private String tituloDescripcion;

    @Column(name = "DESCRIPCION")
    private String descripcion;
    
}
