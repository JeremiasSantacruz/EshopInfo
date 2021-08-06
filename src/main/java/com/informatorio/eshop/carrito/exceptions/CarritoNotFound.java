package com.informatorio.eshop.carrito.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Carrito no encontrado")
public class CarritoNotFound extends RuntimeException{

}
