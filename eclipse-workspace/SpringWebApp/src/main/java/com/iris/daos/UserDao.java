package com.iris.daos;
import java.util.List;

import com.iris.model.User;

public interface UserDao {
	public boolean registerUser(User userObj);
	public User validateUser(int Id,String password);
	public List<User> getAllUsers();
	public boolean deleteUser(User  userObj);
	public User getUserById(int Id);
	}