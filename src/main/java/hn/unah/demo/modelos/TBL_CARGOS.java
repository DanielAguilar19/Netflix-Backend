package hn.unah.demo.modelos;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_CARGO")
@Data

public class TBL_CARGOS {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_CARGO")
    private Long codigoCargo;

    @Column(name = "NOMBRE_CARGO")
    private String nombreCargo;

  
    //no tiene relacion
    
}
