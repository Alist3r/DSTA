package DSTAProject.dao;


import DSTAProject.model.Characters;

public interface CharactersDao {

	public void insert(Characters character);
	public void update(Characters character);
	public void delete(Characters character);
	public Characters getByEmail(String email);
	
}
