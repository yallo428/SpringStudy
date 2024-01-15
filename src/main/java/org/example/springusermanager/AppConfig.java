package org.example.springusermanager;


import org.example.springusermanager.discount.FixDiscountPolicy;
import org.example.springusermanager.repository.MemoryMemberRepository;
import org.example.springusermanager.service.MemberService;
import org.example.springusermanager.service.MemberServiceImpl;
import org.example.springusermanager.service.OrderService;
import org.example.springusermanager.service.OrderServiceImpl;

public class AppConfig {


    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(
                new MemoryMemberRepository(),
                new FixDiscountPolicy());
    }


}
