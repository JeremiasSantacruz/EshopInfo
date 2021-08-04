package com.informatorio.eshop.models.mappers;

import com.informatorio.eshop.models.Usuario;
import com.informatorio.eshop.models.dtos.UsuarioDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-08-04T10:38:51-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.1 (Oracle Corporation)"
)
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public UsuarioDto toDto(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        UsuarioDto usuarioDto = new UsuarioDto();

        usuarioDto.setId( usuario.getId() );
        usuarioDto.setNombre( usuario.getNombre() );
        usuarioDto.setApellido( usuario.getApellido() );
        usuarioDto.setDireccion( usuario.getDireccion() );
        usuarioDto.setFechaDeAlta( usuario.getFechaDeAlta() );

        return usuarioDto;
    }

    @Override
    public Usuario toEntity(UsuarioDto usuarioDto) {
        if ( usuarioDto == null ) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setId( usuarioDto.getId() );
        usuario.setNombre( usuarioDto.getNombre() );
        usuario.setApellido( usuarioDto.getApellido() );
        usuario.setDireccion( usuarioDto.getDireccion() );
        usuario.setFechaDeAlta( usuarioDto.getFechaDeAlta() );

        return usuario;
    }
}
