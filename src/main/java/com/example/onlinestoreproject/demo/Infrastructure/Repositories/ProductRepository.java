package com.example.onlinestoreproject.demo.Infrastructure.Repositories;

import com.example.onlinestoreproject.demo.Core.Product.Entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

    List<ProductEntity> findAll();


}
