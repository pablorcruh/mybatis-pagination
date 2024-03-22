package com.example.mybatis_example.mapper;

import com.example.mybatis_example.model.Product;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

@Mapper
public interface ProductMapper {

    @SelectProvider(type = ProductSqlProvider.class, method = "getProductFilter")
    List<Product> findAll(@Param("filter") String filter, @Param("offset") int offset, @Param("limit") int limit);

    @Select("SELECT * FROM Product WHERE id = #{id}")
    Product findById(@Param("id") int id);

    @Delete("DELETE FROM Product WHERE id = #{id}")
    int deleteProduct(@Param("id")int id);

    @Insert("INSERT INTO Product(id, name, status) VALUES(#{id}, #{name}, #{status})")
    int save(Product item);

    @Update("UPDATE Product SET name = ${name}, status = #{status}")
    int update(Product item);

    @Select("SELECT COUNT(*) FROM Product")
    int getItemCount();

    static class ProductSqlProvider{
        public String getProductFilter(String filter, int offset, int limit){
            return new SQL(){{
                SELECT("*");
                FROM("Product");
                if(filter!=null){
                    WHERE("name LIKE CONCAT('%', #{filter}, '%') OR description LIKE CONCAT('%', #{filter}, '%')");
                }
                LIMIT("#{limit} OFFSET #{offset}");
            }}.toString();
        }
    }
}

