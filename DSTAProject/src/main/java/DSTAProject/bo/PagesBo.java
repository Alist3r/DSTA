package DSTAProject.bo;

import DSTAProject.model.Pages;

public interface PagesBo {

	public void save(Pages page);
	public void update(Pages page);
	public void delete(Pages page);
	public Pages getById(int idPages);
		
}
