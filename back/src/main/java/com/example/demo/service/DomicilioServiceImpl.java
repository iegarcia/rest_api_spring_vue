package com.example.demo.service;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.DomicilioRepository;

@Service
public class DomicilioServiceImpl implements DomicilioService {

    @Autowired
    DomicilioRepository domicilioRepository;

    @Override
    public ArrayList<Object[]> obtenerInformacionDomicilios() {
        return domicilioRepository.obtenerInformacionDomicilios();
    }

}
