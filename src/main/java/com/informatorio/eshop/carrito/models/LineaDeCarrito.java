package com.informatorio.eshop.carrito.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
public class LineaDeCarrito {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id", nullable = false)
   private Long id;

   @NotNull
   @UniqueElements
   private Long idProducto;

   @NotNull
   private Long cantidad;

   @NotNull
   private Long costo;

   @ManyToOne
   private Carrito carrito;

}
