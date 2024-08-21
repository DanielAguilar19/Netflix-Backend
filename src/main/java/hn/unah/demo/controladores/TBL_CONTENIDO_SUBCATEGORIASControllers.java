package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_CONTENIDO_SUBCATEGORIASService;

@RestController
@RequestMapping("/api/contenido/subcategoria")

public class TBL_CONTENIDO_SUBCATEGORIASControllers {
    @Autowired

    private TBL_CONTENIDO_SUBCATEGORIASService tbl_CONTENIDO_SUBCATEGORIASService;
    
}
