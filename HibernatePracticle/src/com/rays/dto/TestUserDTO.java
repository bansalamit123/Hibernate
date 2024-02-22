package com.rays.dto;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUserDTO {
	public static void main(String[] args) {
		UserDTO us=new UserDTO();
		//us.setId(2);
		us.setFirstName("afgfffmita");
		us.setLastName("Bansal");
		us.setLogin("bansalmait168@gmail.com");
		us.setPassword("1234");
		us.setDob(new Date());
		us.setAddress("Indore");
		 
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(us);;
		tx.commit();
		session.close();
	
	}
	


}
