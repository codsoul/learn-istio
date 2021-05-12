package com.latteyan.demo.ms.members.feign;

import com.latteyan.demo.ms.members.feign.dto.OrderDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "order", url = "order")
public interface OrderClient {

    @GetMapping(value = "orders/{memberId}", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<OrderDTO> findByMemberId(@PathVariable Long memberId);
}