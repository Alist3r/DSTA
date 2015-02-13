package DSTAProject.bo;

import DSTAProject.model.Progresses;

public interface ProgressesBo {

	public void save(Progresses progress);
	public void update(Progresses progress);
	public void delete(Progresses progress);
	public Progresses getById(int idProgress);
	public Progresses getByUserId(int idUser);
		
}
