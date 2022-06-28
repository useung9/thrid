package app.spring.third.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.spring.third.dto.Room;
import app.spring.third.dto.RoomNReserv;
<<<<<<< HEAD
import app.spring.third.repository.RoomRepository;
=======
import app.spring.third.repository.RoomRepositoryImpl;
>>>>>>> e84d1ba97357fb2bd1686a48a2c537e809f06b9a

@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
<<<<<<< HEAD
	private RoomRepository roomRepository;
=======
	private RoomRepositoryImpl roomRepository;
>>>>>>> e84d1ba97357fb2bd1686a48a2c537e809f06b9a
	
	public List<Room> selectall(){
		return roomRepository.select_all();
		
	}
	
	// 룸 / 예약 정보
	@Override
	public List<RoomNReserv> select_roomNreserv(){
		return roomRepository.select_roomNreser();
				
	}

	// 룸+ 룸이미지 파일
	@Override
	public List<Map<String, Object>> roomNroomfile() {
		
		return roomRepository.roomNroomfile();
	}
	
	// 룸 이름을 통한 룸 번호 가져오기
	@Override
	public int getroom_idx(String room_name) {

		return roomRepository.getroom_idx(room_name);
	}
<<<<<<< HEAD
	
	//룸정보 상세보기
	@Override
	public Room selectOne(int room_idx) {
		return roomRepository.selectOne(room_idx);
	}
=======
>>>>>>> e84d1ba97357fb2bd1686a48a2c537e809f06b9a
}
