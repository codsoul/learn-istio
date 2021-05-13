package com.latteyan.demo.ms.products.controller;

import com.latteyan.demo.ms.products.entity.Product;
import com.latteyan.demo.ms.products.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }


    @GetMapping("/{memberId}")
    public List<Product> findByMemberId(@PathVariable Long memberId) {
        return productService.findByMemberId(memberId);
    }
}
