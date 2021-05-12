package com.latteyan.demo.ms.members.feign.dto;

import lombok.Data;

import java.io.Serializable;

/**
 *
 */
@Data
public class ProductDTO implements Serializable {

    private String id;
    private String name;
    private String description;
}
