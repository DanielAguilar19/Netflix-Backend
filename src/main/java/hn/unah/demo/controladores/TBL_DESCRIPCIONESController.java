package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_DESCRIPCIONESService;

@RestController
@RequestMapping("/api/descripciones")

public class TBL_DESCRIPCIONESController {

    @Autowired
    private TBL_DESCRIPCIONESService tbl_DESCRIPCIONESService;
    
}
