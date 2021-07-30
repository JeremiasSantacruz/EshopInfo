package com.informatorio.eshop.services.imp;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.informatorio.eshop.models.Usuario;
import com.informatorio.eshop.models.dtos.UsuarioDto;
import com.informatorio.eshop.models.mappers.UsuarioMapper;
import com.informatorio.eshop.repository.UsuarioDao;
import com.informatorio.eshop.services.ServicesUsuarios;

@Service
public class ServiceUsuario implements ServicesUsuarios {

   private final UsuarioMapper usuarioMapper;

   private final UsuarioDao usuarioDao;

   @Autowired
   public ServiceUsuario(UsuarioMapper usuarioMapper, UsuarioDao usuarioDao) {
      this.usuarioMapper = usuarioMapper;
      this.usuarioDao = usuarioDao;
   }

   @Override
   public void create(UsuarioDto usuarioDto) {
      Usuario usuario = usuarioMapper.toEntity(usuarioDto);
      usuarioDao.save(usuario);//TODO agregar Respuesta bonita
   }

   @Override
   public UsuarioDto read(Long id) {
      Optional<Usuario> usuario = usuarioDao.findById(id);
      return usuario.map(usuarioMapper::toDto).orElse(null);//TODO agregar Respuesta bonita
   }

   @Override
   public UsuarioDto update(Long id, UsuarioDto usuarioDto) {
      Optional<Usuario> usuario = usuarioDao.findById(id);
      if (usuario.isPresent()){
         usuario.get().setDireccion(usuarioDto.getDireccion());
         usuarioDao.save(usuario.get());
      } //TODO agregar Respuesta bonita
      return usuarioMapper.toDto(usuario.get());
   }

   @Override
   public void delete(Long id) {
      Optional<Usuario> usuario = usuarioDao.findById(id);
      usuario.ifPresent(usuarioDao::delete);
      //TODO agregar Respuesta bonita
   }
}
