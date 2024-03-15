import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<City> cities = new LinkedList<>();
        cities.add(new City("Bishkek",2000000));
        cities.add(new City("Osh",500000));
        cities.add(new City("Jalal-Abad",200000));
        cities.add(new City("Batken",150000));
        cities.add(new City("Talas",250000));

        PopulationSort populationSort = new PopulationSort();
        cities.sort(populationSort);
        System.out.println(cities);

        cities.sort(City.nameSort);
        System.out.println(cities);

        NameSort nameSort = new NameSort();
        cities.sort(nameSort);
        System.out.println(cities);// sort in алфавитном порядке


        List<String> names = new LinkedList<>();
        names.add("Yzaat");
        names.add("Eldos");

        Collections.sort(names);
        System.out.println(names);
    }
}