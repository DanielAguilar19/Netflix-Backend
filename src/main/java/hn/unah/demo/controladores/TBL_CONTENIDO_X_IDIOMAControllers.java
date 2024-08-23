package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_CONTENIDO_X_IDIOMAService;

@RestController
@RequestMapping("/api/contenido/idioma")
public class TBL_CONTENIDO_X_IDIOMAControllers {

    @Autowired

    private TBL_CONTENIDO_X_IDIOMAService tbl_contenidoIdiomaService;

    
}
