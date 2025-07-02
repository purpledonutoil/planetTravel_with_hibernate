package planet;

public class PlanetService {
    private PlanetDao planetDao;

    public PlanetService(PlanetDao dao) {
        planetDao = dao;
    }

    public void savePlanet(Planet planet) {
        planetDao.save(planet);
    }

    public Planet findPlanetById(String id) {
        return planetDao.findById(id);
    }

    public void updatePlanet(Planet planet) {
        planetDao.update(planet);
    }

    public void deletePlanet(Planet planet) {
        planetDao.delete(planet);
    }
}
