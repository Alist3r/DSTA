package DSTAProject.bo.impl;

import DSTAProject.bo.CharactersBo;
import DSTAProject.dao.CharactersDao;
import DSTAProject.model.Characters;

public class CharactersBoImpl implements CharactersBo{
	
	private CharactersDao charactersDao;
	

	public void setCharactersDao(CharactersDao charactersDao) {
		this.charactersDao = charactersDao;
	}

	public void save(Characters character){
		charactersDao.insert(character);
	}
	
	public void update(Characters character){
		charactersDao.update(character);
	}
		
	public void delete(Characters character) {
		charactersDao.delete(character);
	}

	public Characters getByEmail(String email) {
		return charactersDao.getByEmail(email);
	}

}
