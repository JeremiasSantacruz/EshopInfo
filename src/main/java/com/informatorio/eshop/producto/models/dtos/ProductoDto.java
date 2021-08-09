package com.informatorio.eshop.producto.models.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class ProductoDto {
    private Long id;

    private String nombre;

    private String descripcion;

    private Double precioUnitario;

    private String codigoInventario;

    private String categoria;
}
