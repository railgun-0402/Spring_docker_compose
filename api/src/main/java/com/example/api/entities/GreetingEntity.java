package com.example.api.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "greetings")
public class GreetingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String lang;
    public String text;
}
