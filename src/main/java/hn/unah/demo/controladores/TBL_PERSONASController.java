package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_PERSONASService;

@RestController
@RequestMapping("/api/persona")

public class TBL_PERSONASController {
    
    @Autowired
    private TBL_PERSONASService tbl_PERSONAService;
}
