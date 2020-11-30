package com.everis.formacion.dao;

import com.everis.formacion.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    Usuario findByUsername(String username);
}
