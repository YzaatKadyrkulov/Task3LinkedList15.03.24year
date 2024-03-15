import java.util.Comparator;

public class PopulationSort implements Comparator<City> {

    @Override
    public int compare(City city1, City city2) {
        return city1.getPopulation() - city2.getPopulation();
    }
}
