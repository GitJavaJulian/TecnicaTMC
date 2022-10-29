# Prueba Técnica Java TMC - Julian Lapunzina

RESTFul API del servicio pedido en la prueba técnica utilizando las siguentes tecnologias:

  - Java 1.8.
  - Spring Boot 2.7.5.
  - Hibernate.
  - Base de datos H2 en memoria.
  - Maven.
  - Librerias: JUnit, Lombok.
  
# ACLARACIONES
> Por cuestiones de tiempo y simplicidad en el desarrollo:
> No se abordan logs, autorizacion y autenticacion, libreria de mapeo (como MapStruct).
> Se limita a la creacion de los 5 tests pedidos, sin crear tests unitarios para la devolucion de errores, fallos y cada metodo específico de la capa de negocio.
> Lo ideal hubiera sido hacer la definicion del endpoint a traves de algun estandar OpenApi (como Swagger CodeGen), que genere la interfaz e implementala desde el controlador.