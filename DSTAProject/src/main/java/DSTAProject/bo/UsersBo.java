package DSTAProject.bo;

import DSTAProject.model.Users;

public interface UsersBo {

	public void save(Users controller);
	public void update(Users controller);
	public void delete(Users controller);
	public Users checkLogin(String username, String psw);
		
}
