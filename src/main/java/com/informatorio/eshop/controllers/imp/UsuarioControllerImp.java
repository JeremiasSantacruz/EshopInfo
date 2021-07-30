package com.informatorio.eshop.controllers.imp;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.informatorio.eshop.controllers.UsuarioController;
import com.informatorio.eshop.models.dtos.UsuarioDto;

@RestController
public class UsuarioControllerImp implements UsuarioController {

   @Override
   public void create(UsuarioDto usuarioDto) {

   }

   @Override
   public UsuarioDto read(Long id) {
      return null;
   }

   @Override
   public UsuarioDto update(Long id, UsuarioDto usuarioDto) {
      return null;
   }

   @Override
   public void delete(Long id) {

   }
}
