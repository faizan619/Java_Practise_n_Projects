package com.TodoAppBackend.Model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(
    name="todo_project",
    schema="practise"
)

public class Todo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name="task_name",nullable=false,length=256)
    private String task;

    @Column(name="task_priority")
    private Boolean priority = false;

    @Column(name="is_completed")
    @Value("Pending")
    private String isCompleted;

    @CreationTimestamp
    private LocalDateTime dateCreated;

    @UpdateTimestamp
    private LocalDateTime dateUpdated;

    public Todo(String task,Boolean priority,String isCompleted){
        this.task = task;
        this.priority = priority;
        this.isCompleted = isCompleted;
    }
}
