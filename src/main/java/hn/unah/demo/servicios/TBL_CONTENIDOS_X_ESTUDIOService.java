package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_CONTENIDOS_X_ESTUDIORepository;

@Service

public class TBL_CONTENIDOS_X_ESTUDIOService {

    @Autowired
    private TBL_CONTENIDOS_X_ESTUDIORepository tbl_CONTENIDOS_X_ESTUDIORepository;
    
}
