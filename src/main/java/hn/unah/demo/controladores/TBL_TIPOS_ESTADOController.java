package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_TIPOS_ESTADOService;

@RestController
@RequestMapping("/api/tipo/estado")

public class TBL_TIPOS_ESTADOController {

    @Autowired
    private TBL_TIPOS_ESTADOService tbl_TIPOS_ESTADOService;
    
}
