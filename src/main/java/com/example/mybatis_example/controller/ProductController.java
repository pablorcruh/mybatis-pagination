package com.example.mybatis_example.controller;

import com.example.mybatis_example.model.Pagination;
import com.example.mybatis_example.model.Product;
import com.example.mybatis_example.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public Map<Object, Object> findAll(
            @RequestParam("filter") String filter,
            @RequestParam("page")int page,
            @RequestParam("size")int size){
        int totalItems = 0;
        int totalPages = 0;
        int offset = (page - 1) * size;
        List<Product> products = service.findAll(filter, offset, size);
        if(filter.isEmpty() || filter.isBlank()){
            totalItems = service.getItemCount();
        }else{
            totalItems = products.size();
        }
        totalPages = (int) Math.ceil((double) totalItems / size);
        List<Pagination> pageResponse = new ArrayList<>();
        Pagination pagination = new Pagination(size, page, totalPages);
        pageResponse.add(pagination);
        Map<Object, Object> response = new HashMap<>();
        response.put("pagination", pageResponse);
        response.put("products", products);
        return response;
    }
}
