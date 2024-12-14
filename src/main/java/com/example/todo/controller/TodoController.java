package com.example.todo.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.todo.model.TodoItem;
import com.example.todo.repo.TodoRepo;

@RestController
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;

    @GetMapping
    public List<TodoItem> findAll(){
        return todoRepo.findAll();

    }

    @PostMapping
    public TodoItem addnew(@RequestBody TodoItem todoitem){
        return todoRepo.save(todoitem);
    }

    @DeleteMapping("/{id}")
    public void DeleteTodo(@PathVariable UUID id){
        todoRepo.deleteById(id);
    }

    

}
