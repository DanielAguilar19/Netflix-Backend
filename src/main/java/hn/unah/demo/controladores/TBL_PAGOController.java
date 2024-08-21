package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_PAGOService;

@RestController
@RequestMapping("")

public class TBL_PAGOController {

    @Autowired
    private TBL_PAGOService tbl_PAGOService;
    
}
