package com.example.springbootgame.service.impl;

import com.example.springbootgame.dao.ProductDao;
import com.example.springbootgame.model.Product;
import com.example.springbootgame.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductId(productId);
    }
}
