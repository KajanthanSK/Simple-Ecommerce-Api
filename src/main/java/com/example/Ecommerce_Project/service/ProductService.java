package com.example.Ecommerce_Project.service;

import com.example.Ecommerce_Project.model.Product;
import com.example.Ecommerce_Project.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService
{
    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProduct()
    {
        return productRepo.findAll();
    }
}
