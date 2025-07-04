package ticket;

import java.time.OffsetDateTime;

public class TicketService {
    private TicketDao ticketDao;

    public TicketService(TicketDao dao) {
        ticketDao = dao;
    }

    public void saveTicket(Ticket ticket) {
        validateTicket(ticket);
        ticketDao.save(ticket);
    }

    public Ticket findTicketById(String id) {
        return ticketDao.findById(id);
    }

    public Ticket findTicketById(OffsetDateTime time) {
        return ticketDao.findByTime(time);
    }

    public void updateTicket(Ticket ticket) {
        validateTicket(ticket);
        ticketDao.update(ticket);
    }

    public void deleteTicket(Ticket ticket) {
        validateTicket(ticket);
        ticketDao.delete(ticket);
    }

    private void validateTicket(Ticket ticket) {
        if (ticket == null) {
            throw new IllegalArgumentException();
        }
        if (ticket.getClient() == null || ticket.getFromPlanet() == null ||
                ticket.getToPlanet() == null) {
            throw new IllegalArgumentException();
        }
    }
}
