package hn.unah.demo.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_HISTORIAL_PAGOSService;

@RestController
@RequestMapping("/api/historial/pagos")

public class TBL_HISTORIAL_PAGOSController {

    private TBL_HISTORIAL_PAGOSService tbl_HISTORIAL_PAGOSService;
    
}
