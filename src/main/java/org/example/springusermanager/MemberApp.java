package org.example.springusermanager;

import org.example.springusermanager.member.Grade;
import org.example.springusermanager.member.Member;
import org.example.springusermanager.service.MemberService;
import org.example.springusermanager.service.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "membeerA", Grade.VIP);

        memberService.join(member);

        Member findMember = memberService.findMember(1L);

        System.out.println("member = " + member);
        System.out.println("findMember = " + findMember);
    }
}
