package com.springsec2.model;


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
@ToString
@NoArgsConstructor
@Entity
@Table(
    name="users",
    schema="practise"
)

public class User {
       
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int Id;

    @Column(nullable=false,length=200)
    private String name;

    @Column(nullable=false,length=200)
    private String email;

    @Column(nullable=false,length=250)
    private String password;

    @Column(nullable=false,length=50)
    private String role = "USER";

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public User(String name, String email, String password, String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        if(role == null){   this.role = "USER"; }   else{   this.role = role;   }
    }    
}
