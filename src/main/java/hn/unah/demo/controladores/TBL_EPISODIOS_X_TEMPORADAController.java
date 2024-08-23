package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_EPISODIOS_X_TEMPORADAService;

@RestController
@RequestMapping("/api/episodio/temporada")

public class TBL_EPISODIOS_X_TEMPORADAController {

    @Autowired
    private TBL_EPISODIOS_X_TEMPORADAService tbl_EPISODIOS_POR_TEMPORADAService;
    
}
