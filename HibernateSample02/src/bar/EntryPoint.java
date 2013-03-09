package bar;

import org.hibernate.Session;

import bar.entity.Actor;
import bar.util.HibernateUtil;

public class EntryPoint {

	public static void main(String[] args) {
		System.out.println("Hibernate");
		Actor actor = getActor(1);
		System.out.println(actor.getFirstName());
	}

	public static Actor getActor(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Actor actor = (Actor) session.get(Actor.class, id);
		session.getTransaction().commit();
		session.close();
		return actor;
	}

}
