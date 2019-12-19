  
package com.iris.daos;

import java.util.List;

import com.iris.model.User;

public interface UserDao {
	public boolean saveUser(User uObj);
	public User getUser(int userId);
	public List<User> getAllUsers();
}