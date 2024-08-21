package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hn.unah.demo.repositorios.TBL_ACTORESRepository;

@Repository

public class TBL_ACTORESService {

    @Autowired
    private TBL_ACTORESRepository tbl_ACTORESRepository;
    
}
