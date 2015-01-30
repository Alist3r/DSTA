package DSTAProject.dao;


import DSTAProject.model.Progresses;

public interface ProgressesDao {

	public void insert(Progresses progress);
	public void update(Progresses progress);
	public void delete(Progresses progress);
	public Progresses getById(int idProgress);
	public Progresses getByUserId(int idUser);
	
}
