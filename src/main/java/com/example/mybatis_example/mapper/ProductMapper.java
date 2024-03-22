package com.example.mybatis_example.mapper;

import com.example.mybatis_example.model.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ProductMapper {

    @Select("SELECT * FROM Product LIMIT #{limit} OFFSET #{offset}")
    List<Product> findAll(@Param("offset") int offset, @Param("limit") int limit);

    @Select("SELECT * FROM Product WHERE id = #{id}")
    Product findById(@Param("id") int id);

    @Delete("DELETE FROM Product WHERE id = #{id}")
    int deleteProduct(@Param("id")int id);

    @Insert("INSERT INTO Product(id, name, status) VALUES(#{id}, #{name}, #{status})")
    int save(Product item);

    @Update("UPDATE Product SET name = ${name}, status = #{status}")
    int update(Product item);
}
