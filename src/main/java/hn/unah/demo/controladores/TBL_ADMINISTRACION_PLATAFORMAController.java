package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_ADMINISTRACION_PLATAFORMAService;

@RestController
@RequestMapping("")

public class TBL_ADMINISTRACION_PLATAFORMAController {

    @Autowired 
    private TBL_ADMINISTRACION_PLATAFORMAService tbl_ADMINISTRACION_PLATAFORMAService;
    
}
