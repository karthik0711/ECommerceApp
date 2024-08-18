package com.example.sampleecommerce.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Product {
    private Long id;
    private String title;
    private String description;
    private double price;
    private String image;
    private String category;
}
