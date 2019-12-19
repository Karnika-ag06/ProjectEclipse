package com.iris.HibernateDemo1;

import com.iris.daos.UserDao;
import com.iris.daosImpl.UserDaoImpl;
import com.iris.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	User uObj=new User();
    	
    	
    	uObj.setPassword("2001");
    	uObj.setUserName("Sonalika");
    	uObj.setGender("female");
    	uObj.setCity("Noida");
    	uObj.setRole("customer");
    	uObj.setEmail("sonalika@gmail.com");
    	
    
    	
       UserDao userDao=new UserDaoImpl();
       userDao.saveUser(uObj);
    }
}
