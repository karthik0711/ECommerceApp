package com.example.sampleecommerce.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.mapping.UniqueKey;

import static jakarta.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity(name = "prod_user")
public class User {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;
    private  String name;
    @Column(name = "user_email",unique=true)
    private String email;
}
