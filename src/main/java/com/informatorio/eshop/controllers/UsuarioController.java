package com.informatorio.eshop.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.informatorio.eshop.models.dtos.UsuarioDto;

@RequestMapping("/usuario")
public interface UsuarioController {

   @PutMapping("/")
   ResponseEntity<UsuarioDto> create(@RequestBody @Validated UsuarioDto usuarioDto);

   @GetMapping("/{id}")
   UsuarioDto read(@PathVariable Long id);

   @GetMapping("/")
   List<UsuarioDto> getAll();

   @PatchMapping("/{id}")
   UsuarioDto update(@PathVariable Long id, @RequestBody UsuarioDto usuarioDto);

   @DeleteMapping("/{id}")
   void delete(Long id);
}
