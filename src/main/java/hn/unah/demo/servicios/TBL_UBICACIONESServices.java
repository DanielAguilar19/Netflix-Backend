package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_UBICACIONESRepository;

@Service
public class TBL_UBICACIONESServices {

    @Autowired
    private TBL_UBICACIONESRepository tblUbicacionesRepository;

}
