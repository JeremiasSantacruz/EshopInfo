package com.informatorio.eshop.producto.services.imp;

import com.informatorio.eshop.producto.models.Producto;
import com.informatorio.eshop.producto.models.dtos.ProductoDto;
import com.informatorio.eshop.producto.models.mappers.ProductoMapper;
import com.informatorio.eshop.producto.repository.ProductoDao;
import com.informatorio.eshop.producto.services.ServiceProducto;
import com.informatorio.eshop.producto.exceptions.ProductoNotFoundException;
import com.informatorio.eshop.usuario.exceptions.UsuarioNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceProductoImp implements  ServiceProducto {

    private  ProductoMapper productoMapper;

    private  ProductoDao productoDao ;

    @Autowired
    public ServiceProductoImp(ProductoMapper productoMapper , ProductoDao productoDao){
        this.productoMapper = productoMapper;
        this.productoDao = productoDao;
    }



    @Override
    public ProductoDto create(ProductoDto productoDto){
        Producto producto = productoMapper.toEntity(productoDto);
        productoDao.save(producto);
        return productoDto;
    }

    @Override
    public ProductoDto read (Long id){
        Optional<Producto> producto = productoDao.findById(id);
        if(!producto.isPresent()){
            throw new UsuarioNotFoundException();
        }
        return producto.map(productoMapper::toDto).orElse(null);
    }

    @Override
    public List<ProductoDto> getAll(){
        List<Producto> productoList = productoDao.findAll();
        if(!productoList.isEmpty()){

            throw new ProductoNotFoundException();
        }else{
            return productoMapper.toDtoList(productoList);

        }

    }

    @Override
    public ProductoDto update(Long id,ProductoDto productoDto){
        Optional<Producto> producto = productoDao.findById(id);
        if(!producto.isPresent()){
            producto.get().setCategoria(productoDto.getCategoria());
            producto.get().setNombre(productoDto.getNombre());
            producto.get().setDescripcion(productoDto.getDescripcion());
            producto.get().setPrecioUnitario(productoDto.getPrecioUnitario());
            productoDao.save(producto.get());
        }else{
            throw new ProductoNotFoundException();
        }
        return productoMapper.toDto(producto.get());
    }
@Override
public void delete(Long id){
        Optional<Producto> producto = productoDao.findById(id);
        if(producto.isPresent()){
            productoDao.deleteById(producto.get().getId());
        }else{
              throw new ProductoNotFoundException();
        }
}




}
