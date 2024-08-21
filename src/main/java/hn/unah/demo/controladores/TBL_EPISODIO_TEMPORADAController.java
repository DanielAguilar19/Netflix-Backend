package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_EPISODIOS_TEMPORADAService;

@RestController
@RequestMapping("")

public class TBL_EPISODIO_TEMPORADAController {

    @Autowired
    private TBL_EPISODIOS_TEMPORADAService tbl_EPISODIOS_TEMPORADAService;
    
}
