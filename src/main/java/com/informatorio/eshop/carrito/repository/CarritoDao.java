package com.informatorio.eshop.carrito.repository;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.informatorio.eshop.carrito.models.Carrito;

@Entity
public interface CarritoDao extends JpaRepository<Carrito, Long> {

}
