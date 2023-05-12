package com.example.springbootgame.rowmapper;

import com.example.springbootgame.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Product product = new Product();
        product.setProductId(resultSet.getInt("productId"));
        product.setProductName(resultSet.getString("productName"));
        product.setProductType(resultSet.getString("productType"));
        product.setProductPrice(resultSet.getInt("productPrice"));
        product.setProductCount(resultSet.getInt("productCount"));
        product.setProductPhoto(resultSet.getString("productPhoto"));

        return product;
    }
}
