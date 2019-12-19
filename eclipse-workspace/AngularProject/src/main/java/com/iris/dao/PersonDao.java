package com.iris.dao;

import java.util.List;

import com.iris.model.Person;


public interface PersonDao {

	public boolean addPerson(Person personObj);
	public List<Person> getAllPersons();
	public boolean deletePerson(int personId);
	public boolean updatePerson(Person pObj);
	
}
