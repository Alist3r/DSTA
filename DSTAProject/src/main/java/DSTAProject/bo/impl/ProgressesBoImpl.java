package DSTAProject.bo.impl;

import DSTAProject.bo.ProgressesBo;
import DSTAProject.dao.ProgressesDao;
import DSTAProject.model.Progresses;

public class ProgressesBoImpl implements ProgressesBo{
	
	private ProgressesDao progressesDao;
	
	public void setProgressesDao(ProgressesDao progressesDao) {
		this.progressesDao = progressesDao;
	}

	@Override
	public void save(Progresses progress) {
		progressesDao.insert(progress);	
	}

	@Override
	public void update(Progresses progress) {
		progressesDao.update(progress);	
	}

	@Override
	public void delete(Progresses progress) {
		progressesDao.delete(progress);			
	}

	@Override
	public Progresses getById(int idProgress) {
		return progressesDao.getById(idProgress);
	}

	@Override
	public Progresses getByUserId(int idUser) {
		return progressesDao.getByUserId(idUser);
	}
	
	

}
