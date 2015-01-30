package DSTAProject.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import DSTAProject.dao.CharactersDao;
import DSTAProject.model.Characters;


public class CharactersDaoImpl implements CharactersDao {

	private SessionFactory sessionFactory;
	Session session;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void insert(Characters character) {
		System.out.println("insert start");
		session = sessionFactory.openSession();

		session.save(character);

		session.close();
		System.out.println("insert End");
	}

	@Transactional
	public void update(Characters character) {
		System.out.println("update start");
		System.out.println("start session");
		session = sessionFactory.openSession();

		session.update(character);
		session.flush();
		session.clear();
		session.close();

		System.out.println("close session");

		System.out.println("update End");
	}

	@Transactional
	public void delete(Characters character) {
		System.out.println("delete start");
		session = sessionFactory.openSession();

		session.delete(character);
		session.flush();
		session.clear();

		session.close();
		System.out.println("delete End");

	}


	@Override
	public Characters getByEmail(String email) {
		
		session = sessionFactory.openSession();
		
		String hql = "SELECT TabChar FROM Characters TabChar, Users TabUser "
		           + "WHERE TabUser.email= :email AND "
		       	   + "      TabChar.idUsers = TabUser.idUsers ";

		Query query = session.createQuery(hql);
		
		query.setParameter("email", email);

		@SuppressWarnings("unchecked")
		List<Characters> characterFound = (List<Characters>) query.list();

		session.close();
		
		if (characterFound != null && characterFound.size() == 1) {
	
			return characterFound.get(0);
		}
		
		return null;
	}
	
}
