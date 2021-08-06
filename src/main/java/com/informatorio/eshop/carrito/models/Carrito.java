package com.informatorio.eshop.carrito.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

import com.informatorio.eshop.usuario.models.Usuario;

@Entity
public class Carrito {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id", nullable = false)
   private Long id;

   @CreationTimestamp
   @NotNull
   private LocalDate fechaDeCreacion;

   @ManyToOne
   @NotNull
   private Usuario usuario;

   @OneToMany(cascade = CascadeType.ALL)
   private List<LineaDeCarrito> lineaDeCarrito;

   @NotNull
   private Boolean activo;

}