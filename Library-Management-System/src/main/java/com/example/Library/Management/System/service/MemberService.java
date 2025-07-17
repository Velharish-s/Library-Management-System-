package com.example.Library.Management.System.service;

import com.example.Library.Management.System.repo.MemberRepo;
import com.example.Library.Management.System.source.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    MemberRepo memberRepo;
    public List<Member> getAllMembers(){
        return memberRepo.findAll();
    }
    public Object getMemberById(int id){
        return memberRepo.findById(id);
    }
    public void addMemberRepo(Member member){
        memberRepo.save(member);
    }
    public void updateMember(Member member){
        memberRepo.save(member);
    }
    public void deleteId(int id){
        memberRepo.deleteById(id);
    }
}
