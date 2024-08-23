package hn.unah.demo.modelos;

<<<<<<< HEAD
=======


>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
import jakarta.persistence.ManyToOne;
=======
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_CONTENIDO_PAISES")
@Data

public class TBL_CONTENIDO_PAISES {
<<<<<<< HEAD
        // relacion entre contenido
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "CODIGO_REGISTRO")
        private long codigoRegistro;

        @Column(name = "DISPONIBLE")
        private boolean disponible;
=======

         @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_REGISTRO")
    private Long codigoRegistro;

    @Column(name = "DISPONIBLE")
    private Integer disponible;

  


        // relacion con uicacion 

        //relacion entre contenido
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce

        @Column(name = "CODIGO_CONTENIDO") // FK
        private long contenido;

        @Column(name = "CODIGO_UBICACION") // FK
        private long ubicacion;
}
