package hn.unah.demo.modelos;

<<<<<<< HEAD
=======


>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
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

<<<<<<< HEAD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_REGISTRO")
    private long codigoRegistro;

    @Column(name = "CODIGO_IDIOMA") // FK esta es una tabla intermedia entre conetenido y idiomas
    private long codigoIdioma;

    @Column(name = "CODIGO_CONTENIDO")
    private long codigoContenido;
=======
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_REGISTRO")
    private Long codigoRegistro;

    //relacion con idioma 


    //relacion con contenido
    

   

    
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce

}
