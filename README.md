# Fullstack Login System

A fullstack authentication system built with **Java, Spring Boot, and MySQL**, designed with clean architecture principles and a strong focus on backend best practices.

This project demonstrates the implementation of a secure and well-structured login flow, from database modeling to REST API and frontend integration.

---

## ✨ Features

- User authentication (login)
- User registration
- RESTful API using Spring Boot
- Layered backend architecture
- Password hashing for security
- SQL database integration
- Frontend consuming the API via HTTP (JSON)

---

## 🧰 Tech Stack

### Backend
- Java
- Spring Boot
- Spring Data JPA
- REST API
- MySQL

### Frontend
- HTML
- CSS
- JavaScript

### Tools & Practices
- Git & GitHub
- Clean Architecture
- RESTful design principles

---

## 🗄️ Database Design

**Database name:** `fullstack_login`  
**Table:** `users`

```sql
CREATE TABLE users (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  email VARCHAR(255) NOT NULL UNIQUE,
  password VARCHAR(255) NOT NULL,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
