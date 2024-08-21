package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_CONTENIDO_ESTUDIOSService;

@RestController
@RequestMapping("/api/contenido/estudios")

public class TBL_CONTENIDO_ESTUDIOSControllers {

    @Autowired
    private TBL_CONTENIDO_ESTUDIOSService tbl_CONTENIDO_ESTUDIOSService;
    
}
