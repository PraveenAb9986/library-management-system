# Library Management System

## Overview
This project implements a Library Management System in Java using Object-Oriented Programming principles and design patterns.

The system allows librarians to manage books, patrons, and lending processes efficiently.

---

## Features

### Book Management
- Add books to the library
- Remove books
- Search books by title
- Track availability

### Patron Management
- Register patrons
- Track borrowing history

### Lending Process
- Checkout books
- Return books
- Track borrowed books

---

## Design Patterns Used

### Factory Pattern
Used to create Book objects using the BookFactory class.

### Observer Pattern
Used to notify patrons when a book becomes available after being returned.

---

## Technologies Used

- Java
- OOP Principles
- SOLID Principles
- Design Patterns
- Java Collections

---

## Project Structure

```
src
 ├── Main.java
 ├── Library.java
 ├── BookFactory.java
 ├── data
 │   ├── Book.java
 │   ├── Patron.java
 │   └── Loan.java
 └── observer
     ├── Observer.java
     └── Subject.java
```

---

## How to Run

Compile:

```
javac src/**/*.java
```

Run:

```
java Main
```

---

## Class Diagram
              +----------------+
              |    Library     |
              +----------------+
               |     |      |
               |     |      |
               v     v      v
            +----+ +------+ +------+
            |Book| |Patron| |Loan  |
            +----+ +------+ +------+
              |
              | implements
              v
           +---------+
           | Subject |
           +---------+
                |
                | notifies
                v
            +----------+
            | Observer |
            +----------+

Submission branch for assignment PR.
## Author

Praveen A