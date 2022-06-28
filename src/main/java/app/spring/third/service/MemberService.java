package app.spring.third.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import app.spring.third.advice.ErrorCode;
import app.spring.third.dto.Member;

public interface MemberService {

	 ErrorCode insert(Member member, HttpSession session) throws Exception;

	 Member selectOne(String member_id);

	 void update_emailauth(String member_id);

	 int update(Member member) throws Exception;

	 int delete(String member_id) throws Exception;

<<<<<<< HEAD
	ErrorCode emailCheck(String email);
	
=======
	 
	 // 사용자 목록
>>>>>>> e84d1ba97357fb2bd1686a48a2c537e809f06b9a
	List<Member> AllUser();


	

	 

	

	
}
