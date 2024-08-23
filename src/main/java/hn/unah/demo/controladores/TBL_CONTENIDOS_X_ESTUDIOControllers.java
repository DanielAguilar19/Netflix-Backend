package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_CONTENIDOS_X_ESTUDIOService;

@RestController
@RequestMapping("/api/contenido/estudios")

public class TBL_CONTENIDOS_X_ESTUDIOControllers {

    @Autowired
    private TBL_CONTENIDOS_X_ESTUDIOService tbl_CONTENIDOS_X_ESTUDIOService;
    
}
