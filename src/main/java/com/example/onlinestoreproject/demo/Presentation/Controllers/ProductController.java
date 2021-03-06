package com.example.onlinestoreproject.demo.Presentation.Controllers;

import com.example.onlinestoreproject.demo.Infrastructure.Converters.Product;
import com.example.onlinestoreproject.demo.Infrastructure.Interfaces.ProductService;
import com.example.onlinestoreproject.demo.Presentation.DTO.Product.ProductDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return Product.toDTO(productService.getAllProducts());
    }
}
