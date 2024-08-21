package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_CATEGORIASService;

@RestController
@RequestMapping("/api/categorias")

public class TBL_CATEGORIASController {

    @Autowired
    private TBL_CATEGORIASService tbl_CATEGORIASService;
    
}
