package DSTAProject.bo;

import DSTAProject.model.Characters;

public interface CharactersBo {
	
	public void save(Characters controller);
	public void update(Characters controller);
	public void delete(Characters controller);
	public Characters getByEmail(String email);
}
