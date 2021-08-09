package com.informatorio.eshop.producto.controllers.imp.imp;

import com.informatorio.eshop.producto.controllers.imp.ProductoController;
import com.informatorio.eshop.producto.models.dtos.ProductoDto;
import com.informatorio.eshop.producto.services.ServiceProducto;
import com.informatorio.eshop.usuario.models.dtos.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.List;

public class ProductoControllerImp implements ProductoController {

    private ServiceProducto serviceProducto;
    private static final String MSG_NULL_ID = "El producto no puede ser nulo.";

@Autowired
    public ProductoControllerImp(ServiceProducto serviceProducto) {
        this.serviceProducto = serviceProducto;
    }

    @Override
    public ResponseEntity<ProductoDto> create(ProductoDto productoDto){
    if (productoDto == null){
        throw new IllegalArgumentException(MSG_NULL_ID);
    }
    serviceProducto.create(productoDto);
    return new ResponseEntity<ProductoDto>(productoDto, HttpStatus.CREATED);
    }


    @Override
    public ProductoDto read(Long id) {
        if ( id == null){
            throw new IllegalArgumentException(MSG_NULL_ID);
        }
        return serviceProducto.read(id);
    }

    @Override
    public List<ProductoDto> getAll() {

        return serviceProducto.getAll();
    }

    @Override
    public ProductoDto update(Long id, ProductoDto productoDto) {
    if (id==null){
        throw new IllegalArgumentException(MSG_NULL_ID);
    }

        return serviceProducto.update(id,productoDto);
    }

    @Override
    public void delete(Long id) {
    if (id == null){
        throw new IllegalArgumentException(MSG_NULL_ID);
    }
    serviceProducto.delete(id);

    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Object> validationError(){
        return new ResponseEntity("Error de validacion del json",HttpStatus.BAD_REQUEST);
    }
}
