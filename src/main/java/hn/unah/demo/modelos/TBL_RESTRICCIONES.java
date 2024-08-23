package hn.unah.demo.modelos;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_RESTRICCIONES")
@Data
public class TBL_RESTRICCIONES {
    @Id
    @Column(name = "CODIGO_RESTRICCION")
    private Integer codigoRestriccion;

    @Column(name = "EDAD_INICIAL")
    private Integer edadInicial;

    @Column(name = "EDAD_FINAL")
    private Integer edadFinal;

    @Column(name = "TIPO_RESTRICCION")
    private String tipoRestriccion;

    @OneToMany(mappedBy = "restricciones", cascade = CascadeType.ALL)
    private List<TBL_CONTENIDO> contenidos;
}
