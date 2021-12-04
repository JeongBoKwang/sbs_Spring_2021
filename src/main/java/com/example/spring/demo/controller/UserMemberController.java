package com.example.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.spring.demo.service.ArticleService;
import com.example.spring.demo.service.MemberService;
import com.sbs.exam.demo.vo.Article;

@Controller
public class UserMemberController {
	// 인스턴스 변수
	@Autowired
	private MemberService memberService;
	
	public UserMemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	//액션 매서드 시작
	@RequestMapping("/user/member/doJoin")
	@ResponseBody
	public String doJoin(String loginId, String loginPw, String name, String nickName, String cellPhoneNo, String email) {
		
		memberService.join(loginId, loginPw, name, nickName, cellPhoneNo, email);
		return "성공";
	}
	// 액션 메서드

}
