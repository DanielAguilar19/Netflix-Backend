package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_EMPLEADOSRepository;

@Service

public class TBL_EMPLEADOSService {

    @Autowired
    private TBL_EMPLEADOSRepository tbl_EMPLEADOSRepository;
    
}
