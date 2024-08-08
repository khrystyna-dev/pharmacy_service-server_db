package com.example.pharmacy.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private Long phoneNumber;
    private String email;
    private String password;
    private Integer bonus;
    private Role role;

    public enum Role {
        ADMIN,
        CUSTOMER
    }
}
