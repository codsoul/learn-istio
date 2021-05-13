package com.latteyan.demo.ms.order.controller;

import com.latteyan.demo.ms.order.entity.Order;
import com.latteyan.demo.ms.order.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @GetMapping
    public List<Order> findAll() {
        return orderService.findAll();
    }

    @GetMapping("/{memberId}")
    public List<Order> findByMemberId(@PathVariable Long memberId) {
        return orderService.findByMemberId(memberId);
    }
}
