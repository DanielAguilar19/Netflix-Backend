package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_IDIOMASRepository;

@Service

public class TBL_IDIOMASService {

    @Autowired 
    private TBL_IDIOMASRepository tbl_IdiomasRepository;
    
}
