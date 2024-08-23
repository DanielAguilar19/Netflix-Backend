package hn.unah.demo.modelos;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TBL_HISTRIAL_PAGOS") //cambiar en la base de datos 
@Data

public class TBL_HISTORIAL_PAGOS {

    //CODIGO_HISTORIAL_PAGO   
   
    //FECHA_PAGO        
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_HISTORIAL_PAGO")
    private long codigoHistorial;

    @CreationTimestamp
    @Column(name = "FECHA_PAGO")
    @JsonProperty("fechaPago")
    private LocalDateTime fechaPago;


     //CODIGO_REGISTRO         
    //CODIGO_TIPO_PAGO        
    //CODIGO_REGISTRO_TARJETA 

    

    
}
