package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_SERIES")
@Data

public class TBL_SERIES {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_SERIE")
    private Long codigoSerie;

    @Column(name = "NUMERO_TEMPORADAS")
    private Integer numeroTemporada;

    

    // contenido
    
}
