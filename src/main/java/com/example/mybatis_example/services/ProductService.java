package com.example.mybatis_example.services;

import com.example.mybatis_example.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll(int offset, int limit);
    Product findById(int id);

    int deleteById(int id);
    int save(Product item);

    int update(Product item);
}
