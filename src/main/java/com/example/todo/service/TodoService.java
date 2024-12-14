package com.example.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todo.model.TodoItem;
import com.example.todo.repo.TodoRepo;

@Service
public class TodoService {

@Autowired
    public TodoRepo todoRepo;


    public List<TodoItem> getAllTodos(){
        return todoRepo.findAll();
    }

}
