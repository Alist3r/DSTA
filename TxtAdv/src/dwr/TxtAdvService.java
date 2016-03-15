package dwr;

import dao.UtenteDao;



public class TxtAdvService {

	public void setNomeUtente(String nome, String email) {
			
			UtenteDao utenteDao = new UtenteDao();
			utenteDao.setNomeUtente(nome, email);	
				
	}
}
