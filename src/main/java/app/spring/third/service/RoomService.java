package app.spring.third.service;

import java.util.List;
import java.util.Map;

import app.spring.third.dto.Room;
import app.spring.third.dto.RoomNReserv;

public interface RoomService {

	// 전체조회
	List<Room> selectall();
	
	// 룸 / 예약 정보
	List<RoomNReserv> select_roomNreserv();

	
	// 룸+룸 이미지
	List<Map<String, Object>> roomNroomfile();
	
	int getroom_idx(String string);
<<<<<<< HEAD
	
	//룸 상세보기
	Room selectOne(int room_idx);
=======
>>>>>>> e84d1ba97357fb2bd1686a48a2c537e809f06b9a
}
