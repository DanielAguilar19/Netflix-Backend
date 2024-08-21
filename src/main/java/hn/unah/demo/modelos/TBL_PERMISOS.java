package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_PERMISOS")
@Data

public class TBL_PERMISOS {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERMISO")
    private Long idPermiso;

    @Column(name = "NOMBRE_PERMISO")
    private String nombrePermiso;

    @Column(name = "DESCRIPCION")
    private String descripcion;
    
}
