package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_SERIESService;

@RestController
@RequestMapping("/api/series")

public class TBL_SERIESController {

    @Autowired
    private TBL_SERIESService tbl_SERIESService;
    
}
