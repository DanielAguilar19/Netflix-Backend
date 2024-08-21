package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_CONTENIDO_DIRECTORESService;

@RestController
@RequestMapping("/api/contenido/directores")
public class TBL_CONTENIDO_DIRECTORESControllers {

    @Autowired

    private TBL_CONTENIDO_DIRECTORESService tbl_CONTENIDO_DIRECTORESService;

    
}
