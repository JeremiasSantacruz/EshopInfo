package com.informatorio.eshop.producto.models.mappers;

import java.util.List;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.informatorio.eshop.producto.models.Producto;
import com.informatorio.eshop.producto.models.dtos.ProductoDto;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProductoMapper {

   ProductoDto toDto(Producto producto);

   Producto toEntity(ProductoDto productoDto);

   List<ProductoDto> toDtoList(List<Producto> producto);
}
