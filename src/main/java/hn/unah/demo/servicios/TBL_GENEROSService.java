package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_GENEROSRepository;

@Service

public class TBL_GENEROSService {

    @Autowired
    private TBL_GENEROSRepository tbl_GENEROSRepository;
    
}
