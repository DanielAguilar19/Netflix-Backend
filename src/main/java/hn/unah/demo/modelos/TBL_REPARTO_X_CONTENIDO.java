package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_REPARTO_X_CONTENIDO")
@Data

public class TBL_REPARTO_X_CONTENIDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_REGISTRO_RC")
    private Long codigoRepartoContenido;

    @Column(name = "CODIGO_REPARTO") // FK
    private TBL_REPARTO reparto;

    // cambiar en la base de datos por codigo_contenido

    @Column(name = "CODIGO_CONTENIDO") // FK
    private TBL_CONTENIDO contenido;

}
