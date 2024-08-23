package hn.unah.demo.modelos;

<<<<<<< HEAD
import java.util.List;

import javax.print.DocFlavor.STRING;

import jakarta.persistence.CascadeType;
=======
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
import jakarta.persistence.OneToMany;
=======
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_TIPO_CONTENIDO")
@Data
<<<<<<< HEAD
=======

>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
public class TBL_TIPO_CONTENIDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    @Column(name = "CODIGO_TIPO_CONTENIDO")
    private Long codigoTipoContenido;
=======
    @Column(name = "CODIGO_CONTENIDO")
    private Long codigoContenido ;
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce

    @Column(name = "NOMBRE_TIPO")
    private String nombreTipo;

<<<<<<< HEAD
    /******************************************/
    // relacion de uno a muchos con la tabla contenido
    @OneToMany(mappedBy = "tipoContenido", cascade = CascadeType.ALL)
    private List<TBL_CONTENIDO> listaContenido;
=======
    //no tiene
    
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
}
