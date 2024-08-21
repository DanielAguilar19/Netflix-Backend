package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_DIRECTORESService;

@RestController
@RequestMapping("/api/directores")

public class TBL_DIRECTORESController {
    
    @Autowired
    private TBL_DIRECTORESService tbl_DIRECTORESService;
}
