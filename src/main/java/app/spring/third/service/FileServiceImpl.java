package app.spring.third.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileServiceImpl implements FileService  {
	
//	@Autowired
//	private String savedir;
	
	@Value("${file.savedir}")
	private String savedir;
	
	@Override
	public String fileUpload(MultipartFile file) throws Exception  {
		//파일을 업로드 하고 파일명을 리턴
		String originFileName = file.getOriginalFilename();
		if(originFileName.equals("")) return""; //파일이름이 없다면 공백
		
		//파일이 겹치지 않도록 시스템날짜를 붙이기
		String filename = System.currentTimeMillis() + "_" + originFileName;
		
	
		
		
		
		
		//저장할 디렉토리
		
		
		File uploadDir = new File(savedir);
		if (!uploadDir.isDirectory()) {//경로명이 없다면
			
			//경로명 path생성
			
			Files.createDirectory(Paths.get(savedir)); //경로명 path
		}
		
		
		//파일을 전송
		file.transferTo(new File(savedir,filename));
		
		
		return filename;
	}

	@Override
	public void fileDelete(String filename) throws Exception {
		
		String savedirToday = savedir + "/20220519" ; 
		File file = new File(savedirToday + "/" + filename);
		if (file.isFile()) {
			file.delete();
		}
		
		
	}
	
	

}
