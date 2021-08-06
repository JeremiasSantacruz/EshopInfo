package com.informatorio.eshop.carrito.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.informatorio.eshop.carrito.models.Carrito;

public interface ControllerCarrito {

   @PutMapping("usuario/{idUsuario}/carrito")
   Carrito crear(Long idUsuario);

   @PostMapping("/usuario/{idUsuario}/carrito/{idProducto}")
   Carrito crearLineaCarrito(Long idUsuario, Long idProducto);

   @GetMapping("/usuario/{id}/carrito")
   Carrito obtener(Long idUsuario);

   @GetMapping("/usuario/{id}/carrito/todos")
   Carrito obtenerHistoria(Long idUsuario);

   @PatchMapping("usuario/{id}/carrito/{idProducto")
   Carrito modificarLinea(Long idUsuario, Long idProducto);

   @DeleteMapping("/usuario/{id}/carrito/{idProducto}")
   Carrito eliminarLineaCarrito(Long idUsuario, Long idProducto);

   @PostMapping("/usuario/{id}/carrito/")
   Carrito comprar();

   @PostMapping("/usuario/{id}/carrito/descartar")
   Carrito descartar();

}
