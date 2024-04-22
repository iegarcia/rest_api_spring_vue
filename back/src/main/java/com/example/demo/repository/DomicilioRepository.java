package com.example.demo.repository;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Domicilio;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio, Long> {

    @Query(value = "SELECT d.id, d.cuit, d.cuit_representado, d.domicilio AS domicilio, " +
            "CONCAT(d.tipo_telefono, ' - ', d.telefono) AS telefono, " +
            "CONCAT(at.codigo, ' - ', at.descripcion) AS actividad, " +
            "ct.caracter, c.condicion " +
            "FROM domicilio d " +
            "LEFT JOIN condicion c ON d.condicion_id = c.id " +
            "LEFT JOIN actividades_ingresadas ai ON d.id = ai.operacion_id " +
            "LEFT JOIN actividades_todas at ON ai.actividad_id = at.codigo " +
            "LEFT JOIN titulares_ingresados ti ON d.id = ti.operacion_id " +
            "LEFT JOIN caracter_tipos ct ON ti.caracter_id = ct.id", nativeQuery = true)

    ArrayList<Object[]> obtenerInformacionDomicilios();

}
