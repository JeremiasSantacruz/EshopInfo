package com.informatorio.eshop.controllers.imp;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.informatorio.eshop.controllers.UsuarioController;
import com.informatorio.eshop.models.dtos.UsuarioDto;
import com.informatorio.eshop.services.ServicesUsuarios;

@RestController
public class UsuarioControllerImp implements UsuarioController {

   private ServicesUsuarios servicesUsuarios;

   @Autowired
   public UsuarioControllerImp(ServicesUsuarios servicesUsuarios) {
      this.servicesUsuarios = servicesUsuarios;
   }

   @Override
   public void create(UsuarioDto usuarioDto) {
      if (usuarioDto != null) {
         servicesUsuarios.create(usuarioDto);
      }
   }

   @Override
   public UsuarioDto read(Long id) {
      if (id != null) {
         return servicesUsuarios.read(id);
      }
      return null;
   }

   @Override
   public UsuarioDto update(Long id, UsuarioDto usuarioDto) {
      if (id != null){
         return servicesUsuarios.update(id, usuarioDto);
      }
      return null;
   }

   @Override
   public void delete(Long id) {
   }
}
