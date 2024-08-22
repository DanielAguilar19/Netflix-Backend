package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_DEPARTAMENTO_LABORALService;

@RestController
@RequestMapping("/api/departamento/laboral")

public class TBL_DEPARTAMENTO_LABORALController {

    @Autowired
    private TBL_DEPARTAMENTO_LABORALService tbl_DEPARTAMENTO_LABORALService;
    
}
