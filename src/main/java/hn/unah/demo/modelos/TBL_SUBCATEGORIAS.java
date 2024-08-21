package hn.unah.demo.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_SUBCATEGORIAS")
@Data

public class TBL_SUBCATEGORIAS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SUBCATEGORIA")
    private Long idSubcategorias;

    @Column(name = "NOMBRE_SUBCATEGORIA")
    private String nombreSubcategorias;


    //relacion de categorias con subcategorias 

    
}
