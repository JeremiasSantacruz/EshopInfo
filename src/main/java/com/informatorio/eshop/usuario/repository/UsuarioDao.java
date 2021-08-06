package com.informatorio.eshop.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.informatorio.eshop.usuario.models.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {

}
