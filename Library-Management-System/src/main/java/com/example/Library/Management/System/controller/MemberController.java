package com.example.Library.Management.System.controller;

import com.example.Library.Management.System.service.MemberService;
import com.example.Library.Management.System.source.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class MemberController {
    @Autowired
    MemberService memberService;
    @GetMapping("/members")
    List<Member> getAllMembers(){
        return memberService.getAllMembers();
    }
    @GetMapping("/members/{id}")
    Object getMemberById(@PathVariable int id){
        return memberService.getMemberById(id);
    }
    @PostMapping("/members")
    void addMember(@RequestBody Member member){
        memberService.addMemberRepo(member);
    }
    @PutMapping("/members/{id}")
    void updateMember(@PathVariable int id,@RequestBody Member member){
        memberService.updateMember(member);
    }
    @DeleteMapping("/members/{id}")
    void deleteById(@PathVariable int id){
        memberService.deleteId(id);
    }
}
