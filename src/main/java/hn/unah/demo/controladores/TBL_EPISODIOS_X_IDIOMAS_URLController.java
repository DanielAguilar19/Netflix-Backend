package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_EPISODIOS_X_IDIOMAS_URLService;

@RestController
@RequestMapping("/api/episodio/idioma")

public class TBL_EPISODIOS_X_IDIOMAS_URLController {

    @Autowired
    private TBL_EPISODIOS_X_IDIOMAS_URLService tbl_EPISODIO_IDIOMAS_URLService;
    
}
