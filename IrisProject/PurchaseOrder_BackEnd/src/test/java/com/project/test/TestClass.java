package com.project.test;



import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.config.DBConfig;
import com.project.dao.BuyerDao;
import com.project.models.BuyerDetail;


public class TestClass {

	private static BuyerDao buyerDao;
	
	@BeforeClass
	public static void init(){
		
	
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
	 	
		buyerDao=context.getBean(BuyerDao.class,"buyerDao");
   	 	System.out.println("I m in init - end");
	}
	
	@Test
	public void addBuyerTest(){
		BuyerDetail bObj=new BuyerDetail();
	
		bObj.setBuyer_Name("abc Agarwal");
		bObj.setBuyer_Address("Noida");
		bObj.setEmail_Id("asdasda@gmail.com");
		bObj.setBuyer_Password("kkk");
		bObj.setCreated_By("System");
		bObj.setCreated_date(LocalDate.now());
		bObj.setPhone_No(123456789l);
		bObj.setRole_Id(1);
		bObj.setIs_Active("Y");
		
		boolean b=buyerDao.addBuyer(bObj);
		assertTrue("Problem in Adding Buyer", b);
		
	}
}
