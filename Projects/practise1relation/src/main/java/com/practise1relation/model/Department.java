package com.practise1relation.model;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
// import lombok.Table;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "department",schema = "practise")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false,unique=true)
    private String department_code;

    @Column(nullable=false)
    private String department_name;

    @Column(nullable=false)
    private String department_location;

    @CreationTimestamp
    private LocalDateTime created_at;

    public Department(String department_code, String department_name, String department_location) {
        this.department_code = department_code;
        this.department_name = department_name;
        this.department_location = department_location;
    }
}