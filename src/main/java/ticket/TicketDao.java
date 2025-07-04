package ticket;

import hibernateUtil.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.time.OffsetDateTime;

public class TicketDao {
    private SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    public void save(Ticket ticket) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tr = session.beginTransaction();
            session.persist(ticket);
            tr.commit();
        }
    }

    public Ticket findById(String id) {
        try (Session session = sessionFactory.openSession()) {
            return session.find(Ticket.class, id);
        }
    }

    public Ticket findByTime(OffsetDateTime time) {
        try (Session session = sessionFactory.openSession()) {
            return session.find(Ticket.class, time);
        }
    }

    public void update(Ticket ticket) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tr = session.beginTransaction();
            session.merge(ticket);
            tr.commit();
        }
    }

    public void delete(Ticket ticket) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tr = session.beginTransaction();
            session.remove(ticket);
            tr.commit();
        }
    }
}
