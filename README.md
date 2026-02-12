# Sistema de Pedidos – Java Swing + JPA (Hibernate)

## Descripción
Proyecto académico desarrollado en Java SE, utilizando:
* Swing para la interfaz gráfica
* JPA (Hibernate) para persistencia
* Base de datos relacional (PostgreSQL)
* Arquitectura basada en modelo DAO

El sistema permite gestionar:
✔ CRUD de Productos
✔ Registro de Pedidos
✔ Detalle de Pedido (composición)

Este proyecto tiene como objetivo demostrar la integración entre POO, persistencia ORM y aplicaciones de escritorio.

## Arquitectura del Proyecto
```
src
 ├── modelo
 │     ├── Producto.java
 │     ├── Cliente.java
 │     ├── Pedido.java
 │     └── DetallePedido.java
 │
 ├── dao
 │     ├── ProductoDAO.java
 │     ├── ClienteDAO.java
 │     └── PedidoDAO.java
 │
 ├── main
 │     ├── JFramePrincipal.java
 │     ├── JDialogProducto.java
 │     ├── JDialogPedido.java
 │
 └── 
```
## Tecnologías Utilizadas
| Tecnología         | Uso                     |
| ------------------ | ----------------------- |
| Java 17+           | Lenguaje base           |
| Swing              | Interfaz gráfica        |
| JPA                | API de persistencia     |
| Hibernate          | Implementación JPA      |
| Maven              | Gestión de dependencias |
| MySQL / PostgreSQL | Base de datos           |

## Licencia
Uso académico y educativo.
