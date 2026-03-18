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
@Table(name = "confirmacion")
public class Confirmacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "confirmado")
    private String confirmado;

    @Column(name = "created_at")
    private Date fechaCreacion;

    @Column(name = "updated_at")
    private Date fechaActualizacion;




}
