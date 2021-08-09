package com.informatorio.eshop.producto.models;

import lombok.Data;
import org.aspectj.weaver.GeneratedReferenceTypeDelegate;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Data

public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Long id;

    @NotNull
    @NotEmpty
    private String nombre;

    @NotNull
    @NotEmpty
    private String descripcion;

    @NotNull
    @NotEmpty
    private Double precioUnitario;

    @NotNull
    @NotEmpty
    @UniqueElements
    private String codigoInventario;

    @NotNull
    @NotEmpty
    private String categoria;



}
