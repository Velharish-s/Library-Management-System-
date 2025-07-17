package com.example.Library.Management.System.repo;

import com.example.Library.Management.System.source.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepo extends JpaRepository<Member,Integer> {
}
