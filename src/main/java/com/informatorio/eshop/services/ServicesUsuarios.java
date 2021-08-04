package com.informatorio.eshop.services;

import java.util.List;

import com.informatorio.eshop.models.dtos.UsuarioDto;

public interface ServicesUsuarios {

   UsuarioDto create(UsuarioDto usuarioDto);

   UsuarioDto read(Long id);

   List<UsuarioDto> getAll();

   UsuarioDto update(Long id, UsuarioDto usuarioDto);

   void delete(Long id);
}
