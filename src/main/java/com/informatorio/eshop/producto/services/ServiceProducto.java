package com.informatorio.eshop.producto.services;

import com.informatorio.eshop.producto.models.dtos.ProductoDto;
import com.informatorio.eshop.usuario.models.dtos.UsuarioDto;

import java.util.List;

public interface ServiceProducto {

    ProductoDto create(ProductoDto productoDto);

    ProductoDto read(Long id);

    List<ProductoDto> getAll();

    ProductoDto update(Long id, ProductoDto productoDto);

    void delete(Long id);
}
