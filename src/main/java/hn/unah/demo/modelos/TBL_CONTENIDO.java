package hn.unah.demo.modelos;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_CONTENIDO")
@Data
public class TBL_CONTENIDO {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONTENIDO")
    private Long idConteido ;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @CreationTimestamp
    @Column(name = "FECHA_LANZAMIENTO")
    private LocalDateTime fechaLanzamiento;



    @Column(name ="CATEGORIA_PRINCIPAL")
    private Integer categoriaPrincipal;

    @Column(name ="RESTRICCION_EDAD")
    private Integer restriccionEdad;

    @Column(name ="DESCRIPCION_RESTRICCION")
    private String descripcionRestriccion;

    
     //relacion con tipo contenido 

     //categoria

     //codigo restricciones

    
}
