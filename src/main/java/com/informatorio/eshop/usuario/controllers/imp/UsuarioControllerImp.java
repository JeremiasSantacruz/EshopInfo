package com.informatorio.eshop.usuario.controllers.imp;

import java.util.List;

import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.informatorio.eshop.usuario.controllers.UsuarioController;
import com.informatorio.eshop.usuario.models.dtos.UsuarioDto;
import com.informatorio.eshop.usuario.services.ServicesUsuarios;

@RestController
public class UsuarioControllerImp implements UsuarioController {

   private ServicesUsuarios servicesUsuarios;
   private static final String MSG_NULL_ID = "El usuario no puede ser nulo.";

   @Autowired
   public UsuarioControllerImp(ServicesUsuarios servicesUsuarios) {
      this.servicesUsuarios = servicesUsuarios;
   }

   @Override
   public ResponseEntity<UsuarioDto> create(UsuarioDto usuarioDto) {
      if (usuarioDto == null) {
         throw new IllegalArgumentException(MSG_NULL_ID );
      }
      return new ResponseEntity<UsuarioDto>(servicesUsuarios.create(usuarioDto),HttpStatus.CREATED);
   }

   @Override
   public UsuarioDto read(Long id) {
      if (id == null) {
         throw new IllegalArgumentException(MSG_NULL_ID );
      }
      return servicesUsuarios.read(id);
   }

   @Override
   public List<UsuarioDto> getAll() {
      return servicesUsuarios.getAll();
   }

   @Override
   public UsuarioDto update(Long id, UsuarioDto usuarioDto) {
      if (id == null){
         throw new IllegalArgumentException(MSG_NULL_ID );
      }
      return servicesUsuarios.update(id, usuarioDto);
   }

   @Override
   public void delete(Long id) {
      if (id == null)
         throw new IllegalArgumentException(MSG_NULL_ID);
      servicesUsuarios.delete(id);
   }

   @ExceptionHandler(ConstraintViolationException.class)
   public ResponseEntity<Object> validationError(){
      return new ResponseEntity("Error de validacion del json",HttpStatus.BAD_REQUEST);
   }
}
