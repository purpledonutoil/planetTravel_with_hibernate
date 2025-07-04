package client;

public class ClientService {
    private ClientDao clientDao;

    public ClientService(ClientDao dao) {
        clientDao = dao;
    }

    public void saveClient(Client client) {
        validateClient(client);
        clientDao.save(client);
    }

    public Client findClientById(Long id) {
        return clientDao.findById(id);
    }

    public void updateClient(Client client) {
        validateClient(client);
        clientDao.update(client);
    }

    public void deleteClient(Client client) {
        validateClient(client);
        clientDao.delete(client);
    }

    private void validateClient(Client client) {
        if (client == null) {
            throw new IllegalArgumentException();
        }
        if (client.getName() == null || client.getName().isBlank() || client.getName().length()>200) {
            throw new IllegalArgumentException();
        }
    }
}