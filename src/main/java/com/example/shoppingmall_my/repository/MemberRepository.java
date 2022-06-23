package com.example.shoppingmall_my.repository;

import com.example.shoppingmall_my.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Member findByEmail(String email);
}
