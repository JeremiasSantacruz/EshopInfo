package com.informatorio.eshop.models.mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.informatorio.eshop.models.Usuario;
import com.informatorio.eshop.models.dtos.UsuarioDto;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface UsuarioMapper {

   UsuarioDto toDto(Usuario usuario);

   Usuario toEntity(UsuarioDto usuarioDto);

}
