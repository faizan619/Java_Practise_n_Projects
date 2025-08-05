package com.springsec3.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Entity
@ToString
@Table(
    name="users",
    schema="practise"
)
public class User{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Id;

    @Column(nullable=false,length=200)
    private String name;

    @Column(unique=true,nullable=false,length=200)
    private String username;

    @Column(unique=true,nullable=false,length=200)
    private String email;

    @Column(nullable=false,length=200)
    private String password;

    @Column(nullable=true)
    private int age;

    @Column(nullable=false,length=50)
    private String role;

    @Column(nullable=false)
    private Boolean status = true;      // if it works then good or else try to alter the table manually.

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public User(String name, String username, String email, String password, int age,String role){
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role  = role;
        this.age = age;
    }

    public User(String name, String username, String email, String password,String role){
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
    }

}