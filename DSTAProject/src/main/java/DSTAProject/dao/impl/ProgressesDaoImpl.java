package DSTAProject.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import DSTAProject.dao.ProgressesDao;
import DSTAProject.model.Progresses;


public class ProgressesDaoImpl implements ProgressesDao {

	private SessionFactory sessionFactory;
	Session session;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void insert(Progresses progress) {
		session = sessionFactory.openSession();

		session.save(progress);

		session.close();
	}

	@Transactional
	public void update(Progresses progress) {
		System.out.println("update start");
		System.out.println("start session");
		session = sessionFactory.openSession();

		session.update(progress);
		session.flush();
		session.clear();
		session.close();
		
	}

	@Transactional
	public void delete(Progresses progress) {
		System.out.println("delete start");
		session = sessionFactory.openSession();

		session.delete(progress);
		session.flush();
		session.clear();

		session.close();

	}

	@Transactional
	public Progresses getById(int idProgresses) {
		session = sessionFactory.openSession();

		String hql = "FROM Progresses Tab WHERE Tab.idProgresses = :idProgresses";

		Query query = session.createQuery(hql);

		query.setParameter("idProgresses", idProgresses);

		@SuppressWarnings("unchecked")
		List<Progresses> progressFound = (List<Progresses>) query.list();

		if (progressFound.size() == 1) {
			session.close();
			return progressFound.get(0);
		}

		return null;
	}

	@Override
	public Progresses getByUserId(int idUser) {
		session = sessionFactory.openSession();

		String hql = "FROM Progresses Tab WHERE Tab.idUsers = :idUser";

		Query query = session.createQuery(hql);

		query.setParameter("idUsers", idUser);

		@SuppressWarnings("unchecked")
		List<Progresses> progressFound = (List<Progresses>) query.list();

		if (progressFound.size() == 1) {
			session.close();
			return progressFound.get(0);
		}

		return null;
	}
	
}
