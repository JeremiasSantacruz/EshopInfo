package com.informatorio.eshop.carrito.models.dtos;

import java.time.LocalDate;
import java.util.List;

import com.informatorio.eshop.usuario.models.Usuario;

import lombok.Data;

@Data
public class CarritoDto {

   private Long id;

   private LocalDate fechaDeCreacion;

   private Usuario usuario;

   private List<LineaCarritoDto> lineaDeCarrito;

   private Boolean activo;

}
