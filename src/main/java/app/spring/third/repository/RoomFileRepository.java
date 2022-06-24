package app.spring.third.repository;

import java.util.List;
import app.spring.third.dto.RoomFile;

public interface RoomFileRepository {
	
	List<RoomFile> selectList();
}
