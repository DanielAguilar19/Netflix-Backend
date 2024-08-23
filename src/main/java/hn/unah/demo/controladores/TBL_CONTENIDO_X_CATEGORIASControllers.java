package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_CONTENIDO_X_CATEGORIASService;

@RestController
@RequestMapping("/api/contenido/categoria")

public class TBL_CONTENIDO_X_CATEGORIASControllers {
    @Autowired

    private TBL_CONTENIDO_X_CATEGORIASService tbl_CONTENIDO_SUBCATEGORIASService;
    
}
