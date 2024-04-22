package com.example.demo.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

@Service
public interface DomicilioService {

    ArrayList<Object[]> obtenerInformacionDomicilios();

}
