package DSTAProject.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import DSTAProject.dao.UsersDao;
import DSTAProject.model.Users;


public class UsersDaoImpl implements UsersDao {

	private SessionFactory sessionFactory;
	Session session;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void insert(Users user) {
		System.out.println("insert start");
		session = sessionFactory.openSession();

		session.save(user);

		session.close();
		System.out.println("insert End");
	}

	@Transactional
	public void update(Users user) {
		System.out.println("update start");
		System.out.println("start session");
		session = sessionFactory.openSession();

		session.update(user);
		session.flush();
		session.clear();
		session.close();

		System.out.println("close session");

		System.out.println("update End");
	}

	@Transactional
	public void delete(Users user) {
		System.out.println("delete start");
		session = sessionFactory.openSession();

		session.delete(user);
		session.flush();
		session.clear();

		session.close();
		System.out.println("delete End");

	}

	@Transactional
	public Users checkLogin(String email, String psw) {

		session = sessionFactory.openSession();

		String hql = "FROM Users Tab WHERE Tab.email= :email AND Tab.psw= :psw";

		Query query = session.createQuery(hql);

		query.setParameter("email", email);
		query.setParameter("psw", psw);

		@SuppressWarnings("unchecked")
		List<Users> userFound = (List<Users>) query.list();

		if (userFound.size() == 1) {
			session.close();
			return userFound.get(0);
		}

		return null;
	}
	
}
