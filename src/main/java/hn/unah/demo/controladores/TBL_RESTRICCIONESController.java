package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_RESTRICCIONEService;

@RestController
@RequestMapping("")

public class TBL_RESTRICCIONESController {

    @Autowired
    private TBL_RESTRICCIONEService tbl_RESTRICCIONEService;
    
}
