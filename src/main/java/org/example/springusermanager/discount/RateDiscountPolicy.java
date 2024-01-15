package org.example.springusermanager.discount;

import org.example.springusermanager.member.Grade;
import org.example.springusermanager.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            return price * 10 / 100;
        }
        return 0;
    }
}
