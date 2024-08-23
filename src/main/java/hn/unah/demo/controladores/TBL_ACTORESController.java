package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_ACTORESService;

@RestController
@RequestMapping("/api/actor")

public class TBL_ACTORESController {

    @Autowired
    private TBL_ACTORESService tbl_ACTORESService;
    
}
