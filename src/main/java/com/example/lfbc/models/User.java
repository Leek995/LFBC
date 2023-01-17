package com.example.lfbc.models;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column(name = "first_name", nullable = false, length = 25)
    private String first_name;

    @Column(name = "last_name", nullable = false, length = 25)
    private String last_name;

    @Column(name = "phone_number" , nullable = false, length = 15)
    private long phone_number;

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "username", nullable = false, unique = true, length = 50)
    private String username;

    @Column(name = "password", nullable = false, length = 30)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name= "role")
    private UserRole role;
}
