package com.latteyan.demo.ms.members.feign;

import com.latteyan.demo.ms.members.feign.dto.ProductDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "product", url = "product")
public interface ProductClient {

    @GetMapping(value = "products/{memberId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<ProductDTO> findByMemberId(@PathVariable Long memberId);
}