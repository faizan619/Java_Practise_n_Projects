package com.learning1.model;

import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.*;

import jakarta.persistence.*;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Table;       // because table annotation is also present in org.hibernate.annotation
import lombok.*;

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

    public Department(String dept_location, String dept_name, List<User> user) {
        this.dept_location = dept_location;
        this.dept_name = dept_name;
        this.user = user;
    }

    public Department(String dept_location, String dept_name){
        this.dept_location = dept_location;
        this.dept_name = dept_name;
    }

}