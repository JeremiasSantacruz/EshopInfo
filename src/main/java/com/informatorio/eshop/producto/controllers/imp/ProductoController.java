package com.informatorio.eshop.producto.controllers.imp;

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

import com.informatorio.eshop.producto.models.dtos.ProductoDto;

@RequestMapping("/producto")
public interface ProductoController {

   @PutMapping("/")
   ResponseEntity<ProductoDto> create(@RequestBody @Validated ProductoDto productoDto);

   @GetMapping("/{id}")
   ProductoDto read(@PathVariable Long id);

   @GetMapping("/")
   List<ProductoDto> getAll();

   @PatchMapping("/{id}")
   ProductoDto update(@PathVariable Long id, @RequestBody ProductoDto productoDto);

   @DeleteMapping("/{id}")
   void delete(@PathVariable Long id);

}
