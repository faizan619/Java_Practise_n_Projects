package com.practise1relation.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "users", schema = "practise")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Idher Many To One Relation with Department
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String role;

    @CreationTimestamp
    private LocalDateTime createdAt;

    // public Users(int dept,String username, String password, String email, String fullName, String role) {
    //     this.username = username;
    //     this.password = password;
    //     this.email = email;
    //     this.fullName = fullName;
    //     this.role = role;

    //     this.department = new Department();
    //     this.department.setId((long) dept); 
    // }

    // public Users(int dept,String username, String password, String email, String fullName) {
    //     this.username = username;
    //     this.password = password;
    //     this.email = email;
    //     this.fullName = fullName;
    //     this.role = "USER";

    //     this.department = new Department();
    //     this.department.setId((long) dept); 
    // }
    // public Users(String username, String password, String email, String fullName, String role) {
    //     this.username = username;
    //     this.password = password;
    //     this.email = email;
    //     this.fullName = fullName;
    //     this.role = role;
    // }

    // public Users(String username, String password, String email, String fullName) {
    //     this.username = username;
    //     this.password = password;
    //     this.email = email;
    //     this.fullName = fullName;
    //     this.role = "USER";
    // }
}