package com.informatorio.eshop.usuario.controllers.imp;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.informatorio.eshop.usuario.models.dtos.UsuarioDto;
import com.informatorio.eshop.usuario.services.ServicesUsuarios;

@SpringBootTest
class UsuarioControllerImpTest {

   @InjectMocks
   private UsuarioControllerImp usuarioControllerImp;

   @Mock
   private ServicesUsuarios servicesUsuarios;

   private UsuarioDto usuarioDto;

   @BeforeAll
   public void set(){
      UsuarioDto usuarioDto = new UsuarioDto();
      usuarioDto.setNombre("Carlos");
      usuarioDto.setApellido("Santa");
      usuarioDto.setDireccion("Av italia");
      this.usuarioDto = usuarioDto;
   }

   @Test
   @DisplayName("Test when all is good")
   public void create_when_all_is_good() {
      when(servicesUsuarios.create(usuarioDto)).thenReturn(usuarioDto);
      ResponseEntity responseEntity = usuarioControllerImp.create(usuarioDto);
      assert (responseEntity.getStatusCode()).is2xxSuccessful();
      assert (responseEntity.getBody()).equals(usuarioDto);
   }

   @Test
   @DisplayName("Test When create is passed a null value")
   public void create_when_usuarioDto_is_null() {
      Exception e = assertThrows(IllegalArgumentException.class, () -> usuarioControllerImp.create(null));
      assert (e.getMessage()).equals("El usuario no puede ser nulo.");
   }

   @Test
   @DisplayName("Read an Usuario")
   public void read_when_id_is_good() {
      usuarioDto.setId(2l);
      when(servicesUsuarios.read(2l)).thenReturn(usuarioDto);
      UsuarioDto respuesta = usuarioControllerImp.read(2l);
      assert(respuesta).equals(usuarioDto);
   }

   @Test
   @DisplayName("Read have a null id")
   public void read_not_found(){
      Exception e = assertThrows(IllegalArgumentException.class, () -> usuarioControllerImp.read(null));
   }

}

