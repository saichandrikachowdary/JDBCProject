 package com.codegnan.dao;
 
import java.util.List;
 
import com.codegnan.entity.User;
 
public interface UserDao {
	void addUser(User user);
	User getUserById(int id);
	List<User> getAllUsers();
	void updateUser(User user);
	void deleteUser(int id);
}
 
