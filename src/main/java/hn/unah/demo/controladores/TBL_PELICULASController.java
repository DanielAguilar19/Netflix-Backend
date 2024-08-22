package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_PELICULASService;

@RestController
@RequestMapping("/api/peliculas")

public class TBL_PELICULASController {

    @Autowired
    private TBL_PELICULASService tbl_PELICULASService;
    
}
