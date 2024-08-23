package hn.unah.demo.modelos;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_CATEGORIAS")
@Data
public class TBL_CATEGORIAS {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_CATEGORIA")
    private Long idCategoria;

    @Column(name = "NOMBRE_CATEGORIA")
    private String nombreCategoria;

    @ManyToMany
    @JoinTable(name = "TBL_CONTENIDO_X_CATEGORIA", joinColumns = @JoinColumn(name = "CODIGO_CATEGORIA", referencedColumnName = "CODIGO_CATEGORIA"), inverseJoinColumns = @JoinColumn(name = "CODIGO_CONTENIDO", referencedColumnName = "CODIGO_CONTENIDO"))
    private List<TBL_CONTENIDO> listaContenido;

}
