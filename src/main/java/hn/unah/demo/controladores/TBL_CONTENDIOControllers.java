package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_CONTENIDOServices;

@RestController
@RequestMapping("/api/contenido")

public class TBL_CONTENDIOControllers {
        @Autowired

        private TBL_CONTENIDOServices tblContenido;

}

