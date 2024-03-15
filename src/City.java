import java.util.Comparator;

public class City implements Comparable<City>{
    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    public static Comparator<City> populationSort = Comparator.comparingInt(City::getPopulation);
    // reference - методуна ссылка дегенди тушундурот
   public static Comparator<City> nameSort = Comparator.comparing(City::getName).reversed();  // анонимный класс
//        @Override
//        public int compare(City o1, City o2) {
//            return o1.getPopulation() - o2.getPopulation();
//        }
 //
    @Override
    public int compareTo(City o) {
        return 0;
    }
    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}
