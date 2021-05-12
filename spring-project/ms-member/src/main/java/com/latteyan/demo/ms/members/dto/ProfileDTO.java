package com.latteyan.demo.ms.members.dto;

import com.latteyan.demo.ms.members.entity.Member;
import com.latteyan.demo.ms.members.feign.dto.OrderDTO;
import com.latteyan.demo.ms.members.feign.dto.ProductDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ProfileDTO extends Member {

    private List<OrderDTO> orders;

    private List<ProductDTO> products;
}
