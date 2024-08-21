package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_SUBCATEGORIASService;

@RestController
@RequestMapping("/api/subcategoria")

public class TBL_SUCATEGORIASController {

    @Autowired
    private TBL_SUBCATEGORIASService tbl_SUBCATEGORIASService;
    
}
