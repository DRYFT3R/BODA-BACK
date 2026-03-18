package com.boda.asmmlp.app.service;

import com.boda.asmmlp.app.facade.ConfirmacionFacade;
import com.boda.asmmlp.app.web.model.ConfirmacionModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ConfirmacionService {

    private final ConfirmacionFacade facade;

    public void confirmarAsistencia(List<ConfirmacionModel> mode) {
        mode.forEach(m -> {
            var confirmacion = new com.boda.asmmlp.app.domain.entity.Confirmacion();
            confirmacion.setNombre(m.getNombre());
            confirmacion.setConfirmado(m.getConfirmacion());
            facade.guardar(confirmacion);
        });
    }
}
