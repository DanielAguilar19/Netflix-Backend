package hn.unah.demo.modelos;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_ADMINISTRADORES_PLATAFORMA")
@Data

public class TBL_ADMINISTRACION_PLATAFORMA {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_ADMINSITRADOR")
    private Long idActores;

    @Column(name = "USUARIO_ADMINISTRACION")
    private String usuarioAdministracion;


    @Column(name = "CONTRASENIA")
    private String contra;

    //relacin con roles 

    //relacion con empleados
    
}
