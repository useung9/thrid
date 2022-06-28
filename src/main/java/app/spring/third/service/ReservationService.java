package app.spring.third.service;

import java.util.List;
import java.util.Map;

<<<<<<< HEAD
import javax.servlet.http.HttpSession;

=======
>>>>>>> e84d1ba97357fb2bd1686a48a2c537e809f06b9a
import app.spring.third.dto.Reservation;

public interface ReservationService{

	
	// 예약 등록 
<<<<<<< HEAD
	int insert(Reservation reservation, HttpSession session);
=======
	int insert(Reservation reservation, String roominfo);
>>>>>>> e84d1ba97357fb2bd1686a48a2c537e809f06b9a
	
	
	// 사용자 예약현황
	 List<Map<String, Object>> getuserNreserv();
	 
	 
	 // 아이디별 예약현황
	 List<Reservation> getreserv(String userid);
	 
	 // 회원 예약 데이터 삭제
	 void delreservation(List<String> map, String userid);
	 
	 // 회원 예약 confrim 처리 - 관리자로부터
	 void upreserv(String reserv_num);
	 
	 Reservation getonereservation(int idx);
	 
	 // 회원 예약 데이터 수정
	 int updatereservation(Reservation reservation, String roominfo);

	 // 사용자 예약  + 방정보
	List<Map<String, Object>> getAllreserv();

	// 예약 컨펌 필요목록
	List<Map<String, Object>> getConfirm();

	
}
