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
@IdClass(TBL_PERMISOS_X_ROLLES.class)
public class TBL_PERMISOS_X_ROLLES {

    @Id
    @Column(name = "CODIGO_PERMISO") // FK // esta es una tabla intermedia entre tbl rolles y tbl permisos
    private long codigoPermiso;

    @Id
    @Column(name = "CODIGO_ROL") // FK
    private long codigoRoll;

}
