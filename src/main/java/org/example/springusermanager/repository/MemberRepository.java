package org.example.springusermanager.repository;

import org.example.springusermanager.member.Member;

public interface MemberRepository {

    void save(Member member);
    Member findById(Long id);
}
