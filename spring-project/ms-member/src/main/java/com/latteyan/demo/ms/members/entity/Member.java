package com.latteyan.demo.ms.members.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * Order entity
 *
 * @author Latte Yan
 */
@Entity
@Data
@Table(name = "user_member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    @Column(name = "user_name")
    private String userName;
}