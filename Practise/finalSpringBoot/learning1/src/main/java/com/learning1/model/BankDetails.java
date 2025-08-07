package com.learning1.model;


import java.time.LocalDateTime;

import org.hibernate.annotations.*;
import jakarta.persistence.*;
import jakarta.persistence.Table;       // because table annotation is also present in org.hibernate.annotation
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(
    name="bank_details",
    schema="practise"
)
@Entity
public class BankDetails {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name="user_id",nullable=false,unique=true)
    private User user;

    @Column(nullable=false,unique=true,length = 200)
    private String ifsc;

    @Column(nullable=false,unique=true,length = 200)
    private String bank_account;

    @Column(nullable=false,unique=false,length=200)
    private String bank_name;

    @Column(nullable=false)
    private Boolean isValid;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public BankDetails(User user,String ifsc, String bank_account, String bank_name, Boolean isValid) {
        this.ifsc = ifsc;
        this.bank_account = bank_account;
        this.bank_name = bank_name;
        this.isValid = isValid;
        this.user = user;
    }

    public BankDetails(User user,String ifsc, String bank_account, String bank_name) {
        this.ifsc = ifsc;
        this.bank_account = bank_account;
        this.bank_name = bank_name;
        this.isValid = false;
        this.user = user;
    } 

}
