package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_PELICULA_IDIOMA_URLService;

@RestController
@RequestMapping("/api/pelicula/idioma")

public class TBL_PELICULA_IDIOMAS_URLController {

    @Autowired
    private TBL_PELICULA_IDIOMA_URLService tbl_PELICULA_IDIOMA_URLService;
    
}
