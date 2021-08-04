package com.informatorio.eshop.controllers.imp;

import java.util.List;

import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
   public ResponseEntity<UsuarioDto> create(UsuarioDto usuarioDto) {
      if (usuarioDto == null) {
         throw new IllegalArgumentException("El usuario no puede ser nulo.");
      }
      servicesUsuarios.create(usuarioDto);
      return new ResponseEntity<UsuarioDto>(usuarioDto,HttpStatus.CREATED);
   }

   @Override
   public UsuarioDto read(Long id) {
      if (id == null) {
         throw new IllegalArgumentException("El usuario no puede ser nulo.");
      }
      return servicesUsuarios.read(id);
   }

   @Override
   public List<UsuarioDto> getAll() {
      return servicesUsuarios.getAll();
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

   @ExceptionHandler(ConstraintViolationException.class)
   public ResponseEntity<Object> validationError(){
      return new ResponseEntity("Error de validacion del json",HttpStatus.BAD_REQUEST);
   }
}
