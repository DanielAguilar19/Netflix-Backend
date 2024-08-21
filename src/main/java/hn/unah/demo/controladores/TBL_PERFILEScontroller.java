package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_PERFILEService;

@RestController
@RequestMapping("/api/perfiles")

public class TBL_PERFILEScontroller {

    @Autowired

    private TBL_PERFILEService tbl_PERFILEService;
    
}
