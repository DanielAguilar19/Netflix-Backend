package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_CONTRATOService;

@RestController
@RequestMapping("/api/contratos")

public class TBL_CONTRATOSController {

    @Autowired
    private TBL_CONTRATOService tbl_CONTRATOService;
    
}
