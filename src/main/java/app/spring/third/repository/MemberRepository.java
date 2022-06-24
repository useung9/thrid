package app.spring.third.repository;

import java.util.List;

import javax.servlet.http.HttpSession;

import app.spring.third.dto.Member;

public interface MemberRepository {

	//회원가입 아이디 체크
	Member selectOne(String member_id);
	//회원가입
	int insert(Member member);	
	//개인정보 수정
	int update(Member member) throws Exception;
	
	//회원가입 이메일 전송
	int update_emailauth(String member_id);
	
	//네이버 가입
	int insert_simplejoin(Member member);
	
	
	//회원탈퇴
	int delete(String member_id) throws Exception;
	
	// 전체 유저목록 - 관리자로부터
	List<Member> AllUser();
	

	


}
