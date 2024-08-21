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

public class TBL_SERIES {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_GENERO")
    private Long idGenero;

    @Column(name = "NOMBRE_GENERO")
    private String nombreGenero;

    // no tiene relacion
    
}
