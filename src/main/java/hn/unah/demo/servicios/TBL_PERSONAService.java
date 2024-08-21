package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_PERSONARepository;

@Service

public class TBL_PERSONAService {

    @Autowired
    private TBL_PERSONARepository tbl_PERSONARepository;
    
}
