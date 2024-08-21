package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_CONTENIDO_IDIOMARepository;

@Service
public class TBL_CONTENIDO_IDIOMAService {

    @Autowired
    private TBL_CONTENIDO_IDIOMARepository tbl_CONTENIDO_IDIOMARepository;
    
}
