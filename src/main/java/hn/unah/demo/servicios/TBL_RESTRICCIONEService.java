package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_RESTRICCIONESRepository;

@Service

public class TBL_RESTRICCIONEService {

    @Autowired
    private TBL_RESTRICCIONESRepository tbl_RESTRICCIONESRepository;
    
}
