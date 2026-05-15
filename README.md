## Real-Time Shipment Tracking Portal & Logistics Marketplace:

A scalable backend system built using Java and Spring Boot that enables shippers to post freight loads, carriers to place bids, and customers to track shipments in real time.

This project simulates a modern logistics marketplace platform with secure authentication, shipment bidding workflows, and live shipment tracking architecture.

## Features:
- Authentication & Authorization
- User Registration and Login
- JWT-based Authentication
- Role-based Access Control
- Secure Password Encryption using BCrypt

# Supported Roles:
SHIPPER
CARRIER
CUSTOMER
Shipment Management
Create Shipment Loads
View Available Shipments
Shipment Status Tracking
Shipment Lifecycle Management

## Shipment Status:

BIDDING
AWAITING_PICKUP
IN_TRANSIT
DELIVERED
Bidding System
Carriers can place bids on shipments
Shippers can accept or reject bids
Automatic shipment assignment workflow
Transaction-safe bid handling

## Bid Status:

PENDING
ACCEPTED
REJECTED
Backend Architecture
RESTful APIs using Spring Boot
Layered Architecture
Spring Data JPA with PostgreSQL
JWT Security
Exception Handling
Clean package structure
Tech Stack
Technology	Usage
Java 17	Backend Development
Spring Boot	REST API Framework
Spring Security	Authentication & Authorization
JWT	Secure Token Authentication
Spring Data JPA	ORM & Database Operations
PostgreSQL	Relational Database
Maven	Dependency Management
Lombok	Boilerplate Reduction
Postman	API Testing
Project Structure
src/main/java/com/project
│
├── controller
├── service
├── repository
├── entity
├── dto
├── security
├── config
└── exception
Database Entities
User

Stores platform users and roles.

## Fields:

id
name
email
password
role
Shipment

Stores shipment details created by shippers.

## Fields:

id
origin
destination
weight
status
shipper
Bid

Stores carrier bids for shipments.

Fields:

id
amount
status
shipment
carrier
API Endpoints
Authentication APIs
Register User
POST /api/auth/register

## Request Body:

{
  "name": "Poonam",
  "email": "poonam@gmail.com",
  "password": "password123",
  "role": "SHIPPER"
}
Login User
POST /api/auth/login

## Request Body:

{
  "email": "poonam@gmail.com",
  "password": "password123"
}

## Response:

{
  "token": "jwt_token"
}
Security Implementation
JWT token generation and validation
BCrypt password hashing
Stateless authentication
Protected APIs
Role-based authorization
Setup Instructions
Clone Repository
git clone <repository-url>
Configure PostgreSQL

## Update application.properties

spring.datasource.url=jdbc:postgresql://localhost:5432/logistics_db
spring.datasource.username=postgres
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
Run Application
mvn spring-boot:run

# Application runs on:

http://localhost:8080
Future Enhancements
Real-Time Shipment Tracking using WebSocket
Live GPS Coordinate Streaming
Shipment Tracking Dashboard
Docker Containerization
Swagger API Documentation
RabbitMQ Integration
Notification System
Deployment on AWS
Learning Outcomes

## This project demonstrates:

Spring Boot Backend Development
JWT Authentication
REST API Design
Database Relationships
Role-Based Security
Transaction Management
Clean Architecture Practices
Enterprise Backend Development Concepts

### Author
Poonam Taxak
