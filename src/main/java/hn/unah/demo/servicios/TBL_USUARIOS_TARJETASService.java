package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_USUARIOS_TARJETARepository;

@Service

public class TBL_USUARIOS_TARJETASService {

    @Autowired 
    private TBL_USUARIOS_TARJETARepository tbl_USUARIOS_TARJETARepository;
    
}
