package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_CONTENIDO_ACTOREService;
    
    @RestController

    @RequestMapping("/api/contenido/actores")

    public class TBL_CONTENIDO_ACTORESControllers {
    
        @Autowired

        private TBL_CONTENIDO_ACTOREService tblContenidoActoresService;
    }


