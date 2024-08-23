package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_PERMISOS_X_ROLLESService;

@RestController
@RequestMapping("/api/roles/permiso")

public class TBL_PERMISOS_X_ROLLESControllers {

    @Autowired 
    private TBL_PERMISOS_X_ROLLESService tbl_ROLES_PERMISOSService;
    
}
