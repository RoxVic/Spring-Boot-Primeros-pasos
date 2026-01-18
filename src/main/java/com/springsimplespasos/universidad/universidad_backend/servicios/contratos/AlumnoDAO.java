package com.springsimplespasos.universidad.universidad_backend.servicios.contratos;

import com.springsimplespasos.universidad.universidad_backend.modelo.entidades.Carrera;
import com.springsimplespasos.universidad.universidad_backend.modelo.entidades.Persona;

import java.util.Optional;

public interface AlumnoDAO {

    Optional<Persona> findById(Integer id);
    Persona save(Persona persona);
    Iterable<Persona> findAll();
    void deleteById(Integer id);
}
