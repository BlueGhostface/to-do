package com.example.todo.repo;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.todo.model.TodoItem;

public interface TodoRepo extends JpaRepository<TodoItem, UUID>{
    
}
