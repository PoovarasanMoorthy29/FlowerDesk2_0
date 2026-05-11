# FlowerDesk 2.0

## Overview

FlowerDesk 2.0 is a Java-based Internal IT Helpdesk Management System developed using the MVC (Model View Controller) architecture. The project helps users raise support tickets, manage issues, and allows IT agents and administrators to handle ticket operations efficiently.

This project is developed using:

* Java
* JDBC
* MySQL
* IntelliJ IDEA
* MVC Architecture

---

# Features

## User Features

* User Registration / Sign Up
* User Login Authentication
* Raise Support Tickets
* View Dashboard
* Track Ticket Status

## IT Agent Features

* View Assigned Tickets
* Update Ticket Status
* Manage User Issues

## Admin Features

* Admin Dashboard
* Monitor Tickets
* Manage Users and IT Agents

---

# Project Architecture

The project follows MVC Architecture:

## Model Layer

Contains Java model classes:

* `User.java`
* `Tickets.java`

Purpose:

* Stores object data
* Represents database entities

## View Layer

Handles user interaction:

* `LoginView.java`
* `SignUpView.java`
* `UserDashBoardView.java`
* `ItAgentDashBoardView.java`
* `AdminDashBoardView.java`

Purpose:

* Displays menus
* Takes user input
* Shows output

## Controller Layer

Controls application flow:

* `LoginController.java`
* `SignUpController.java`
* `TicketController.java`
* `UserDashboardController.java`
* `ItAgentDashBoardController.java`
* `AdminDashBoardController.java`

Purpose:

* Connects View and Service layers
* Processes requests

## Service Layer

Contains business logic:

* `LoginService.java`
* `SignUpService.java`
* `TicketServices.java`

Purpose:

* Validations
* Business operations
* Ticket processing

## DAO Layer

Handles database operations:

* `LoginDAO.java`
* `RegistrationDAO.java`
* `TicketDAO.java`

Purpose:

* Execute SQL queries
* Communicate with MySQL database

## Configuration Layer

* `DatabaseConfig.java`

Purpose:

* Database connection setup

## Utility Layer

* `Validation.java`
* `InputGetter.java`
* `AppInfo.java`

Purpose:

* Helper methods
* Input handling
* Validation utilities

---

# Project Structure

```text
src/
└── com/
    └── flowerdesk/
        ├── configuration/
        ├── controller/
        ├── dao/
        ├── model/
        ├── services/
        ├── utils/
        ├── view/
        └── FlowerDesk2_0.java
```

---

# Database Setup

## Step 1: Create Database

```sql
CREATE DATABASE flowerdesk;
```

## Step 2: Create User Table

```sql
CREATE TABLE users (
    user_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    employee_id VARCHAR(20) UNIQUE,
    full_name VARCHAR(100),
    username VARCHAR(50) UNIQUE,
    email VARCHAR(100) UNIQUE,
    password VARCHAR(255),
    phone_number VARCHAR(15),
    department VARCHAR(50),
    designation VARCHAR(50),
    role VARCHAR(50),
    status VARCHAR(50) DEFAULT 'ACTIVE',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
        ON UPDATE CURRENT_TIMESTAMP
);
```

## Step 3: Create Ticket Table

```sql
CREATE TABLE tickets (
    Ticket_ID BIGINT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50),
    title VARCHAR(50),
    description VARCHAR(100),
    priority VARCHAR(15),
    status VARCHAR(15) DEFAULT 'OPEN',
    Assigned VARCHAR(100) DEFAULT "NOT ASSIGNED",
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (username) REFERENCES users(username)
);
```

---

# MySQL JDBC Dependency

Add MySQL Connector JAR:

```text
mysql-connector-j-9.6.0.jar
```

In IntelliJ:

1. File → Project Structure
2. Libraries
3. Add MySQL Connector JAR

---

# How to Run the Project

## Step 1

Clone or extract the project.

## Step 2

Open the project in IntelliJ IDEA.

## Step 3

Configure database credentials in:

```java
DatabaseConfig.java
```

Example:

```java
private static final String URL = "jdbc:mysql://localhost:3306/flowerdesk";
private static final String USERNAME = "root";
private static final String PASSWORD = "your_password";
```

## Step 4

Run:

```text
FlowerDesk2_0.java
```

---

# Validation Features

The project includes validations for:

* Email Format
* Password Strength
* Phone Number Validation
* Null Checks
* Login Authentication

---

# Technologies Used

* Java
* JDBC
* MySQL
* IntelliJ IDEA
* MVC Design Pattern
* Git & GitHub

---

# Future Improvements

* GUI using Java Swing or JavaFX
* Email Notifications
* Password Encryption
* Role-Based Authentication
* Ticket Analytics Dashboard
* Web Version using Spring Boot

---

# Author

**Poovarasan M**

# License

This project is developed for educational and learning purposes.
