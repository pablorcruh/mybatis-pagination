package com.example.mybatis_example.controller;

import com.example.mybatis_example.model.Product;
import com.example.mybatis_example.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping()
    public Map<String, Object> findAll(@RequestParam("page")int page, @RequestParam("size")int size){
        int offset = (page - 1) * size;
        List<Product> products = service.findAll(offset, size);
        Map<String, Object> response = new HashMap<>();
        response.put("page", page);
        response.put("users", products);
        return response;
    }
}
