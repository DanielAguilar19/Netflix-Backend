package hn.unah.demo.modelos;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_RESTRICCIONES")
@Data

public class TBL_RESTRICCIONES {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_RESTRICCION")
    private Long codigoRestriccion;

    @Column(name = "EDAD_INICIAL")
    private Integer edadInicial;

    @Column(name = "TIPO_RESTRICCION")
    private String tipoRestriccion;

    @Column(name = "EDAD_FINAL")
    private Integer edadFinal;
   
    
}
