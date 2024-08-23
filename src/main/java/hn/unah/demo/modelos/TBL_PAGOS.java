package hn.unah.demo.modelos;

import java.time.LocalDate;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

public class TBL_PAGOS {
    @Id
    @Column(name = "CODIGO_PAGO")
    private Integer codigoPago;

}
