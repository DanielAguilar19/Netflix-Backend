package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_REPARTO_CONTENIDORepository;

@Service

public class TBL_REPARTO_CONTENIDOService {

    @Autowired
    private TBL_REPARTO_CONTENIDORepository tbl_REPARTO_CONTENIDORepository;
    
}
