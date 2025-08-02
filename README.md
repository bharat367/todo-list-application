# Todo List Application

A simple and efficient Todo List application built with Spring Boot. This application allows users to manage their tasks with basic CRUD operations.

## Features

- Create new tasks
- View all tasks
- Delete tasks
- Mark tasks as completed

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Thymeleaf
- MySQL Database
- Maven

## Prerequisites

- Java JDK 17 or higher
- Maven 3.x

## Getting Started

1. Clone the repository
```bash
git clone https://github.com/bharat367/todo-list-application.git
```

2. Navigate to the project directory
```bash
cd todo-list-application
```

3. Build the project
```bash
mvn clean install
```

4. Run the application
```bash
mvn spring-boot:run
```

The application will start running at `http://localhost:8080`

## API Endpoints

- `GET /tasks` - Get all tasks
- `GET /tasks/{id}` - Get a specific task by ID
- `POST /tasks` - Create a new task
- `DELETE /tasks/{id}` - Delete a task

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── javs/
│   │           └── todo_list_application/
│   │               ├── controller/
│   │               ├── models/
│   │               ├── repository/
│   │               └── services/
│   └── resources/
│       ├── static/
│       └── templates/
└── test/
    └── java/
```
