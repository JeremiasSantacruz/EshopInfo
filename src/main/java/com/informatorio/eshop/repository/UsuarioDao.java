package com.informatorio.eshop.repository;

import org.springframework.data.repository.CrudRepository;

import com.informatorio.eshop.models.Usuario;

public interface UsuarioDao extends CrudRepository<Usuario, Long> {

}
