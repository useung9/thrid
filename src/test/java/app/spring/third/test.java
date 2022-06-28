package app.spring.third;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import app.spring.third.dto.Reservation;
import app.spring.third.repository.ReservationRepositoryImpl;
import app.spring.third.service.ReservationServiceImpl;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml",
"file:src/main/webapp/WEB-INF/spring/**/servlet-context.xml"})
public class test {
	
	@Autowired
	ReservationServiceImpl rs = new ReservationServiceImpl();
	@Autowired
	ReservationRepositoryImpl rr = new ReservationRepositoryImpl();
	
	@Value("${file.savedir}")
	private String savedir;
	
	@Test
	public void test() throws ParseException {
	System.out.println(savedir);
	}
	
}
