package DSTAProject.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import DSTAProject.dao.StoryPointDao;
import DSTAProject.model.Story_Point;


public class StoryPointDaoImpl implements StoryPointDao {

	private SessionFactory sessionFactory;
	Session session;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void insert(Story_Point storyPoint) {
		System.out.println("insert start");
		session = sessionFactory.openSession();

		session.save(storyPoint);

		session.close();
	}

	@Transactional
	public void update(Story_Point storyPoint) {
		System.out.println("update start");
		System.out.println("start session");
		session = sessionFactory.openSession();

		session.update(storyPoint);
		session.flush();
		session.clear();
		session.close();
		
	}

	@Transactional
	public void delete(Story_Point storyPoint) {
		System.out.println("delete start");
		session = sessionFactory.openSession();

		session.delete(storyPoint);
		session.flush();
		session.clear();

		session.close();

	}

	@Transactional
	public Story_Point getById(int storyPointId) {
		session = sessionFactory.openSession();

		String hql = "FROM Story_Point Tab WHERE Tab.idStoryPoint = :storyPointId";

		Query query = session.createQuery(hql);

		query.setParameter("idStoryPoint", storyPointId);

		@SuppressWarnings("unchecked")
		List<Story_Point> pointFound = (List<Story_Point>) query.list();

		if (pointFound.size() == 1) {
			session.close();
			return pointFound.get(0);
		}

		return null;
	}
	
}
