package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_TIPO_PAGOService;

@RestController
@RequestMapping("/api/tipo/pago")

public class TBL_TIPO_PAGOController {

    @Autowired
    private TBL_TIPO_PAGOService tbl_TIPO_PAGOService;
    
}
