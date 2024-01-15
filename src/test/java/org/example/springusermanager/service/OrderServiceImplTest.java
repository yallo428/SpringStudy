package org.example.springusermanager.service;

import org.example.springusermanager.member.Grade;
import org.example.springusermanager.member.Member;
import org.example.springusermanager.order.Order;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class OrderServiceImplTest {

    OrderService orderService = new OrderServiceImpl();
    MemberService memberService = new MemberServiceImpl();

    @Test
    @DisplayName("VIP는 10% 할인 적용되어야 한다.")
    public void 오더_테스트(){
        Member member = new Member(1L, "memberA", Grade.VIP);

        memberService.join(member);

        Order itemA = orderService.createOrder(1L, "itemA", 20000);
        System.out.println(itemA);
    }

    @Test
    @DisplayName("VIP아니면 할인X")
    public void vip_x(){
        Member member = new Member(1L, "memberA", Grade.BASIC);

        memberService.join(member);

        Order itemA = orderService.createOrder(1L, "itemA", 20000);
        System.out.println(itemA);
    }

}