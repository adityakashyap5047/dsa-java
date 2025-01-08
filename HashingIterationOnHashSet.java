import java.util.HashSet;
import java.util.Iterator;

public class HashingIterationOnHashSet {
    
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Using advance for loop
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
