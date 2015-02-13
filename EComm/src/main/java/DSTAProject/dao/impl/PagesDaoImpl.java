package DSTAProject.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import DSTAProject.dao.PagesDao;
import DSTAProject.model.Pages;


public class PagesDaoImpl implements PagesDao {

	private SessionFactory sessionFactory;
	Session session;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void insert(Pages page) {
		System.out.println("insert start");
		session = sessionFactory.openSession();

		session.save(page);

		session.close();
	}

	@Transactional
	public void update(Pages page) {
		System.out.println("update start");
		System.out.println("start session");
		session = sessionFactory.openSession();

		session.update(page);
		session.flush();
		session.clear();
		session.close();
		
	}

	@Transactional
	public void delete(Pages page) {
		System.out.println("delete start");
		session = sessionFactory.openSession();

		session.delete(page);
		session.flush();
		session.clear();

		session.close();

	}

	@Transactional
	public Pages getById(int idPages) {
		session = sessionFactory.openSession();

		String hql = "FROM Pages Tab WHERE Tab.idPages = :idPages";

		Query query = session.createQuery(hql);

		query.setParameter("idPages", idPages);

		@SuppressWarnings("unchecked")
		List<Pages> pageFound = (List<Pages>) query.list();

		if (pageFound.size() == 1) {
			session.close();
			return pageFound.get(0);
		}

		return null;
	}
	
}
