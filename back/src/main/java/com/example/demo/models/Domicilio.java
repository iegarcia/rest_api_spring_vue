package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity

public class Domicilio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private Long cuit;
    private Long cuitRepresentado;
    private String domicilio;
    private String telefono;
    private String tipoTelefono;

    @OneToOne
    @JoinColumn(name = "condicion_id")
    Condicion condicion;

    public Domicilio() {
    }

    public Domicilio(Long cuit, Long cuitRepresentado, String domicilio, String telefono, String tipoTelefono) {
        this.cuit = cuit;
        this.cuitRepresentado = cuitRepresentado;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.tipoTelefono = tipoTelefono;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCuit() {
        return cuit;
    }

    public void setCuit(Long cuit) {
        this.cuit = cuit;
    }

    public Long getCuitRepresentado() {
        return cuitRepresentado;
    }

    public void setCuitRepresentado(Long cuitRepresentado) {
        this.cuitRepresentado = cuitRepresentado;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoTelefono() {
        return tipoTelefono;
    }

    public void setTipoTelefono(String tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }

    public Condicion getCondicion() {
        return condicion;
    }

    public void setCondicion(Condicion condicion) {
        this.condicion = condicion;
    }

}
