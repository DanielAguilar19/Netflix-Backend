package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_HISTORIAL_VISUALIZACIONESService;

@RestController
@RequestMapping("/api/historial")

public class TBL_HISTORIA_VISUALIZACIONESController {

    @Autowired

    private TBL_HISTORIAL_VISUALIZACIONESService tbl_HISTORIAL_VISUALIZACIONESService;
    
}
