package app.spring.third.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.spring.third.dto.RoomFile;
import app.spring.third.repository.RoomFileRepository;

@Service
public class RoomFileServiceImpl implements RoomFileService{

	@Autowired
	private RoomFileRepository roomfileRepository;
	
	@Override
	public List<RoomFile> selectList() {
		// TODO Auto-generated method stub
		return roomfileRepository.selectList();
	}

}
