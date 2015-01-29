package DSTAProject.dao;


import DSTAProject.model.Users;



public interface UsersDao {

	public void insert(Users user);
	public void update(Users user);
	public void delete(Users user);
	public Users checkLogin(String email, String psw);
	
}
