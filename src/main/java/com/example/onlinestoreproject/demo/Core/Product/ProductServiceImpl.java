package com.example.onlinestoreproject.demo.Core.Product;

import com.example.onlinestoreproject.demo.Core.Product.Entities.ProductEntity;
import com.example.onlinestoreproject.demo.Infrastructure.Interfaces.ProductService;
import com.example.onlinestoreproject.demo.Infrastructure.Models.Product.ProductModel;
import com.example.onlinestoreproject.demo.Infrastructure.Repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductModel> getAllProducts() {
        List<ProductEntity> productEntities = new ArrayList<>();
        List<ProductModel> productModels = new ArrayList<>();
        productEntities = productRepository.findAll();

        for(int i = 0; i < productEntities.size(); i++){
            ProductEntity entity = productEntities.get(i);
            ProductModel model = new ProductModel();
            model.setId(entity.getId());
            model.setName(entity.getName());
            productModels.add(model);
        }
        return productModels;
    }
}
