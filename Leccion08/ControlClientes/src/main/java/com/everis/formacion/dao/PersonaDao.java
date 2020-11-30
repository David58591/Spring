package com.everis.formacion.dao;

import com.everis.formacion.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long>{
    
}
