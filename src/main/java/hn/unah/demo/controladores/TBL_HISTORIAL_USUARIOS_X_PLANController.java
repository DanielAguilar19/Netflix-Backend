package hn.unah.demo.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_HISTORIAL_USUARIOS_X_PLANService;

@RestController
@RequestMapping("/api/historial/pagos")

public class TBL_HISTORIAL_USUARIOS_X_PLANController {

    private TBL_HISTORIAL_USUARIOS_X_PLANService tbl_HISTORIAL_PAGOSService;
    
}
