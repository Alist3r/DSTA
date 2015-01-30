package DSTAProject.dao;


import DSTAProject.model.Story_Point;

public interface StoryPointDao {

	public void insert(Story_Point storyPoint);
	public void update(Story_Point storyPoint);
	public void delete(Story_Point storyPoint);
	public Story_Point getById(int storyPointId);
	
}
