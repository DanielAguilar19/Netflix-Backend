package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_REPARTO_X_CONTENIDOService;

@RestController
@RequestMapping("/api/reparto/contenido")

public class TBL_REPARTO_X_CONTENIDOControllers {

    @Autowired 
    private TBL_REPARTO_X_CONTENIDOService tbl_REPARTO_CONTENIDOService;
    
}
