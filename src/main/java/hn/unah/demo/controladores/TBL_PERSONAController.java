package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_PERSONAService;

@RestController
@RequestMapping("/api/persona")

public class TBL_PERSONAController {
    
    @Autowired
    private TBL_PERSONAService tbl_PERSONAService;
}
