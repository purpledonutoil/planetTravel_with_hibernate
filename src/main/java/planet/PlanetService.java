package planet;


public class PlanetService {
    private PlanetDao planetDao;

    public PlanetService(PlanetDao dao) {
        planetDao = dao;
    }

    public void savePlanet(Planet planet) {
        validatePlanet(planet);
        planetDao.save(planet);
    }

    public Planet findPlanetById(String id) {
        return planetDao.findById(id);
    }

    public void updatePlanet(Planet planet) {
        validatePlanet(planet);
        planetDao.update(planet);
    }

    public void deletePlanet(Planet planet) {
        validatePlanet(planet);
        planetDao.delete(planet);
    }

    private void validatePlanet(Planet planet) {
        if (planet == null) {
            throw new IllegalArgumentException();
        }
        if (planet.getName() == null || planet.getName().isBlank() || planet.getName().length() > 500) {
            throw new IllegalArgumentException();
        }
        if (planet.getId() == null || planet.getId().isBlank() || planet.getId().length() > 3) {
            throw new IllegalArgumentException();
        }
    }
}
