Este proyecto es una aplicación web desarrollada con Spring Boot que implementa un sistema CRUD (Create, Read, Update, Delete) completo. 
Está orientada a mostrar mis habilidades con la arquitectura de software, uso de bases de datos relacionales, desarrollo en Java con Spring,
y muy buenas prácticas en el desarrollo backend.El objetivo es que las empresas puedan ver mi capacidad para estructurar, mantener y desarrollar aplicaciones profesionales, 
siguiendo el modelo MVC y la arquitectura por capas.

🛠️ Tecnologías utilizadas
Java 17

Spring Boot 

Spring Data JPA

Maven

MySQL

Hibernate

Postman (para pruebas de API)

Swagger (para documentación de endpoints)

Lombok

Git & GitHub

📚 Estructura de mi proyecto

src/
└── main/
    ├── java/com/miempresa/crud/
    │   ├── controller/     --> Controladores REST
    │   ├── service/        --> Lógica de negocio
    │   ├── repository/     --> Interfaces JPA
    │   ├── model/          --> Entidades JPA
    │   └── CrudApplication.java --> Clase principal
    └── resources/
        ├── application.properties --> Configuraciones
        └── data.sql               --> Datos iniciales


⚙️ Configuración de mi base de datos
En application.properties:

properties

spring.datasource.url=jdbc:mysql://localhost:3306/crud_db
spring.datasource.username=usuario
spring.datasource.password=contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


🧪 subida al gitHub clonando


bash
Copiar
Editar
git clone https://github.com/tuusuario/crud-springboot.git
Crea una base de datos en MySQL llamada crud_db.

Modifico las credenciales en application.properties.

Ejecuto la app desde un IDE o con Maven:

bash
./mvnw spring-boot:run

Prueba los endpoints con Postman(http://localhost:8080/swagger-ui/).

📡 Endpoints disponibles (ejemplo entidad "Empleados")


Método	Endpoint : Mi Descripción


GET	/api/empleados	Lista de empleados
GET	/api/empleados/{id}	Buscarenos por ID
POST	/api/empleados	Crearemos un nuevo empleado
PUT	/api/empleados/{id}	Actualizaremos empleado
DELETE	/api/empleados/{id}	Eliminaremos empleado


🧠Mis Buenas prácticas aplicadas con:


-Arquitectura en capas

-Inyección de dependencias

-Uso de DTOs

-Manejo de excepciones personalizado

-Validaciones con el Bean Validation

-Documentación automática con Swagger



