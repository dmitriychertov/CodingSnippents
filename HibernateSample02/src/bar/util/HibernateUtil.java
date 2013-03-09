package bar.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import bar.entity.Actor;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	private static ServiceRegistry serviceRegistry;

	private static SessionFactory configureSessionFactory() {
		try {
			// File file = new File("hibernate.cfg.xml");
			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(Actor.class);
			serviceRegistry = new ServiceRegistryBuilder().applySettings(
					configuration.getProperties()).buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			return sessionFactory;
		} catch (Throwable e) {
			System.err.println("Initial SessionFactory creation failed." + e);
			throw new ExceptionInInitializerError(e);
		}

	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			sessionFactory = configureSessionFactory();
		}
		return sessionFactory;
	}

}
