package com.latteyan.demo.ms.members.services;

import com.latteyan.demo.ms.members.entity.Member;
import com.latteyan.demo.ms.members.feign.OrderClient;
import com.latteyan.demo.ms.members.feign.ProductClient;
import com.latteyan.demo.ms.members.dto.ProfileDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Autowired
    private MemberService memberService;

    @Autowired
    private OrderClient orderClient;

    @Autowired
    private ProductClient productClient;


    public ProfileDTO findById(Long id) {
        Member member = memberService.findById(id);

        ProfileDTO profileDTO = new ProfileDTO();
        BeanUtils.copyProperties(member, profileDTO);
        profileDTO.setProducts(productClient.findByMemberId(id));
        profileDTO.setOrders(orderClient.findByMemberId(id));
        return profileDTO;
    }
}