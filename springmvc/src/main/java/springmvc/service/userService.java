package springmvc.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springmvc.dao.UserDao;
@Repository
public class userService {
	
	@Autowired
private UserDao userDao;

//public int createUser(springmvc.model.User user) {
//	// TODO Auto-generated method stub
//	return this.userDao.Userd(user);
//}

public void User(springmvc.model.User user) {
	// TODO Auto-generated method stub
	this.userDao.Userd(user);
	
}

}
