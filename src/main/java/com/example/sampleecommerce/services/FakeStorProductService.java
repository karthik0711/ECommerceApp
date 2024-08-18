package com.example.sampleecommerce.services;

import com.example.sampleecommerce.models.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service

public class FakeStorProductService implements ProductService{
    private  RestTemplate restTemplate = new RestTemplate();
    private final String apiUrl = "https://fakestoreapi.com/products/";
    FakeStorProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
    @Override
    public Product getProductById(Long id) {
        String url = apiUrl + id;
        return restTemplate.getForObject(url, Product.class);
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }
}
