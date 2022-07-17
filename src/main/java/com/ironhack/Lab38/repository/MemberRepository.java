package com.ironhack.Lab38.repository;
import com.ironhack.Lab38.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {

}
