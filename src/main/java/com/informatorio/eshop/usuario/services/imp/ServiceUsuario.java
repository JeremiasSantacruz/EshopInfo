package com.informatorio.eshop.usuario.services.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.informatorio.eshop.usuario.exceptions.UsuarioNotFoundException;
import com.informatorio.eshop.usuario.models.Usuario;
import com.informatorio.eshop.usuario.models.dtos.UsuarioDto;
import com.informatorio.eshop.usuario.models.mappers.UsuarioMapper;
import com.informatorio.eshop.usuario.repository.UsuarioDao;
import com.informatorio.eshop.usuario.services.ServicesUsuarios;

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
   public UsuarioDto create(UsuarioDto usuarioDto) {
      Usuario usuario = usuarioMapper.toEntity(usuarioDto);
      return usuarioMapper.toDto(usuarioDao.save(usuario));
   }

   @Override
   public UsuarioDto read(Long id) {
      Optional<Usuario> usuario = usuarioDao.findById(id);
      if (!usuario.isPresent()) {
         throw new UsuarioNotFoundException();
      }
      return usuario.map(usuarioMapper::toDto).orElse(null);
   }

   @Override
   public List<UsuarioDto> getAll() {
      List<Usuario> usuarioList = usuarioDao.findAll();
      if (usuarioList.isEmpty()) {
         throw new UsuarioNotFoundException();
      } else {
         return usuarioMapper.toDtoList(usuarioList);
      }
   }

   @Override
   public UsuarioDto update(Long id, UsuarioDto usuarioDto) {
      Optional<Usuario> usuario = usuarioDao.findById(id);
      if (usuario.isPresent()) {
         usuario.get().setDireccion(usuarioDto.getDireccion());
         usuarioDao.save(usuario.get());
      } else {
         throw new UsuarioNotFoundException();
      }
      return usuarioMapper.toDto(usuario.get());
   }

   @Override
   public void delete(Long id) {
      Optional<Usuario> usuario = usuarioDao.findById(id);
      if (usuario.isPresent()) {
         usuarioDao.deleteById(usuario.get().getId());
      } else {
         throw new UsuarioNotFoundException();
      }
   }
}
