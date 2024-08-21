package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_CONTENIDO_GENEROSService;

@RestController
@RequestMapping("/api/contenido/genero")

public class TBL_CONTENIDO_GENEROSControllers {

    @Autowired 
    private TBL_CONTENIDO_GENEROSService tbl_CONTENIDO_GENEROSService;
    
}
