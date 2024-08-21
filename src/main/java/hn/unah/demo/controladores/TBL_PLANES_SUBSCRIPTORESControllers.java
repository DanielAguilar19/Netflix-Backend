package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_PLANES_SUBSCRIPTORESService;

@RestController
@RequestMapping("/api/planes/subcriptores")
public class TBL_PLANES_SUBSCRIPTORESControllers {

    @Autowired
    private TBL_PLANES_SUBSCRIPTORESService tblPlanesSubscriptoresService;

}
