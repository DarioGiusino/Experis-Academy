# spring-my-photoalbum

The application, used to manage a photo album, is based on Spring Boot, Vue.js, and uses a MySQL database for data persistence.

Backend:
AuthConfiguration: Spring Security configuration. Sets authorization rules for HTTP requests and handles user management configuration.

ContactApiController: A controller handling API requests related to contacts. Implements a function for creating new contacts via POST requests.

PhotoApiController: A controller handling API requests related to photos. It has functions to retrieve all photos and filter them by title through GET requests.

Frontend:
App.vue: The main Vue.js component representing the user interface of the application. Includes a navigation bar, a list of filterable photos, and a contact form.

PhotoComp.vue: A Vue.js component representing individual photos in the list. Displays the title and description of the photo.

Data Persistence:
Entities like Category, Contact, Photo, and User are Java classes annotated with @Entity, indicating they are JPA entities.
There are repositories (CategoryRepo, ContactRepo, PhotoRepo, RoleRepo, UserRepo) extending JpaRepository to provide CRUD operations for the entities.
There are services (CategoryService, ContactService, PhotoService, RoleService, UserService) containing business logic and interacting with repositories.

Web Controllers:
CategoryController: Handles web requests related to categories, such as viewing, creating, updating, and deleting categories.

MainController: Redirects the main request to the photo page.

PhotoController: Handles web requests related to photos, including viewing, creating, updating, searching, and deleting photos.

Initialization of Sample Data:
SpringIlMioFotoalbumApplication: Main Spring Boot application. Implements CommandLineRunner to populate the database with sample data at application startup.

# spring-my-pizzeria-crud

This is a Spring Boot application for managing a pizzeria. Users can view, create, update, and delete pizza information through a web interface.

Controller (PizzaController):
Handles HTTP requests for CRUD (Create, Read, Update, Delete) operations related to pizzas.
@GetMapping and @PostMapping annotations are used to map request paths to controller methods.
For example, /pizza/{id} displays details of a specific pizza.

Model (Pizza):
Represents the model of a pizza with attributes like name, description, picture, and price.
@Entity annotation is used to indicate that this class is a JPA-managed persistence class.
Validation is done using annotations like @NotBlank, @Size, @NotNull, and @Min.

Repository (PizzaRepo):
Extends Spring Data JPA's JpaRepository, simplifying CRUD operations on the database.
Contains custom methods like findByNameContaining for searching pizzas by name.

Service (PizzaService):
Provides service methods that call repository methods to perform operations on the database.
This service layer can contain additional business logic, but in this case, it seems to mainly forward calls to the repository.

Application (SpringLaMiaPizzeriaCrudApplication):
Entry point of the Spring Boot application.
Implements the CommandLineRunner interface, allowing code to be executed at application startup. In this case, some sample pizzas are inserted into the database at startup.

HTML Resources (src/main/resources/templates):
Contains Thymeleaf HTML files for web pages, such as displaying pizzas, creating, updating, and viewing details of a pizza.

Application Properties (application.properties):
Configuration of the MySQL database, with URL, username, and password.
spring.jpa.hibernate.ddl-auto=create indicates that Hibernate will create the database at application startup. In a production environment, this should be set to a safer value like update or none.

# spring-my-pizzeria-webapi

A comprehensive web application developed to streamline pizzeria management activities. This platform offers an intuitive and powerful experience, allowing users to perform CRUD (Create, Read, Update, Delete) operations for pizzas, ingredients, and special offers.

Frontend (Vue.js)
The frontend, built with Vue.js, features a clear and well-organized structure. At the heart of it all is App.vue, which serves as the core of the application. Here, you'll find a smart search bar, dubbed "PizzaFilter," designed to simplify navigation among the numerous available pizzas. Alongside this, a continuously evolving list of pizzas thanks to a call to the REST API provided by the robust Spring backend.
Each pizza in the list comes with a "DELETE" button, enabling flexible management directly from the frontend. Deletion requests are processed by the backend through a dedicated PizzaApiController.

Backend (Spring Boot)
The backend, developed using the Spring Boot framework, handles requests related to pizzas through the PizzaApiController, ensuring smooth and efficient management. Pizza information is stored in a MySQL database, and persistence is carefully managed via the PizzaService and PizzaRepo.
Ingredients and special offers follow the same approach, with respective dedicated services and repositories. Every aspect of the backend is designed to offer optimal performance and robust scalability.

Security
Security is a priority, managed through Spring Security. Role-based access rules (USER, ADMIN) ensure each user has the appropriate level of authorization. The form login-based authentication system and password encryption with BCrypt contribute to solid and reliable security.

Database
The MySQL database is the custodian of vital information for the pizzeria. From ingredients to special offers, from roles to users, each entity is transparently mapped to their respective tables in the database, ensuring consistency and reliability.

Dynamic Web Pages
The visual aspect is handled by dedicated Spring controllers like PizzaController, IngredientController, and SpecialOfferController. Pages are made dynamic thanks to the intelligent use of Thymeleaf templates, offering a rich and engaging user experience.

Initialization of the Database and Other Configurations
Upon application startup, the database is enriched with sample data through SpringLaMiaPizzeriaCrudApplication. A series of sample ingredients, pizzas, special offers, roles, and users are inserted, allowing you to immediately explore all features.

Additional configurations, including security and the database, are handled respectively in AuthConfiguration and application.properties. The frontend is modular, with key components like PizzaComp and PizzaFilter making the application extremely flexible and customizable.
