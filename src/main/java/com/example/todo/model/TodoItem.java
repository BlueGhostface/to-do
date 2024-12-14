package com.example.todo.model;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Entity
public class TodoItem {
    
    @Id
    @Column(name = "todo_id")
    public UUID todoId = UUID.randomUUID();

    
    @Getter
    public LocalDateTime creationTime;
    @Getter @Setter @Value("geen beschrijving toegevoegd")
    public String description;
    @Getter @Setter
    public Status status;


    public TodoItem() {
        this.creationTime = LocalDateTime.now();
        status = Status.OPEN;
    }

    public TodoItem(String description, Status state){
        this();
        setDescription(description);
        setStatus(state);
    }

    
}
