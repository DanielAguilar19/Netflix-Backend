package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_IDIOMAS")
@Data

public class TBL_IDIOMAS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_IDIOMA")
    private Long codigoIdioma;

    @Column(name = "NOMBRE_TIPO")
    private String nombreTipo;

    
    //no tiene
    
}
