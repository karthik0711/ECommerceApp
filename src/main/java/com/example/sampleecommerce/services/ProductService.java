package com.example.sampleecommerce.services;

import com.example.sampleecommerce.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id);
    List<Product> getAllProducts();
}
