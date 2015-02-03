package DSTAProject.dao;


import DSTAProject.model.Pages;

public interface PagesDao {

	public void insert(Pages page);
	public void update(Pages page);
	public void delete(Pages page);
	public Pages getById(int idPages);
	
}
