package DSTAProject.bo.impl;

import DSTAProject.bo.UsersBo;
import DSTAProject.dao.UsersDao;
import DSTAProject.model.Users;

public class UsersBoImpl implements UsersBo{
	
	private UsersDao usersDao;
	

	public void setUsersDao(UsersDao usersDao) {
		this.usersDao = usersDao;
	}

	public void save(Users user){
		usersDao.insert(user);
	}
	
	public void update(Users user){
		usersDao.update(user);
	}
		
	public void delete(Users user) {
		usersDao.delete(user);
	}
	
	public Users checkLogin(String username, String psw) {
		return usersDao.checkLogin(username, psw);
	}

}
