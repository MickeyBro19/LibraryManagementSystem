# 📚 Library Management System (Core Java Project)

## 🚀 Overview

A console-based Library Management System built using Core Java to simulate real-world backend logic such as book management, borrowing, and role-based operations.

This project focuses on strengthening **Object-Oriented Programming (OOP)** concepts and introducing **basic system design principles** like shared services and separation of concerns.

---

## 🧠 Key Concepts Covered

* ✅ Classes & Objects
* ✅ Inheritance (`User → Student, Librarian`)
* ✅ Method Overriding
* ✅ Encapsulation
* ✅ Java Collections (`ArrayList`)
* ✅ Java 8 Streams
* ✅ Basic Dependency Injection (Manual)
* ✅ Business Logic Handling

---

## 🏗️ Project Structure

```
com.mickey
│
├── Main.java
│
├── entities
│   ├── Book.java
│   ├── User.java
│   ├── Student.java
│   └── Librarian.java
│
├── services
│   └── BookService.java
```

---

## ⚙️ Features

### 📖 Librarian

* Add new books
* View all books

### 👨‍🎓 Student

* Borrow a book
* (Future Scope: Return book)

---

## 🔁 System Flow

1. A single `BookService` instance is created in `Main`
2. The same instance is passed to:

   * Librarian
   * Student
3. Both interact with the **same shared data**

👉 This simulates real backend architecture where services are shared across components.

---

## 🧪 Business Logic Implemented

* ❌ Prevent borrowing non-existing books
* ❌ Prevent borrowing already issued books
* ✅ Allow borrowing available books

---

## 🔍 Sample Output

```
Enter Book Title
Java Basics
Book added

Book{id=1, title=Java Basics, isIssued=false}

Enter Book Title
Java Basics
Book borrowed successfully

Book{id=1, title=Java Basics, isIssued=true}
```

---

## 💡 Key Learning Outcomes

* Understanding how objects interact in a system
* Importance of shared service instances
* Transition from procedural coding → structured backend logic
* Introduction to dependency injection (manual implementation)

---

## ⚠️ Challenges Faced

* Handling shared state across multiple classes
* Avoiding multiple instances of service classes
* Managing control flow in Java Streams

---

## 🛠️ Tech Stack

* Java (Core + Java 8)
* IntelliJ IDEA
* CLI (Command Line Interface)

---

## 👨‍💻 Author

**Mickey**

---

## 📌 Note

This project is part of a structured "Project-Based Learning" approach to avoid tutorial hell and focus on real-world problem-solving.

---
