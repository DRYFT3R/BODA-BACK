package com.boda.asmmlp.app.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "confirmaciones")
public class Confirmacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "confirmado")
    private String confirmado;

    @Column(name = "fecha")
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaActualizacion;

    @PrePersist
    private void prePersist() {
        fechaCreacion = new Date();
        fechaActualizacion = new Date();
    }

    @PreUpdate
    private void preUpdate() {
        fechaActualizacion = new Date();
    }


}
