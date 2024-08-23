package hn.unah.demo.modelos;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_TIPO_PLANES_SUSCRIPCION")
@Data

public class TBL_TIPO_PLANES_SUSCRIPCION {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PLAN")
    private Long idPlan;

    @Column(name = "NOMBRE_PLAN")
    private String nombrePlan;

    @Column(name = "PRECIO")
    private Integer primerApellido;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "PERFILES_DISPONIBLE")
    private Integer perfilesDisponiles;

    @Column(name = "MIEMBROS_EXTRA")
    private Integer miemrosExtras;

    @Column(name = "RESOLUCION")
    private String resolucion;

    
    
}
