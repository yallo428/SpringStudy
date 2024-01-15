package org.example.springusermanager.repository;

import org.example.springusermanager.member.Grade;
import org.example.springusermanager.member.Member;
import org.example.springusermanager.service.MemberService;
import org.example.springusermanager.service.MemberServiceImpl;
import org.junit.jupiter.api.Test;

class MemoryMemberRepositoryTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        Member member = new Member(1L, "membeerA", Grade.VIP);
        memberService.join(member);
        Member findMember = memberService.findMember(1L);


        org.assertj.core.api.Assertions.assertThat(member).isEqualTo(findMember);

    }
}