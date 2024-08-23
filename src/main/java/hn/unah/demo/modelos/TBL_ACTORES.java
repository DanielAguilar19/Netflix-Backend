package hn.unah.demo.modelos;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_ACTORES")
@Data
public class TBL_ACTORES {
    @Id
    @Column(name = "CODIGO_ACTOR")
    private Integer codigoActor;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "BIOGRAFIA")
    private String biografia;

    @Column(name = "FECHA_NACIMIENTO")
    private LocalDate fechaNacimiento;

    @ManyToMany(mappedBy = "listaActores", cascade = CascadeType.ALL)
    private List<TBL_CONTENIDO> listaContenidoActores;

}
