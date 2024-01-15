package org.example.springusermanager;

import org.example.springusermanager.member.Grade;
import org.example.springusermanager.member.Member;
import org.example.springusermanager.service.MemberService;
import org.example.springusermanager.service.OrderService;
import org.example.springusermanager.order.Order;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();

        OrderService orderService = appConfig.orderService();

        Member member = new Member(1L, "membeerA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(member.getId(), "itemA", 10000);

        System.out.println("member = " + member);
        System.out.println("findMember = " + order);
    }
}
