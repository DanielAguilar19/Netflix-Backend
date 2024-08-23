package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_CONTENIDO_IDIOMA")
@Data
public class TBL_CONTENIDO_IDIOMA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_REGISTRO")
    private long codigoRegistro;

    @Column(name = "CODIGO_IDIOMA") // FK esta es una tabla intermedia entre conetenido y idiomas
    private long codigoIdioma;

    @Column(name = "CODIGO_CONTENIDO")
    private long codigoContenido;

}
