# Vehicle Rental Management System

> 🚧 This project is currently under active development.
> New features and improvements are being added regularly.

A console-based Java application developed to simulate a real-world vehicle rental management system while practicing advanced Java programming concepts, clean architecture, data structures, algorithms, and object-oriented design principles.

This project demonstrates how scalable Java applications can be structured using layered architecture, custom data structures, generics, design patterns, exception handling, and reusable services.

---

# Features

## Vehicle Management

* Add vehicles
* Remove vehicles
* Display all vehicles
* Search vehicles by ID
* Rent vehicles
* Return rented vehicles

## Vehicle Types

* Car
* Bike
* Truck

## System Features

* Factory Design Pattern
* Generic Repository Pattern
* Custom Exception Handling
* Menu-Driven Console Application
* Custom Doubly Linked List
* Generic Data Handling
* Runtime Annotations

---

# Technologies Used

* Java
* IntelliJ IDEA
* Git
* GitHub

---

# Java Concepts Demonstrated

## Core OOP Concepts

* Encapsulation
* Inheritance
* Polymorphism
* Abstraction
* Interfaces

## Advanced Java

* Generics
* Enums
* Custom Exceptions
* Custom Annotations
* Collections Framework

## Design Patterns

* Factory Pattern
* Repository Pattern

## Data Structures & Algorithms

* Doubly Linked List
* Merge Sort *(planned)*
* Binary Search *(planned)*

---

# System Architecture

The project follows a layered architecture to separate responsibilities clearly.

```text
Main
 └── Services
       └── Repository
              └── Models
```

## Responsibilities

| Layer           | Responsibility                     |
| --------------- | ---------------------------------- |
| Main            | User interaction and menu handling |
| Services        | Business logic                     |
| Repository      | Data storage and retrieval         |
| Models          | Entity representation              |
| Factory         | Dynamic object creation            |
| Data Structures | Custom internal implementations    |

---

# Project Structure

```text
src/
│
├── annotations/
├── datastructures/
├── enums/
├── exceptions/
├── factory/
├── interfaces/
├── models/
├── repository/
├── services/
└── Main.java
```

---

# Factory Pattern Example

The Factory Pattern is used to create vehicle objects dynamically based on the vehicle type.

```java
Vehicle vehicle = VehicleFactory.createVehicle(
    VehicleType.CAR,
    "C101",
    "Toyota",
    5000,
    4
);
```

---

# Example OOP Hierarchy

```text
Vehicle (Abstract Class)
   ↑
--------------------------------
|              |              |
Car           Bike          Truck
```

---

# Generic Repository Example

```java
Repository<Vehicle> repository = new Repository<>();
```

---

# Custom Exception Example

```java
throw new VehicleNotFoundException(
    "Vehicle ID not found"
);
```

---

# Doubly Linked List Features

Custom implementation includes:

* Add to Head
* Add to Tail
* Insert in Middle
* Delete Node
* Forward Traversal ( INCOMPLETE )
* Backward Traversal ( INCOMPLETE )

---

# Sample Console Menu

```text
1. Add Vehicle
2. Display Vehicles
3. Rent Vehicle
4. Return Vehicle
5. Remove Vehicle
6. Exit
```

---

# Future Improvements

* Customer Management Module
* Rental History Tracking
* JDBC Database Integration
* File Persistence
* Login & Authentication
* JavaFX GUI Version
* REST API using Spring Boot
* Vehicle Availability Tracking
* Sorting & Searching Algorithms

---

# How to Run

## 1. Clone Repository

```bash
git clone https://github.com/joesh91/vehicle-rental-system.git
```

---

## 2. Open in IntelliJ IDEA

Open the project folder using IntelliJ IDEA.

---

## 3. Run the Application

Execute:

```text
src/Main.java
```

Run the `main()` method.

---

# Learning Objectives

This project was built to practice:

* Real-world Java project structure
* Clean code architecture
* Object-oriented programming
* Design patterns
* Data structures
* Algorithms
* Exception handling
* Generic programming

---

# Author

Shamal Gunathilake

---

# License

This project is developed for educational and learning purposes.

---