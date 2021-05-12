package com.latteyan.demo.ms.members.services;

import com.latteyan.demo.ms.members.entity.Member;
import com.latteyan.demo.ms.members.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> findAll() {
        return memberRepository.findAll();
    }

}