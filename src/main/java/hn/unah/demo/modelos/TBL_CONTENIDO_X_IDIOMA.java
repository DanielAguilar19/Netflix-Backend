package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_CONTENIDO_X_IDIOMA") // CAMBIAR EN LA BASE DE DATOS; AHI SALE COMO CONTENDIO
@Data
public class TBL_CONTENIDO_X_IDIOMA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_REGISTRO_CI")
    private long codigoRegistro;

    @Column(name = "CODIGO_IDIOMA") // FK esta es una tabla intermedia entre conetenido y idiomas
    private long codigoIdioma;

    @Column(name = "CODIGO_CONTENIDO") // FK
    private long codigoContenido;

}
