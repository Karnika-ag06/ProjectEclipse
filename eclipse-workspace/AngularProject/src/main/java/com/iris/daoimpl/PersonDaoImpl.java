package com.iris.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.iris.dao.PersonDao;
import com.iris.model.Person;

@Repository("personDao")
@Transactional
public class PersonDaoImpl implements PersonDao {
	

@Autowired
SessionFactory sessionFactory;

	@Override
	public boolean addPerson(Person personObj) {
		try {
			Session session=sessionFactory.getCurrentSession();
		
			session.saveOrUpdate(personObj);
			
			return true;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return false;
	}

	@Override
	public List<Person> getAllPersons() {
		Session session=sessionFactory.getCurrentSession();
		Query q=session.createQuery("from com.iris.model.Person ");
		List<Person> personsList=q.list();
		return personsList;
	}

	@Override
	public boolean deletePerson(int personId) {
		try {
			Session session=sessionFactory.getCurrentSession();
		
			Person p=session.get(Person.class,personId);
			if(p==null)
				return false;
			else {
				session.delete(p);
				return(true);
					
			}
			
		}
		catch(Exception e){
				e.printStackTrace();
			}
			return false;
	}

	@Override
	public boolean updatePerson(Person pObj) {
		try {
			Session session=sessionFactory.getCurrentSession();
		
			session.update(pObj);
			
			return true;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return false;
}
}
