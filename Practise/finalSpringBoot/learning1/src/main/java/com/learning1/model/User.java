package com.learning1.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;       // because table annotation is also present in org.hibernate.annotation
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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
    @JoinColumn(name="dept_id",nullable=false)
    private Department department;

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

    // public User(Department dept,String username, String fullname,String number, int age, String role) {
    public User(int dept,String username, String fullname,String number, int age, String role) {
        this.username = username;
        this.fullname = fullname;
        this.number = number;
        this.age = age;
        this.isActive = true;
        this.role = role;

        Department dept1 = new Department();
        dept1.setId(dept);
        
        this.department = dept1;
    }

    // public User(Department dept,String username, String fullname,int age, String number) {
    public User(int dept,String username, String fullname,int age, String number) {
        this.username = username;
        this.fullname = fullname;
        this.number = number;
        this.age = age;
        this.isActive = true;
        this.role = "USER";
        Department dept1 = new Department();
        dept1.setId(dept);
        
        this.department = dept1;
    }

    public User(int dept,String username, String fullname) {
        this.username = username;
        this.fullname = fullname;
        this.isActive = true;
        this.role = "USER";
        Department dept1 = new Department();
        dept1.setId(dept);
        
        this.department = dept1;
    }
}