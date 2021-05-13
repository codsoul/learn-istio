package com.latteyan.demo.ms.products.repository;

import com.latteyan.demo.ms.products.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByMemberId(Long memberId);
}