package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_USUARIOS_PLANESService;

@RestController
@RequestMapping("/api/usuario/planes")

public class TBL_USUARIOS_PLANESController {

    @Autowired
    private TBL_USUARIOS_PLANESService tbl_USUARIOS_PLANESService;
    
}
