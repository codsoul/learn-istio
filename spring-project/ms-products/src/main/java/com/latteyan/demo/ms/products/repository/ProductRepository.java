package com.latteyan.demo.ms.products.repository;

import com.latteyan.demo.ms.products.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}