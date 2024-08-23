package hn.unah.demo.modelos;

<<<<<<< HEAD
import java.util.List;

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
<<<<<<< HEAD
@Table(name = "TBL_CARGOS")
@Data
public class TBL_CARGOS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_CARGO")
    private long codigoCargo;
=======
@Table(name = "TBL_CARGO")
@Data

public class TBL_CARGOS {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_CARGO")
    private Long codigoCargo;
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce

    @Column(name = "NOMBRE_CARGO")
    private String nombreCargo;

<<<<<<< HEAD
    /********************************************/
    // relacion de uno a muchos con la tabla contratos
    @OneToMany(mappedBy = "cargo", cascade = CascadeType.ALL)
    private List<TBL_CONTRATOS> listaContratosPorCargo;

=======
  
    //no tiene relacion
    
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
}
