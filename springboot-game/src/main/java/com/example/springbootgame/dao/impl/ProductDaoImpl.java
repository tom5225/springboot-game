package com.example.springbootgame.dao.impl;

import com.example.springbootgame.dao.ProductDao;
import com.example.springbootgame.model.Product;
import com.example.springbootgame.rowmapper.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.security.spec.NamedParameterSpec;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Product getProductId(Integer productId) {

        String sql ="select productId, productName, productType, productPrice, productCount, productPhoto" +
                "from video_game where productId=:productId?";

        Map<String,Object>map=new HashMap<>();
        map.put("productId",productId);

        List<Product> productList = namedParameterJdbcTemplate.query(sql, map, new ProductRowMapper());

        if(productList.size()>0){
            return productList.get(0);
        }else{
            return null;
        }
    }
}
