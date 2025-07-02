package client;

import hibernateUtil.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClientDao {
    private SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    public void save(Client client) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tr = session.beginTransaction();
            session.persist(client);
            tr.commit();
        }
    }

    public Client findById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.find(Client.class, id);
        }
    }

    public void update(Client client) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tr = session.beginTransaction();
            session.merge(client);
            tr.commit();
        }
    }

    public void delete(Client client) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tr = session.beginTransaction();
            session.remove(client);
            tr.commit();
        }
    }
}

