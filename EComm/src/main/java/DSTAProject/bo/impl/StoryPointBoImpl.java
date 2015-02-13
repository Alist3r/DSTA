package DSTAProject.bo.impl;

import DSTAProject.bo.StoryPointBo;
import DSTAProject.dao.StoryPointDao;
import DSTAProject.model.Story_Point;

public class StoryPointBoImpl implements StoryPointBo{
	
	private StoryPointDao storyPointDao;
	
	public void setStoryPointDao(StoryPointDao storyPointDao) {
		this.storyPointDao = storyPointDao;
	}

	@Override
	public void save(Story_Point storyPoint) {
		storyPointDao.insert(storyPoint);	
	}

	@Override
	public void update(Story_Point storyPoint) {
		storyPointDao.update(storyPoint);	
	}

	@Override
	public void delete(Story_Point storyPoint) {
		storyPointDao.delete(storyPoint);			
	}

	@Override
	public Story_Point getById(int storyPointId) {
		return storyPointDao.getById(storyPointId);
	}
	
	

}
