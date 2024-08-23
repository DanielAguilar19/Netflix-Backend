package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_USUARIOS_TARJETASRepository;

@Service

public class TBL_USUARIOS_TARJETASService {

    @Autowired 
    private TBL_USUARIOS_TARJETASRepository tbl_USUARIOS_TARJETARepository;
    
}
