package com.latteyan.demo.ms.members.repository;

import com.latteyan.demo.ms.members.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}