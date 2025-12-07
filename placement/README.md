
# 📘 **Placement Management System – Spring Boot + PostgreSQL**

A simple web-based **Placement Management System** built using **Spring Boot**, **JPA**, and **PostgreSQL**.
It allows you to **add, view, update, and delete** placement records, and provides clean REST APIs for integration.

---

## 🚀 **Features**

* Create new placement entries
* View all placement details
* Update existing placement data
* Delete placements
* PostgreSQL database support
* REST API endpoints (testable via Postman)
* Layered architecture: *Controller → Service → Repository → Database*

---

## 🗂️ **Project Structure (Java Files)**

### **1. Placement.java (Entity Layer)**

Defines the structure of the `placement` table in PostgreSQL.
It contains fields like:

* id
* name
* collegeId
* collegeName
* date
* qualification
* year

This file maps the Java object to the database table.

---

### **2. PlacementRepository.java (Repository Layer)**

Extends `JpaRepository` to provide automatic CRUD operations.

* No SQL manually required
* Provides: save(), findAll(), findById(), deleteById(), etc.

---

### **3. PlacementService.java (Service Layer)**

Contains all business logic and interacts with the repository.

Functions include:

* add(placement)
* listAll()
* getById(id)
* save()
* delete(id)

---

### **4. PlacementController.java (API Layer)**

Exposes REST API endpoints for Postman and frontend apps.

| Method | Endpoint                  | Description         |
| ------ | ------------------------- | ------------------- |
| POST   | `/placements/add`         | Add a placement     |
| GET    | `/placements/all`         | Get all placements  |
| GET    | `/placements/{id}`        | Get placement by ID |
| PUT    | `/placements/update/{id}` | Update placement    |
| DELETE | `/placements/delete/{id}` | Delete placement    |

---

### **5. PlacementApplication.java (Main App)**

Bootstraps the Spring Boot project using:

```java
SpringApplication.run(PlacementApplication.class, args);
```

---

## 🧪 **Testing with Postman**

You can test the backend using Postman by calling the following APIs:

### ▶ Add Placement (POST)

**URL:**

```
http://localhost:8080/placements/add
```

**Body:**

```json
{
  "name": "Campus Drive 2025",
  "collegeId": 101,
  "collegeName": "DSATM",
  "date": "2025-01-10",
  "qualification": "BE",
  "year": 2025
}
```

---

### ▶ View All (GET)

```
http://localhost:8080/placements/all
```

---

### ▶ View by ID (GET)

```
http://localhost:8080/placements/1
```

---

### ▶ Update Placement (PUT)

```
http://localhost:8080/placements/update/1
```

---

### ▶ Delete (DELETE)

```
http://localhost:8080/placements/delete/1
```

---

## 🗄️ **Database Setup (PostgreSQL / pgAdmin)**

1. Create a new database:

```sql
CREATE DATABASE placementdb;
```

2. Add DB connection details in `application.properties`.

3. Spring Boot will automatically create the `placement` table from Placement.java.

4. View all records:

```sql
SELECT * FROM placement;
```

---

## 📦 **Tech Stack**

* **Spring Boot**
* **Spring Data JPA**
* **PostgreSQL**
* **Postman** (API testing)

---

## 📄 License

This project is for educational purposes and can be used freely.


