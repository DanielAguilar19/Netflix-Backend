package hn.unah.demo.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.demo.modelos.TBL_HISTORIAL_PAGOS;
import hn.unah.demo.modelos.TBL_TIPO_PAGO;
import hn.unah.demo.modelos.TBL_USUARIOS_TARJETAS;
import hn.unah.demo.repositorios.TBL_HISTORIAL_PAGOSRepository;
import hn.unah.demo.repositorios.TBL_HISTORIAL_USUARIOS_X_PLANRepository;
import hn.unah.demo.repositorios.TBL_TIPO_PAGORepository;
import hn.unah.demo.repositorios.TBL_USUARIOS_TARJETASRepository;

@Service
public class TBL_HISTORIAL_PAGOSService {

    @Autowired
    private TBL_HISTORIAL_PAGOSRepository tbl_HISTORIAL_PAGOSRepository;

    @Autowired
    private TBL_USUARIOS_TARJETASRepository tbl_USUARIOS_TARJETASRepository;

    @Autowired
    private TBL_TIPO_PAGORepository tbl_TIPO_PAGORepository;

    @Autowired
    private TBL_HISTORIAL_USUARIOS_X_PLANRepository tbl_HISTORIAL_USUARIOS_X_PLANRepository;

    // metodo para registrar los pagos efectuados
    public TBL_HISTORIAL_PAGOS registroNuevoPagoEfectuado(long codigoTarjeta, long codigoTipoPago,
            long codigoRegistroEnHistoPlanesUsuario) {

        TBL_HISTORIAL_PAGOS nvoRegistroPago = new TBL_HISTORIAL_PAGOS();

        nvoRegistroPago.setCodigoRegistroTarjeta(this.tbl_USUARIOS_TARJETASRepository.findById(codigoTarjeta).get());
        nvoRegistroPago.setCodigoTipoPago(this.tbl_TIPO_PAGORepository.findById(codigoTipoPago).get());
        if (this.tbl_HISTORIAL_USUARIOS_X_PLANRepository.existsById(codigoRegistroEnHistoPlanesUsuario)) {

            nvoRegistroPago.setUsuarioPlanesNumRegistro(
                    this.tbl_HISTORIAL_USUARIOS_X_PLANRepository.findById(codigoRegistroEnHistoPlanesUsuario).get());

            return this.tbl_HISTORIAL_PAGOSRepository.save(nvoRegistroPago);

        }

        return null;

    }

}
