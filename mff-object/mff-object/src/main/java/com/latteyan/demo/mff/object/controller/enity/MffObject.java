package com.demo.ms.receiver.web.enity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * Order enity
 *
 * @author Latte Yan
 */
@Entity
@Table(name = "mff_object")
@Data
public class MffObject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}