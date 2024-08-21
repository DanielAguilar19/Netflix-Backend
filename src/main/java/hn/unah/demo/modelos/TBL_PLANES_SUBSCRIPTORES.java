package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_PLANES_SUBSCRIPTORES")
public class TBL_PLANES_SUBSCRIPTORES {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PLAN")
    private Long idPlan;

    @Column(name = "NOMBE_PLAN")
    private String nombrePlan;

    @Column(name = "PRECIO")
    private Double precio;

    @Column(name = "PERFIELES_DISPOSICIONES")
    private Integer perfilesDisposiciones;

    @Column(name = "MIEMBROS_EXTRAS")
    private Integer miembrosExtras;

    // realcion con la tabla usarios

}
