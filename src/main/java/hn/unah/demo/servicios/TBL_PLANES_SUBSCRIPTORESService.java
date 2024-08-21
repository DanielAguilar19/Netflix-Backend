package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_PLANES_SUBSCRIPTORESRepository;

@Service
public class TBL_PLANES_SUBSCRIPTORESService {

    @Autowired
    private TBL_PLANES_SUBSCRIPTORESRepository TBL_PLANES_SUBSCRIPTORESRepository;
}
