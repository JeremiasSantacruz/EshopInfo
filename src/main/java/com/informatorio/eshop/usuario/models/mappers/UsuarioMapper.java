package com.informatorio.eshop.usuario.models.mappers;

import java.util.List;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.informatorio.eshop.usuario.models.Usuario;
import com.informatorio.eshop.usuario.models.dtos.UsuarioDto;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UsuarioMapper {

   UsuarioDto toDto(Usuario usuario);

   Usuario toEntity(UsuarioDto usuarioDto);

   List<UsuarioDto> toDtoList(List<Usuario> usuarios );

}
