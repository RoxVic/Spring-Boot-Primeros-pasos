package com.springsimplespasos.universidad.universidad_backend.repositorios;

import com.springsimplespasos.universidad.universidad_backend.modelo.entidades.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PersonaRepository  extends CrudRepository <Persona, Integer>{
}
