package hn.unah.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.demo.servicios.TBL_USARIOSServices;

@RestController
@RequestMapping("api/usuarios")
public class TBL_USUARIOSControllers {

    @Autowired
    private TBL_USARIOSServices tbl_SYSTEM_USARIOSServices;

}
