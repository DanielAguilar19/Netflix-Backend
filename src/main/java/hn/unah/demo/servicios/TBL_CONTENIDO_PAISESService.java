package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_CONTENIDO_PAISESRepository;

@Service

public class TBL_CONTENIDO_PAISESService {
    @Autowired
    private TBL_CONTENIDO_PAISESRepository tbl_CONTENIDO_PAISESRepository;
    
}
