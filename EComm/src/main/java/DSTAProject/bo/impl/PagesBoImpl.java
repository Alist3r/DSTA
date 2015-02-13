package DSTAProject.bo.impl;

import DSTAProject.bo.PagesBo;
import DSTAProject.dao.PagesDao;
import DSTAProject.model.Pages;

public class PagesBoImpl implements PagesBo{
	
	private PagesDao pagesDao;
	
	public void setPagesDao(PagesDao pagesDao) {
		this.pagesDao = pagesDao;
	}

	@Override
	public void save(Pages page) {
		pagesDao.insert(page);	
	}

	@Override
	public void update(Pages page) {
		pagesDao.update(page);	
	}

	@Override
	public void delete(Pages page) {
		pagesDao.delete(page);			
	}

	@Override
	public Pages getById(int idPages) {
		return pagesDao.getById(idPages);
	}
	
	

}
