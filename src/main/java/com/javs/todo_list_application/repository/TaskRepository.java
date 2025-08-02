package com.javs.todo_list_application.repository;

import com.javs.todo_list_application.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
