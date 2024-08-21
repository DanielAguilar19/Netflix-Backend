package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_EMPLEADOSService;

@RestController
@RequestMapping("")

public class TBL_EMPLEADOSController {

    @Autowired
    private TBL_EMPLEADOSService tbl_EMPLEADOSService;
    
}
