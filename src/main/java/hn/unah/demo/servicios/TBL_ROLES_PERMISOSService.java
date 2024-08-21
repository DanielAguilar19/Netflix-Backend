package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_ROLES_PERMISOSRepository;

@Service

public class TBL_ROLES_PERMISOSService {

    @Autowired
    private TBL_ROLES_PERMISOSRepository tbl_ROLES_PERMISOSRepository;
    
}
