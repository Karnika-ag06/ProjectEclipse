package com.iris.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iris.dao.PersonDao;
import com.iris.model.Person;


@Controller
@CrossOrigin("http://localhost:4200")
public class PersonController {
	
	@Autowired
	PersonDao personDao;
	
    @PostMapping("/person")
	public ResponseEntity<?> addPerson(@RequestBody Person pObj)
	{
		boolean b=personDao.addPerson(pObj);
		if(b) {
			return new ResponseEntity<String>("Person Added Successfully..",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Person in Adding Person..",HttpStatus.INTERNAL_SERVER_ERROR);
				
		}
	}
	
	
	
    @GetMapping("/person")
	public ResponseEntity<?> getAllPerson()
	{
		List<Person> list=personDao.getAllPersons();
    	if(list.size()!=0) {
			return new ResponseEntity<List<Person>>(list,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("no person found..",HttpStatus.OK);
				
		}
	}
	
    @DeleteMapping("/person/{pId}")
	public ResponseEntity<?> deletePerson(@PathVariable("pId") int personId)
	{
		boolean b=personDao.deletePerson(personId);
		if(b) {
			return new ResponseEntity<String>("Person deleted Successfully..",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Person with " +personId+ " doesnot exist..",HttpStatus.OK);
				
		}
	}
   @PutMapping("/person/{pId}")
  	public ResponseEntity<?> updatePerson(@PathVariable("pId") Person pObj)
  	{
  		boolean b=personDao.updatePerson(pObj);
  		if(b) {
  			return new ResponseEntity<String>("Person updated Successfully..",HttpStatus.OK);
  		}
  		else {
  			return new ResponseEntity<String>("Person cant be updated..",HttpStatus.OK);
  				
  		}
  	}
    
}
