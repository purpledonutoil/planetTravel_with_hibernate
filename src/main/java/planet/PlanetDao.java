package planet;

import hibernateUtil.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PlanetDao {
    private SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    public void save(Planet planet) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tr = session.beginTransaction();
            session.persist(planet);
            tr.commit();
        }
    }

    public Planet findById(String id) {
        try (Session session = sessionFactory.openSession()) {
            return session.find(Planet.class, id);
        }
    }

    public void update(Planet planet) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tr = session.beginTransaction();
            session.merge(planet);
            tr.commit();
        }
    }

    public void delete(Planet planet) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tr = session.beginTransaction();
            session.remove(planet);
            tr.commit();
        }
    }
}


