package com.informatorio.eshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.informatorio.eshop.models.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {

}
