package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_USUARIOS_TARJETASService;

@RestController
@RequestMapping("/api/usuario/tarjeta")

public class TBL_USUARIO_TARJETAController {

    @Autowired
    private TBL_USUARIOS_TARJETASService tbl_USUARIOS_TARJETASService;
    
}
