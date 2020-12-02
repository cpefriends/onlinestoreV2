package com.example.onlinestoreproject.demo.Presentation.Controllers;

import com.example.onlinestoreproject.demo.Core.Product.Entities.ProductEntity;
import com.example.onlinestoreproject.demo.Infrastructure.Interfaces.ProductService;
import com.example.onlinestoreproject.demo.Infrastructure.Models.Product.ProductModel;
import com.example.onlinestoreproject.demo.Presentation.DTO.Product.ProductDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping (value = "/app/product")
public class ProductController {
    ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping (value = "/getAllProducts")
    public List<ProductDTO> getAllProducts(){
        List<ProductDTO> productDTOS = new ArrayList<>();
        List<ProductModel> productModels = productService.getAllProducts();

        for(int i = 0; i < productModels.size(); i++) {
            ProductModel model = productModels.get(i);
            ProductDTO productDTO = new ProductDTO();
            productDTO.setId(model.getId());
            productDTO.setName(model.getName());
            productDTOS.add(productDTO);

        }
        return productDTOS;
    }

}
