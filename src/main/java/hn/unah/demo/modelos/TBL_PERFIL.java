package hn.unah.demo.modelos;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_PERFILES")
@Data

public class TBL_PERFIL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_PERFIL")
    private Long codigoPerfil;

    @Column(name = "NOMBRE_PERFIL")
    private String nombrePerfil;


    @Column(name = "REPRODUCCION_AUTOMATICA")
    private Integer reproduccionAutomatica;


    //no tiene relaciones
    
}
