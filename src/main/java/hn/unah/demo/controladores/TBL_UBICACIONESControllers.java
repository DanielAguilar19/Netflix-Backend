package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import hn.unah.demo.servicios.TBL_UBICACIONESServices;

@RestController
@RequestMapping("/api/lugares")
public class TBL_UBICACIONESControllers {

    @Autowired
    private TBL_UBICACIONESServices tbl_ubicacionesServices;

}
