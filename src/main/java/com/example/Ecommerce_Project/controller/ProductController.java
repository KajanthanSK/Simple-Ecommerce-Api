package com.example.Ecommerce_Project.controller;

import com.example.Ecommerce_Project.model.Product;
import com.example.Ecommerce_Project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController
{
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProduct()
    {
        return productService.getAllProduct();
    }
}
