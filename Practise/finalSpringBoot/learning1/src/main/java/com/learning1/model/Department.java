package com.learning1.model;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;       // because table annotation is also present in org.hibernate.annotation
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(
    name="department",
    schema="practise"
)
@Entity
public class Department{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(nullable=false,unique=true,length=200)
    private String dept_name;

    @OneToMany(mappedBy="department",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<User> user;

    @Column(nullable=true,length=200)
    private String dept_location;
    
    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    // public Department(String dept_location, String dept_name, List<User> user) {
    public Department(String dept_location, String dept_name) {
        this.dept_location = dept_location;
        this.dept_name = dept_name;
        // this.user = user;
    }

}