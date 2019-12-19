package com.shop.test;

import static java.lang.System.out;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;  //Static import

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shop.config.DBConfig;
import com.shop.daos.ProductDao;
import com.shop.models.Product;

public class ProductTest {

	private static ProductDao productDaoObj;
	
	@BeforeClass
	public static void init(){
		out.println("I m in init - start");
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
	 	
		productDaoObj=context.getBean(ProductDao.class,"productDao");
   	 	out.println("I m in init - end");
	}
	
	@Test
	@Ignore
	public void addProductTest(){
		Product p=new Product();
		p.setProductName("T-Shirts");
		p.setPrice(500.00);
		
		boolean r=productDaoObj.addProduct(p);
		assertTrue("Problem in Adding Product", r);
	}
	
	@Test
	@Ignore
	public void getProductByIdTest(){
		Product pObj=productDaoObj.getProductById(1);
		assertNotSame("Product with given id doesnt exist", pObj);
	}
	
	@Test
	public void getAllProductsTest(){
		List<Product> pList=productDaoObj.getAllProducts();
		//Assert.assertNotEquals("Not Products Found...", pList.size(), 0);
	assertNotSame("Not Products Found...", pList.size(), 0);
	}
	
}
