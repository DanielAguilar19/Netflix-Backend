package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_ROLES_PERMISOSService;

@RestController
@RequestMapping("/api/roles/permiso")

public class TBL_ROLES_PERMISOSControllers {

    @Autowired 
    private TBL_ROLES_PERMISOSService tbl_ROLES_PERMISOSService;
    
}
