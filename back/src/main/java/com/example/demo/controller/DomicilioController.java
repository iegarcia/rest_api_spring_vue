package com.example.demo.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DomicilioService;

@RestController
@RequestMapping("api")

public class DomicilioController {
    @Autowired
    DomicilioService domicilioService;

    // @GetMapping("/saludar")
    // public String saludar() {
    // return "Hola";
    // }

    @CrossOrigin(origins = "*")
    @GetMapping("/domicilio")
    public ArrayList<Object[]> obtenerDomicilio() {
        return domicilioService.obtenerInformacionDomicilios();
    }

}
