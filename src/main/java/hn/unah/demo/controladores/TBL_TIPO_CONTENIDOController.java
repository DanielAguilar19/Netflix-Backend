package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_TIPO_CONTENIDOService;

@RestController
@RequestMapping("/api/tipo/contenido")

public class TBL_TIPO_CONTENIDOController {

    @Autowired
    private TBL_TIPO_CONTENIDOService tbl_TIPO_CONTENIDOService;
    
}
