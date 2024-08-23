package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_TIPO_PLANES_SUBSCRIPCIONService;

@RestController
@RequestMapping("/api/planes/subscripcion")
public class TBL_TIPO_PLANES_SUBSCRIPCIONControllers {

    @Autowired
    private TBL_TIPO_PLANES_SUBSCRIPCIONService tblPlanesSubscriptoresService;

}
