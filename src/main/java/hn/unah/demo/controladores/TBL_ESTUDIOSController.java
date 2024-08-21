package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_ESTUDIOSService;

@RestController
@RequestMapping("/api/estudio")

public class TBL_ESTUDIOSController {

    @Autowired
    private TBL_ESTUDIOSService tbl_ESTUDIOSService;
    
}
