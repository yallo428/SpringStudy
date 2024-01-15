package org.example.springusermanager.discount;

import org.example.springusermanager.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);

}
