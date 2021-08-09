package com.informatorio.eshop.producto.controllers.imp;

import com.informatorio.eshop.producto.models.dtos.ProductoDto;
import com.informatorio.eshop.usuario.models.dtos.UsuarioDto;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
public interface ProductoController {
    @PutMapping("/")
    ResponseEntity<ProductoDto> create (@RequestBody @Validated ProductoDto productoDto);



    @GetMapping("/{id}")
    ProductoDto read (@PathVariable Long id);

    @GetMapping("/")
    List<ProductoDto> getAll();

    @PatchMapping("/")
    ProductoDto update(@PathVariable Long id , @RequestBody ProductoDto productoDto);

    @DeleteMapping("/{id}")
    void delete(Long id);

}
