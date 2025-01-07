import java.util.HashMap;

public class HashingHashMap{

    public static void main(String[] args) {
        //Create a HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        //insert                                -> O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        //Get                                  -> O(1)
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Bhutan"));

        //ContainsKey                                       -> O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Bhutan"));

        //Remove                                        -> O(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);
        System.out.println(hm.remove("Bhutan"));
        System.out.println(hm);

        //Size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

        //Clear all values
        hm.clear();
        System.out.println(hm);
        System.out.println(hm.isEmpty());
    }
}