package org.example.springusermanager.service;

import org.example.springusermanager.discount.DiscountPolicy;
import org.example.springusermanager.discount.FixDiscountPolicy;
import org.example.springusermanager.discount.RateDiscountPolicy;
import org.example.springusermanager.member.Member;
import org.example.springusermanager.repository.MemberRepository;
import org.example.springusermanager.repository.MemoryMemberRepository;
import org.example.springusermanager.order.Order;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);

    }
}
