package com.informatorio.eshop.models.dtos;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UsuarioDto {

   private Long id;

   private String nombre;

   private String apellido;

   private String dirección;

   private LocalDate fechaDeAlta;

}
