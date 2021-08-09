package com.informatorio.eshop.producto.models.mappers;

import com.informatorio.eshop.producto.models.Producto;
import com.informatorio.eshop.producto.models.dtos.ProductoDto;
import com.informatorio.eshop.usuario.models.Usuario;
import com.informatorio.eshop.usuario.models.dtos.UsuarioDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProductoMapper {

    ProductoDto toDto(Producto producto);

    Producto toEntity(ProductoDto productoDto);

    List<ProductoDto> toDtoList(List<Producto> producto );
}
