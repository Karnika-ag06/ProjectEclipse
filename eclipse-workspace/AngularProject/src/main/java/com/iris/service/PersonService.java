package com.iris.service;

import java.util.List;

import com.iris.model.Person;

public interface PersonService {

	public boolean addPerson(Person personObj);
	public List<Person> getAllPersons();
	public boolean deletePerson(int  personId);
	public boolean updatePerson(Person pObj);

}
