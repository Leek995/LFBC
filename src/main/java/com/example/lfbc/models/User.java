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

    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Column(name = "username", nullable = false, unique = true, length = 50)
    private String username;

    @Column(name = "password", nullable = false, length = 30)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name= "role")
    private UserRole role;

    @Column(name = "phone_number" , nullable = false, length = 15)
    private long phone_number;

    public User(){}

    public User(long id, String first_name, String last_name, String email, String username, String password, UserRole role, long phone_number) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
        this.phone_number = phone_number;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
