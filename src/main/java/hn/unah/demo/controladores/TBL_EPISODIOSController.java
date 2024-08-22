package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_EPISODIOService;

@RestController
@RequestMapping("/api/episodio")

public class TBL_EPISODIOSController {

    @Autowired 
    private TBL_EPISODIOService tbl_EPISODIOService;
    
}
