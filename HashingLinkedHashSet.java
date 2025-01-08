import java.util.LinkedHashSet;

public class HashingLinkedHashSet {
    
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        //Using advance for loop
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
