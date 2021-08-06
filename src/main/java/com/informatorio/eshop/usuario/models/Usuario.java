package com.informatorio.eshop.usuario.models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;

import com.informatorio.eshop.carrito.models.Carrito;

import lombok.Data;

@Entity
@Data
public class Usuario {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id", nullable = false)
   private Long id;

   @NotNull
   @NotEmpty
   private String nombre;

   @NotNull
   @NotEmpty
   private String apellido;

   @NotNull
   @NotEmpty
   private String direccion;

   @CreationTimestamp
   private LocalDate fechaDeAlta;

   @OneToMany(cascade = CascadeType.ALL)
   private List<Carrito> carrito;

}