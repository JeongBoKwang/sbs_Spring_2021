package com.example.spring.demo.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberRepository {

	void join(String loginId, String loginPw, String name, String nickName, String cellPhoneNo, String email);

}
