package DSTAProject.bo;

import DSTAProject.model.Story_Point;

public interface StoryPointBo {

	public void save(Story_Point controller);
	public void update(Story_Point controller);
	public void delete(Story_Point controller);
	public Story_Point getById(int idStoryPoint);
		
}
