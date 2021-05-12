package com.latteyan.demo.ms.members.feign.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 *
 */
@Data
public class OrderDTO implements Serializable {

    private Long id;
    private String salesOffice;
    private String region;
    private Date createdTime;
}
