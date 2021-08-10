package com.informatorio.eshop.producto.models;

public enum Categorias {
   LIBRERIA("LIBRERIA"),
   BAZAR("BAZAR"),
   SUPERMERCADO("SUPERMERCADO");

   private String value;

   Categorias(String value) {
      this.value = value;
   }

   public String getValue() {
      return value;
   }

   public void setValue(String value) {
      this.value = value;
   }
}
