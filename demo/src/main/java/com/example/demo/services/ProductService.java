package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Product;
public interface ProductService   
{  
List<Product> findAll();  

public void addProduct(Product product);
}  