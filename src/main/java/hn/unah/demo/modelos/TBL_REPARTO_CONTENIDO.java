package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Table(name = "TBL_REPARTO_CONTENIDO")
@Data

public class TBL_REPARTO_CONTENIDO {
    @Id
    @Column(name = "CODIGO_REPARTO_CONTENIDO")
    private Long codigoRepartoContenido;

    @Column(name = "CODIGO_REPARTO")
    private TBL_REPARTO reparto;

    @Column(name = "CODIGO_CONTENIDO")
    private TBL_CONTENIDO contenido;

<<<<<<< HEAD
=======
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_REGISTRO")
    private Long codigoRegistro;

    //reparto

    //contenido

    
    
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
}
