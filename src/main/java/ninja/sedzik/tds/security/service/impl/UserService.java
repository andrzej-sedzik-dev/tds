package ninja.sedzik.tds.security.service.impl;



import ninja.sedzik.tds.security.model.User;

import java.util.List;

public interface UserService {
	List<User> findAllUsers();
	
	User findByUserName(String userName);
	
	User save(User user);

}
