package service.impl;

import javax.annotation.Resource;

import dao.UserDao;
import entity.User;
import service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	public User login(User user) {
		return userDao.login(user);
	}
}
