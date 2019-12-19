

package com.iris.dao;

import java.util.List;

import com.iris.model.User;

public interface UserDao {
	public boolean saveUser(User uObj) throws Exception;
	public User getUser(int userId) throws Exception;
	public List<User> getAllUsers() throws Exception;
	 public User validateUser(int uId, String pass) throws Exception;
	   public boolean deleteuser(int id) throws Exception;
	   public boolean updateUser(User obj) throws Exception;
}