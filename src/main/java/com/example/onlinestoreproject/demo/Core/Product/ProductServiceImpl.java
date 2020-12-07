package com.example.onlinestoreproject.demo.Core.Product;

import com.example.onlinestoreproject.demo.Infrastructure.Converters.Product;
import com.example.onlinestoreproject.demo.Infrastructure.Interfaces.ProductService;
import com.example.onlinestoreproject.demo.Infrastructure.Models.Product.ProductModel;
import com.example.onlinestoreproject.demo.Infrastructure.Repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductModel> getAllProducts() {
        return Product.asModel(productRepository.findAll());
    }
}
