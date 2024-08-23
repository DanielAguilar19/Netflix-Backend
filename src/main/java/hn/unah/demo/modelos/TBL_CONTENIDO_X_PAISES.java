package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_CONTENIDO_X_PAISES")
@Data

public class TBL_CONTENIDO_X_PAISES {
        // relacion entre contenido
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "CODIGO_REGISTRO_CP")
        private long codigoRegistro;

        @Column(name = "DISPONIBLE")
        private boolean disponible;

        @Column(name = "CODIGO_CONTENIDO") // FK
        private long contenido;

        @Column(name = "CODIGO_UBICACION") // FK
        private long ubicacion;
}
