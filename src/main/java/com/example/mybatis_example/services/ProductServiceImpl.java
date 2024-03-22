package com.example.mybatis_example.services;

import com.example.mybatis_example.mapper.ProductMapper;
import com.example.mybatis_example.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private final ProductMapper mapper;

    public ProductServiceImpl(ProductMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<Product> findAll(int offset, int limit) {
        return mapper.findAll(offset, limit);
    }

    @Override
    public Product findById(int id) {
        return mapper.findById(id);
    }

    @Override
    public int deleteById(int id) {
        return mapper.deleteProduct(id);
    }

    @Override
    public int save(Product item) {
        return mapper.save(item);
    }

    @Override
    public int update(Product item) {
        return mapper.update(item);
    }
}
