package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity

public class Observaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String observacion;

    @OneToOne
    @JoinColumn(name = "operacion_id")
    private Domicilio idDomicilio;

    public Observaciones() {

    }

    public Observaciones(String observacion) {
        this.observacion = observacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Domicilio getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(Domicilio idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

}
