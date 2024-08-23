package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_TIPO_PLANES_SUBCRIPCIONService;

@RestController
@RequestMapping("/api/tipo/planes")

public class TBL_TIPO_PLANES_SUCRIPCIONController {

    @Autowired
    private TBL_TIPO_PLANES_SUBCRIPCIONService tbl_TIPO_PLANES_SUBCRIPCIONService;
    
}
