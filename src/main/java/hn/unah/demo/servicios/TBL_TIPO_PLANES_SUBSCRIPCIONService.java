package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.repositorios.TBL_TIPO_PLANES_SUBSCRIPCIONRepository;

@Service
public class TBL_TIPO_PLANES_SUBSCRIPCIONService {

    @Autowired
    private TBL_TIPO_PLANES_SUBSCRIPCIONRepository tblPlanesSubscriptoresrepository;
}
