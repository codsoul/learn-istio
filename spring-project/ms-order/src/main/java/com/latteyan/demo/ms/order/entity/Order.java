package com.latteyan.demo.ms.order.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Order enity
 *
 * @author Latte Yan
 */
@Entity
@Data
@Table(name = "user_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}