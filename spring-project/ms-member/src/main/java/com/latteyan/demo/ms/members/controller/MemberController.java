package com.latteyan.demo.ms.members.controller;

import com.latteyan.demo.ms.members.entity.Member;
import com.latteyan.demo.ms.members.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;


    @GetMapping
    public List<Member> findAll() {
        return memberService.findAll();
    }

}
