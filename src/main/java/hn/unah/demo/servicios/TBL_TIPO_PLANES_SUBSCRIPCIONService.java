package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.modelos.TBL_TIPO_PLANES_SUBSCRIPCION;
import hn.unah.demo.repositorios.TBL_TIPO_PLANES_SUBSCRIPCIONRepository;

@Service
public class TBL_TIPO_PLANES_SUBSCRIPCIONService {

    @Autowired
    private TBL_TIPO_PLANES_SUBSCRIPCIONRepository tblPlanesSubscriptoresrepository;

    // metodo para obtner un plan
    public TBL_TIPO_PLANES_SUBSCRIPCION obtenerTipoPlanAadquirir(long codigoTipoPlan) {

        if (this.tblPlanesSubscriptoresrepository.existsById(codigoTipoPlan)) {
            return this.tblPlanesSubscriptoresrepository.findById(codigoTipoPlan).get();
        }
        return null;

    }
}
