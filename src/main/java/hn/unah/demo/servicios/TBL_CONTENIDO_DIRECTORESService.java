package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_CONTENIDO_DIRECTORESRepository;

@Service
public class TBL_CONTENIDO_DIRECTORESService {

    @Autowired
    private TBL_CONTENIDO_DIRECTORESRepository tbl_CONTENIDO_DIRECTORESRepository;
    
}
