package com.reference.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
// import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "dept_id", nullable = false)
    // private Department deptId;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = true, unique = true)
    private String number;
    
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false)
    private Boolean isActive;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    // public User(int deptId, String username,String email,String number, String password, String role) {
    public User(String username,String email,String number, String password, String role) {
        // Department dept = new Department();
        // dept.setId(deptId);
        // this.deptId = dept;

        this.username = username;
        this.password = password;
        this.email = email;
        this.number = number;
        this.role = role;
        this.isActive = true; // Default value for isActive

    }
    // public User(int deptId, String username, String email, String number, String password) {
    public User(String username, String email, String number, String password) {
        // Department dept = new Department();
        // dept.setId(deptId); // deptId comes from API request
        // this.deptId = dept;

        this.username = username;
        this.email = email;
        this.number = number;
        this.password = password;
        this.role = "USER";
        this.isActive = true;
    }

    // public User(int deptId, String username,String email, String password) {
    public User(String username,String email, String password) {
        // Department dept = new Department();
        // dept.setId(deptId); // deptId comes from API request
        // this.deptId = dept;
        
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = "USER"; // Default role
        this.isActive = true;
    }

}
