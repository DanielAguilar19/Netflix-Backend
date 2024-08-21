package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_ACTORESRepository;

@Service

public class TBL_ACTORESService {

    @Autowired
    private TBL_ACTORESRepository tbl_ACTORESRepository;
    
}
