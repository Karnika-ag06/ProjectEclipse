package com.iris.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iris.dao.PersonDao;
import com.iris.model.Person;
import com.iris.service.PersonService;

@Service
public  class PersonServiceImpl implements PersonService{

	@Autowired
	PersonDao personDao;
	

	public boolean addPerson(Person personObj) {
		// TODO Auto-generated method stub
		return personDao.addPerson(personObj);
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return personDao.getAllPersons();
	}

	@Override
	public boolean deletePerson(int personId) {
		// TODO Auto-generated method stub
		return personDao.deletePerson(personId);
	}

	@Override
	public boolean updatePerson(Person pObj) {
		// TODO Auto-generated method stub
		return personDao.updatePerson(pObj);
	}

	
	}

