package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_TIPOS_ESTADO")
@Data

public class TBL_TIPOS_ESTADO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_ESTADO")
    private Long codigoEstado;

   

    @Column(name = "TIPO_ESTADO")
    private String tipoEstado;
    
}
