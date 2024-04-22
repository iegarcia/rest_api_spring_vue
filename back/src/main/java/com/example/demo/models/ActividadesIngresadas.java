package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class ActividadesIngresadas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // private Long operacion_id;
    // private Long actividad_id;

    @OneToOne
    @JoinColumn(name = "actividad_id")
    ActividadesTodas codigoActividades;

    @ManyToOne
    @JoinColumn(name = "operacion_id")
    private Domicilio idDomicilio;

    public ActividadesIngresadas() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ActividadesTodas getCodigoActividades() {
        return codigoActividades;
    }

    public void setCodigoActividades(ActividadesTodas codigoActividades) {
        this.codigoActividades = codigoActividades;
    }

    public Domicilio getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(Domicilio idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

}
