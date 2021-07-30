package com.informatorio.eshop.services;

import com.informatorio.eshop.models.dtos.UsuarioDto;

public interface ServicesUsuarios {

   void create(UsuarioDto usuarioDto);

   UsuarioDto read(Long id);

   UsuarioDto update(Long id, UsuarioDto usuarioDto);

   void delete(Long id);
}
