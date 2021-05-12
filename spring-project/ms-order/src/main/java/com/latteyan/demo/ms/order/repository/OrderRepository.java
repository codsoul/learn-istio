package com.latteyan.demo.ms.order.repository;

import com.latteyan.demo.ms.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}