package com.iris.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import com.iris.dao.UserDao;
import com.iris.model.User;
import com.iris.utility.SessionFactoryProvider;

public class UserDaoImpl implements UserDao {
                
                SessionFactory sf = SessionFactoryProvider.getSessionFactory();

                public boolean saveUser(User obj) throws Exception {
                                Session session = sf.openSession();
                                Transaction tx = session.beginTransaction();
                                session.save(obj);
                                tx.commit();
                                session.close();
                                return true;
                }
                

                public User getUser(int userId) throws Exception {
                                Session session=sf.openSession();

                                User obj=session.get(User.class,userId);

                                session.close();

                                return obj;
                }
                
                


                
                
                public User validateUser(int uId, String pass) throws Exception {
                                Session session = sf.openSession();
                                User user = session.get(User.class, uId);
                                
                                if(user==null) {
                                   return null;
                                }
                                else {
                                String s = user.getPassword();
                                if(s.equals(pass)) {
                                return user;
                                }
                                }
                                return null;
                
                
                }
                

                public boolean deleteuser(int id) throws Exception {
                                Session session = sf.openSession();
                                Transaction tx = session.beginTransaction();
                                User user = session.get(User.class, id);
			                   if(user==null) {
			                      return false;
			                     }
			                    else {
                                session.delete(user);
                                tx.commit();
                                session.close();
                                return true;
                                }
                }

                public boolean updateUser(User obj) throws Exception {
                                Session session = sf.openSession();
                                Transaction tx = session.beginTransaction();
                                session.merge(obj);
                                tx.commit();
                                session.close();
                                return true;
                }


				public List<User> getAllUsers() throws Exception {
					 Session session = sf.openSession();
                     Query<User> query = session.createQuery("from com.iris.model.User");
                     List<User> userList = query.list();
                     return userList;
				}


			}


