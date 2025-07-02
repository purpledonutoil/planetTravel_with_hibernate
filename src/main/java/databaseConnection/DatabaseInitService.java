package databaseConnection;

import client.ClientDao;
import client.ClientService;

import java.sql.SQLException;

public class DatabaseInitService{

    public static void main(String[] args) throws SQLException {
        Database db = Database.getInstance();
        FlywayMigration flywayMigration = new FlywayMigration();
        flywayMigration.initDb(db.getConnURL());
        ClientDao dao = new ClientDao();
        ClientService ser = new ClientService(dao);
    }
}