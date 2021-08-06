package com.informatorio.eshop.carrito.services;

import com.informatorio.eshop.carrito.models.Carrito;

public interface ServiceCarrito {

   Carrito crear(Long idUsuario);

   Carrito crearLineaCarrito(Long idUsuario, Long idProducto);

   Carrito obtener(Long idUsuario);

   Carrito obtenerHistoria(Long idUsuario);

   Carrito eliminarLineaCarrito(Long idUsuario, Long idProducto);

   Carrito comprar();

   Carrito descartar();

}
