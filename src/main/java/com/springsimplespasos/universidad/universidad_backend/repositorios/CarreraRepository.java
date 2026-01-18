package com.springsimplespasos.universidad.universidad_backend.repositorios;

import com.springsimplespasos.universidad.universidad_backend.modelo.entidades.Carrera;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CarreraRepository extends CrudRepository<Carrera, Integer> {

    Optional<Carrera> findById(Integer id);
    Carrera save(Carrera carrera);
    Iterable<Carrera> findAll();
    void deleteById(Integer id);
    
}
