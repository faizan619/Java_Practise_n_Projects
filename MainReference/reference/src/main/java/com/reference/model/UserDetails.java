package com.reference.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.time.LocalDateTime;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "user_details", schema = "practise")
public class UserDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private int userId;

    @Column(nullable = true)
    private String address;

    @Column(nullable = false)
    private String state;

    @Column(nullable = true)
    private String country;

    @Column(nullable = true)
    private Boolean isMarried;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public UserDetails(int userId, String address, String state, String country, Boolean isMarried) {
        this.userId = userId;
        this.address = address;
        this.state = state;
        this.country = country;
        this.isMarried = isMarried;
    }

    public UserDetails(int userId, String address, String state) {
        this.userId = userId;
        this.address = address;
        this.state = state;
        this.isMarried = false; // Default value for isMarried
    }
}
