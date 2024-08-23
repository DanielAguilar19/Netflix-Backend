package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_TIPO_CONTENIDORepository;

@Service

public class TBL_TIPO_CONTENIDOService {

    @Autowired
    private TBL_TIPO_CONTENIDORepository tbl_TIPO_CONTENIDORepository;
    
}
