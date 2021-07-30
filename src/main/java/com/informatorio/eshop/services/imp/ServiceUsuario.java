package com.informatorio.eshop.services.imp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.informatorio.eshop.models.Usuario;
import com.informatorio.eshop.models.dtos.UsuarioDto;
import com.informatorio.eshop.models.mappers.UsuarioMapper;
import com.informatorio.eshop.repository.UsuarioDao;
import com.informatorio.eshop.services.ServicesUsuarios;

public class ServiceUsuario implements ServicesUsuarios {

   private UsuarioMapper usuarioMapper;

   private UsuarioDao usuarioDao;

   @Autowired
   public ServiceUsuario(UsuarioMapper usuarioMapper, UsuarioDao usuarioDao) {
      this.usuarioMapper = usuarioMapper;
      this.usuarioDao = usuarioDao;
   }

   @Override
   public void create(UsuarioDto usuarioDto) {
      Usuario usuario = usuarioMapper.toEntity(usuarioDto);
      usuarioDao.save(usuario);
   }

   @Override
   public UsuarioDto read(Long id) {
      Optional<Usuario> usuario = usuarioDao.findById(id);
      return usuario.map(value -> usuarioMapper.toDto(value)).orElse(null);
   }

   @Override
   public UsuarioDto update(Long id, UsuarioDto usuarioDto) {
      return null;
   }

   @Override
   public void delete(Long id) {
      Optional<Usuario> usuario = usuarioDao.findById(id);
      usuario.ifPresent(value -> usuarioDao.delete(value));
   }
}
