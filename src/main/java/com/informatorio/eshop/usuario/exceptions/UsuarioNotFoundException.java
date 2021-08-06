package com.informatorio.eshop.usuario.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Usuario no encontrado.")
public class UsuarioNotFoundException extends RuntimeException{

}
