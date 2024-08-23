package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_USUARIOS_PLANESRepository;

@Service

public class TBL_USUARIOS_PLANESService {

    @Autowired
    private TBL_USUARIOS_PLANESRepository tbl_USUARIOS_PLANESRepository;
    
}
