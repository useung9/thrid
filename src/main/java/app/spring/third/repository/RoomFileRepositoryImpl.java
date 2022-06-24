package app.spring.third.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import app.spring.third.dto.RoomFile;

@Repository
public class RoomFileRepositoryImpl implements RoomFileRepository{

	@Autowired
	private SqlSession sqlSession;
	
	String path = "app.spring.third.RoomFileMapper";
	
	@Override
	public List<RoomFile> selectList() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(path+".selectList");
	}

	
}
