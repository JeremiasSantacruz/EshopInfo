package com.informatorio.eshop.producto.models.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

import com.informatorio.eshop.producto.models.Categorias;

@Setter
@Getter
public class ProductoDto {
    private Long id;

    private String nombre;

    private String descripcion;

    private Double precioUnitario;

    private String codigoInventario;

    private Categorias categoria;
}
