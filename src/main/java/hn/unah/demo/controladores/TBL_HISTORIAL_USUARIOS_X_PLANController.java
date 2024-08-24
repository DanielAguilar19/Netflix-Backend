package hn.unah.demo.controladores;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.modelos.TBL_HISTORIAL_USUARIOS_X_PLAN;
import hn.unah.demo.modelos.TBL_USUARIOS_TARJETAS;
import hn.unah.demo.servicios.TBL_HISTORIAL_USUARIOS_X_PLANService;

@RestController
@RequestMapping("/api/historial/pagos")

public class TBL_HISTORIAL_USUARIOS_X_PLANController {

    private TBL_HISTORIAL_USUARIOS_X_PLANService tbl_HISTORIAL_PAGOSService;

    // metodo para seleccionar un plan y ejecutar el pago
    @PostMapping("/seleccionarPlan")
    public TBL_HISTORIAL_USUARIOS_X_PLAN registrarPlanSeleccionado(@RequestParam long codigoUsuario,
            long codigoTipoPlan,
            long codigoTipoPago, @RequestBody TBL_USUARIOS_TARJETAS codigoTarjeta) {

        return this.tbl_HISTORIAL_PAGOSService.crearNvoRegistroDeAdquisicionPlan(codigoUsuario, codigoTipoPlan,
                codigoTarjeta, codigoTipoPago);

    }

}
