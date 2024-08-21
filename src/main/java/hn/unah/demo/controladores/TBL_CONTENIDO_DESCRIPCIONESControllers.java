package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_CONTENIDO_DESCRIPCIONESService;

@RestController
@RequestMapping("/api/contenido/descripciones")

public class TBL_CONTENIDO_DESCRIPCIONESControllers {

    @Autowired 
    private TBL_CONTENIDO_DESCRIPCIONESService tbl_CONTENIDO_DESCRIPCIONESService;
    
}
