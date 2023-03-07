package com.example.Book_My_Show_App.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(unique = true)
    private String mobileNumber;

    private String address;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Ticket> bookedTickets = new ArrayList<>();
}
