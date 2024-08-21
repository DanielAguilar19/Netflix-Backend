package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_REPARTOService;

@RestController
@RequestMapping("/api/reparto")

public class TBL_REPARTOController {

    @Autowired
    private TBL_REPARTOService tbl_REPARTOService;
    
}
