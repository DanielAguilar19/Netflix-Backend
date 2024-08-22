package hn.unah.demo.modelos;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_REPARTO")
@Data

public class TBL_REPARTO {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_REPARTO")
    private Long codigoReparto ;

    @Column(name = "NOMBRE")
    private String nombre;


    @Column(name = "APELLIDO")
    private String apellido;


    @Column(name = "DIRECTOR")
    private Integer director;


    @Column(name = "ACTOR")
    private Integer actor;

    
    
}
