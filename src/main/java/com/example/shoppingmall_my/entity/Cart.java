package com.example.shoppingmall_my.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="cart")
@Data
public class Cart extends BaseEntity{
    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="member_id")
    private Member member;
}
