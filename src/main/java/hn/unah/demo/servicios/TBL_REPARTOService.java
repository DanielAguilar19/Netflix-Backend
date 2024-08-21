package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_REPARTORepository;


@Service

public class TBL_REPARTOService {

    @Autowired
    private TBL_REPARTORepository tbl_REPARTORepository;
    
}
