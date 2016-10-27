package sk.cyklosoft.hrmservice.dao;

import sk.cyklosoft.hrmservice.model.User;
import sk.cyklosoft.hrmservice.util.SportType;

public interface UserDao {

	void register(User user);
	
	User findUserByUsername(String username);
	
//get current sport activity	
	SportType getCurrentActivity(String username);

//set current sport activity	
	void updateUser(String username, SportType sportType);

	void delete(String username);

}