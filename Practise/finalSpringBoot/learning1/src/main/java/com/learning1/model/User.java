package com.learning1.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.*;
import jakarta.persistence.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Table;       // because table annotation is also present in org.hibernate.annotation
import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Table(
    name = "users",
    schema="practise"
)
@Entity
public class User{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="dept_id")
    private Department dept;

    @OneToOne(mappedBy="user", cascade=CascadeType.ALL)
    private BankDetails bank_details;

    @Column(unique=true,nullable=false,length=200)
    private String username;

    @Column(unique=false,nullable=false,length=200)
    private String fullname;

    @Column(unique=true,nullable=true,length=20)
    private String number;

    @Column(nullable=true)
    private int age;

    @Column(nullable=false)
    private Boolean isActive;

    @Column(nullable=false)
    private String role;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public User(Department dept,String username, String fullname,String number, int age, String role) {
        this.username = username;
        this.fullname = fullname;
        this.number = number;
        this.age = age;
        this.isActive = true;
        this.role = role;
        this.dept = dept;
    }

    public User(Department dept,String username, String fullname,int age, String number) {
        this.username = username;
        this.fullname = fullname;
        this.number = number;
        this.age = age;
        this.isActive = true;
        this.role = "USER";
        this.dept = dept;
    }

    public User(Department dept,String username, String fullname) {
        this.username = username;
        this.fullname = fullname;
        this.isActive = true;
        this.role = "USER";
        this.dept = dept;
    }
}