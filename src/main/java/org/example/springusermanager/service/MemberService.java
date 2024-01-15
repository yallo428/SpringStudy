package org.example.springusermanager.service;

import org.example.springusermanager.member.Member;

public interface MemberService {

    void join(Member member);
    Member findMember(Long id);
}
