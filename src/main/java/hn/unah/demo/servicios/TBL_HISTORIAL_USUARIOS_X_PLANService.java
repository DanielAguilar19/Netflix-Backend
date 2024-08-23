package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_HISTORIAL_USUARIOS_X_PLANRepository;

@Service

public class TBL_HISTORIAL_USUARIOS_X_PLANService {

    @Autowired
    private TBL_HISTORIAL_USUARIOS_X_PLANRepository tbl_HISTORIALES_PAGORepository;
    
}
