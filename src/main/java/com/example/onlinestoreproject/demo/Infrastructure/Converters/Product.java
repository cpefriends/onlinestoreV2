package com.example.onlinestoreproject.demo.Infrastructure.Converters;

import com.example.onlinestoreproject.demo.Core.Product.Entities.ProductEntity;
import com.example.onlinestoreproject.demo.Infrastructure.Models.Product.ProductModel;
import com.example.onlinestoreproject.demo.Presentation.DTO.Product.ProductDTO;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private Product() {
    }

    // ProductDTO to ProductModel

    public static ProductModel toModel(ProductDTO productDTO) {
        return ProductModel.builder()
                .id(productDTO.getId())
                .name(productDTO.getName())
                .build();
    }

    public static List<ProductModel> toModel(List<ProductDTO> productDTOList) {
        List<ProductModel> productModelList = new ArrayList<>();

        for(ProductDTO productDTO : productDTOList) {
            productModelList.add(Product.toModel(productDTO));
        }

        return productModelList;
    }

    // ProductModel to Product Entity overloaded methods

    public static ProductEntity toEntity(ProductModel productModel) {
        return ProductEntity.builder()
                .id(productModel.getId())
                .name(productModel.getName())
                .build();
    }

    public static List<ProductEntity> toEntity(List<ProductModel> productModelList) {
        List<ProductEntity> productEntityList = new ArrayList<>();

        for(ProductModel productModel : productModelList) {
            productEntityList.add(Product.toEntity(productModel));
        }

        return productEntityList;
    }

    // ProductEntity to ProductModel overloaded methods

    public static ProductModel asModel(ProductEntity productEntity) {
        return ProductModel.builder()
                .id(productEntity.getId())
                .name(productEntity.getName())
                .build();
    }

    public static List<ProductModel> asModel(List<ProductEntity> productEntityList) {
        List<ProductModel> productModelList = new ArrayList<>();

        for(ProductEntity productEntity : productEntityList) {
            productModelList.add(Product.asModel(productEntity));
        }

        return productModelList;
    }

    // ProductModel to ProductDTO overloaded methods

    public static ProductDTO toDTO(ProductModel productModel) {
        return ProductDTO.builder()
                .id(productModel.getId())
                .name(productModel.getName())
                .build();
    }

    public static List<ProductDTO> toDTO(List<ProductModel> productModelList) {
        List<ProductDTO> productDTOList = new ArrayList<>();

        for(ProductModel productModel : productModelList) {
            productDTOList.add(Product.toDTO(productModel));
        }

        return productDTOList;
    }

}
