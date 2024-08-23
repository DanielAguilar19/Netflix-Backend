package hn.unah.demo.modelos;

<<<<<<< HEAD
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
=======


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_RESTRICCIONES")
@Data
<<<<<<< HEAD
public class TBL_RESTRICCIONES {
    @Id
    @Column(name = "CODIGO_RESTRICCION")
    private Integer codigoRestriccion;
=======

public class TBL_RESTRICCIONES {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_RESTRICCION")
    private Long codigoRestriccion;
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce

    @Column(name = "EDAD_INICIAL")
    private Integer edadInicial;

<<<<<<< HEAD
    @Column(name = "EDAD_FINAL")
    private Integer edadFinal;

    @Column(name = "TIPO_RESTRICCION")
    private String tipoRestriccion;

    @OneToMany(mappedBy = "restricciones", cascade = CascadeType.ALL)
    private List<TBL_CONTENIDO> contenidos;
=======
    @Column(name = "TIPO_RESTRICCION")
    private String tipoRestriccion;

    @Column(name = "EDAD_FINAL")
    private Integer edadFinal;
   
    
>>>>>>> c887a3b99722b504a7c804ac5504fc2f91c047ce
}
