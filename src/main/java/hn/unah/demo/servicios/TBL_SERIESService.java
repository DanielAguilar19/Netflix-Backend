package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_SERIESRepository;

@Service

public class TBL_SERIESService {

    @Autowired
    private TBL_SERIESRepository tbl_SERIESRepository;

}
