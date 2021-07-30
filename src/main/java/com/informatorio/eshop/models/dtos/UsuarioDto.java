package com.informatorio.eshop.models.dtos;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioDto {

   private Long id;

   private String nombre;

   private String apellido;

   private String direccion;

   private LocalDate fechaDeAlta;

}
