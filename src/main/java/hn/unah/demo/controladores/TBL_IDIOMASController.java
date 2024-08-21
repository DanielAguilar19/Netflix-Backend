package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_IDIOMASService;

@RestController
@RequestMapping("/api/idiomas")

public class TBL_IDIOMASController {

    @Autowired
    private TBL_IDIOMASService tbl_IdiomasService;
    
}
