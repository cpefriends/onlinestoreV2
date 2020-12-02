package com.example.onlinestoreproject.demo.Infrastructure.Interfaces;


import com.example.onlinestoreproject.demo.Core.Product.Entities.ProductEntity;
import com.example.onlinestoreproject.demo.Infrastructure.Models.Product.ProductModel;

import java.util.List;

public interface ProductService {
    List<ProductModel> getAllProducts();
}
