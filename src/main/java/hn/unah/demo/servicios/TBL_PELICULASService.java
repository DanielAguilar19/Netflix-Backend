package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_PELICULASRepository;

@Service

public class TBL_PELICULASService {

    @Autowired 
    private TBL_PELICULASRepository tbl_PELICULASRepository;
    
}
