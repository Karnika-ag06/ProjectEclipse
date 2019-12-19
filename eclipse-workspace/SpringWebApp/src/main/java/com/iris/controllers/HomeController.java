package com.iris.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.iris.daos.UserDao;
import com.iris.model.User;
import com.iris.validators.GenderValidators;

@Controller
public class HomeController {

	@Autowired
	GenderValidators myValidator;
	
	@Autowired
	UserDao userDao;
	
		@RequestMapping(value="/",method=RequestMethod.GET)
		public String HomePage(ModelMap map){
	
			map.addAttribute("myData","Welcome to Spring Web MVC!!!");
			
			return "HomePage";
		     }  
		
		@RequestMapping(value="/SignUpForm",method=RequestMethod.GET)
		public String displayRegisterForm(ModelMap map){
			map.addAttribute("userObj",new User());
			map.addAttribute("btnLabel","Sign Up");
			map.addAttribute("formLabel", "SignUp Form");
			return "SignUpForm";
		     }
		
		
		
		@RequestMapping(value="/registerUser",method=RequestMethod.POST)
		public ModelAndView registerUser(@Valid @ModelAttribute("userObj")  User userObj,
				BindingResult result){
			//Will write the code to insert the object into the database
			
			myValidator.validate(userObj, result);
			
			if(result.hasErrors()){
				System.out.println("I m here..");
				ModelAndView mv=new ModelAndView("SignUpForm");
				//mv.addObject("userObj",new User());
				mv.addObject("btnLabel","Sign Up");
				mv.addObject("formLabel", "SignUp Form");	
				return mv;
			}
			else {
			userObj.setRole("User");
			userDao.registerUser(userObj);
			
			ModelAndView mv=new ModelAndView("LoginForm");
			mv.addObject("msg","User has been registered succesfully. Now u can Login");
			return mv;
			}
		}
		
		
		@RequestMapping(value="/getLoginForm",method=RequestMethod.GET)
		public String LoginForm(){
			return "LoginForm";
		}
		
		@Autowired
		HttpSession session;
		
		@RequestMapping(value="/validate",method=RequestMethod.POST)
		
		public String validateUser(@RequestParam int userId,@RequestParam String pass){
			User uObj=userDao.validateUser(userId,pass);
			if(uObj==null){
				return "LoginForm";
			}
			else {
				String role=(String)uObj.getRole();
				session.setAttribute("uObj",uObj);
				
				if(role.equals("admin")){
					return "AdminSuccess";
				}
				else {
					return "UserSuccess";
				}
			}
		}
	}



















