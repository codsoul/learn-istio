package com.latteyan.demo.ms.order.services;

import com.latteyan.demo.ms.order.entity.Order;
import com.latteyan.demo.ms.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

}