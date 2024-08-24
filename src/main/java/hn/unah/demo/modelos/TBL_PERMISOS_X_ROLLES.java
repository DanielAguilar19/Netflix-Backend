package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TBL_PERMISOS_X_ROLLES")
@Data

public class TBL_PERMISOS_X_ROLLES {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    @Column(name = "CODIGO_PERMISO") // FK // esta es una tabla intermedia entre tbl rolles y tbl permisos
    private long codigoPermiso;

    @Column(name = "CODIGO_ROL") // FK
    private long codigoRoll;

}
