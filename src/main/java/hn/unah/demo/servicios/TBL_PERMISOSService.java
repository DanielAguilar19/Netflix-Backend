package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_PERMISOSRepository;

@Service

public class TBL_PERMISOSService {

    @Autowired
    private TBL_PERMISOSRepository tbl_PERMISOSRepository;
    
}
