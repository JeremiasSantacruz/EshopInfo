package com.informatorio.eshop.producto.repository;

import com.informatorio.eshop.producto.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto , Long> {
}
