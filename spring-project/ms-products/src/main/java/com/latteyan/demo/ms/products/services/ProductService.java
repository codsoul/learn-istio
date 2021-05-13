package com.latteyan.demo.ms.products.services;

import com.latteyan.demo.ms.products.entity.Product;
import com.latteyan.demo.ms.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public List<Product> findByMemberId(Long memberId) {
        return productRepository.findByMemberId(memberId);
    }
}