package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_CONTENIDO_PAISESService;

@RestController
@RequestMapping("/api/contenido/paises")

public class TBL_CONTENIDO_PAISESControllers {

    @Autowired 
    private TBL_CONTENIDO_PAISESService tbl_CONTENIDO_PAISESService;
    
}
