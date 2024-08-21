package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_PERMISOSService;

@RestController
@RequestMapping("/api/permisos")

public class TBL_PERMISOSController {

    @Autowired
    private TBL_PERMISOSService tbl_PERMISOSService;
    
}
