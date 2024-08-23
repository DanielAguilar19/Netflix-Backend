package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_PERSONASRepository;

@Service

public class TBL_PERSONASService {

    @Autowired
    private TBL_PERSONASRepository tbl_PERSONARepository;
    
}
