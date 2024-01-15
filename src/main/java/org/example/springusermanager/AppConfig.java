package org.example.springusermanager;


import org.example.springusermanager.discount.DiscountPolicy;
import org.example.springusermanager.discount.FixDiscountPolicy;
import org.example.springusermanager.repository.MemoryMemberRepository;
import org.example.springusermanager.service.MemberService;
import org.example.springusermanager.service.MemberServiceImpl;
import org.example.springusermanager.service.OrderService;
import org.example.springusermanager.service.OrderServiceImpl;

public class AppConfig {

    private MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }


    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy());
    }

    private DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }


}
