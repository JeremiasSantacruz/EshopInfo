## Escenario
Se desea crear una API para un E-Commerce (el rubro es a elección. Indumentaria, Juguetes, etc). En esta primera entrega de la API se desea 
almacenar las entidades:


 * ####Usuario
    * **Atributos:** Nombre, Apellido, Dirección, Fecha de Alta (creación)
 * ####Producto:
    * **Atributos:**  Nombre, Descripción, precio unitario, código de inventario (no es el id, pero es único) y categoría (depende del rubro que elijan).
 * ####Carrito:
    * **Atributos:** Fecha de creación, usuario (dueño del carrito) y productos relacionados. Además de estado (en curso o cerrado. Solo puede haber 1 carrito en curso por usuario)

**Observación:** Recuerden que se debe normalizar la línea/detalle de carrito.

* CRUD Usuarios - Id para el commit CART-0001
* CRUD Productos - Id para el commit CART-0002
* CRUD Carrito - Id para el commit CART-0003
  - Agregar Productos - Id para el commit CART-0006
  - Eliminar Productos - - Id para el commit CART-0007

###Buscar Productos:
- Todos los productos que tengan un nombre que comience con un string dado - Id para el commit CART-0004
- Todos los productos de una categoría dada - Id para el commit CART-0005

###Observaciones:
Recuerden enfocarse en pequeños fragmentos para poder testear mejor.
Donde se menciona “Id para el commit CART-0003”, se refiere a que al subir el código a github, el mensaje de commit debe tener ese mensaje por delante, ejemplo:
git commit -m “CART-0003 - Agregado Servicio para creación de Producto”

