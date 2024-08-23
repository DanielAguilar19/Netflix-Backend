package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_CARGOService;

@RestController
@RequestMapping("/api/cargo")

public class TBL_CARGOController {

    @Autowired 
    private TBL_CARGOService tbl_CARGOService;
    
}
