package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity

public class TitularesIngresados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Long cuitTitular;

    @OneToOne
    @JoinColumn(name = "caracter_id")
    private CaracterTipos caracter;

    @ManyToOne
    @JoinColumn(name = "operacion_id")
    private Domicilio idDomicilio;

    public TitularesIngresados() {

    }

    public TitularesIngresados(Long cuitTitular) {
        this.cuitTitular = cuitTitular;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCuitTitular() {
        return cuitTitular;
    }

    public void setCuitTitular(Long cuitTitular) {
        this.cuitTitular = cuitTitular;
    }

    public CaracterTipos getCaracter() {
        return caracter;
    }

    public void setCaracter(CaracterTipos caracter) {
        this.caracter = caracter;
    }

    public Domicilio getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(Domicilio idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

}
