package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.modelos.TBL_PERSONAS;
import hn.unah.demo.modelos.TBL_USUARIOS;
import hn.unah.demo.servicios.TBL_PERSONASService;

@RestController
@RequestMapping("/api/persona")

public class TBL_PERSONASController {

    @Autowired
    private TBL_PERSONASService tbl_PERSONAService;

    @PostMapping("/crear/nuevo")
    public TBL_PERSONAS postMethodName(@RequestBody TBL_PERSONAS nvoUsuario, @RequestParam String contrasenia) {
        return this.tbl_PERSONAService.crearNuevaPersona(nvoUsuario, contrasenia);
    }

}
