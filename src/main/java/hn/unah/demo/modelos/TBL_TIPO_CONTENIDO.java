package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_TIPO_CONTENIDO")
@Data

public class TBL_TIPO_CONTENIDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_CONTENIDO")
    private Long codigoContenido ;

    @Column(name = "NOMBRE_TIPO")
    private String nombreTipo;

    //no tiene
    
}
