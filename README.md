# Spring Boot Learning Project (UC1 – UC8)

This project is created using **Spring Initializer + IntelliJ IDEA** to learn basic Spring Boot concepts step-by-step.

Reference: Spring Introduction Document

---

## Project Topics Covered

* Spring Boot Setup
* REST Controller
* MVC + Thymeleaf
* Logger (SLF4J)
* Dependency Injection
* Components & Beans
* IoC Container
* ApplicationContext
* Constructor / Setter / Field Injection

---

## Project Structure

```
com.bridgelabz.helloworld
│
├── controller
│     ├── HelloController
│     ├── HelloRestController
│     └── HelloWebController
│
├── model
│     └── User
│
├── component
│     ├── EmployeeBean
│     └── DepartmentBean
│
└── Application
```

---

## UC1 – Hello World REST API

Created Spring Boot project using Spring Initializer.

Created REST controller.

```
http://localhost:8080/hello
```

Output:

```
Hello from BridgeLabz
```

Concepts:

* @SpringBootApplication
* @RestController
* @GetMapping

---

## UC2 – MVC + Thymeleaf

Added Thymeleaf dependency.

Created MVC controller returning HTML page.

```
http://localhost:8080/web
```

Concepts:

* @Controller
* Model
* Thymeleaf
* templates folder

---

## UC3 – REST API with Parameters

Implemented different request types.

```
/api/hello
/api/hello/query?name=Prajwal
/api/hello/Prajwal
/api/hello/post
```

Concepts:

* @RequestParam
* @PathVariable
* @RequestBody
* Model class (User)

---

## UC4 – Logger (SLF4J)

Added logger in controller.

```
log.info("Hello API called");
```

Concepts:

* Logger
* LoggerFactory
* SLF4J
* log.info / log.error

---

## UC5 – Dependency Injection Basic

Created components.

```
DepartmentBean
EmployeeBean
```

Used:

* @Component
* @Autowired
* ApplicationContext
* getBean()

Concept:

Spring creates objects automatically.

---

## UC6 – Dependency Injection Types

Used 3 types of injection:

* Field Injection
* Constructor Injection
* Setter Injection

Concepts:

```
@Autowired field
@Autowired constructor
@Autowired setter
```

---

## UC7 – IoC Container

Used ApplicationContext.

```
ApplicationContext context =
SpringApplication.run()

context.getBean()
```

Concepts:

* IoC Container
* Bean management
* Spring controls objects

---

## UC8 – Final DI Example

Final clean example using components.

```
EmployeeBean -> DepartmentBean
@Autowired constructor
@Component
```

Concepts:

* Bean lifecycle
* Dependency Injection
* IoC
* Spring Container

---

## Dependencies Used

* Spring Web
* Thymeleaf
* Spring Boot DevTools

---

## IDE Used

* IntelliJ IDEA
* Spring Initializer
* Maven


