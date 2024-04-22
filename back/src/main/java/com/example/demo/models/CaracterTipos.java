package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class CaracterTipos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String caracter;

    public CaracterTipos() {

    }

    public CaracterTipos(String caracter) {
        this.caracter = caracter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

}
