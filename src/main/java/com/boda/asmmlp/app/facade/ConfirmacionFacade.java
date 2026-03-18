package com.boda.asmmlp.app.facade;


import com.boda.asmmlp.app.domain.entity.Confirmacion;
import com.boda.asmmlp.app.domain.repository.ConfirmacionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Component
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class ConfirmacionFacade {

    private final ConfirmacionRepository repository;

    public void guardar(Confirmacion confirmacion) {
        repository.save(confirmacion);
    }
}
