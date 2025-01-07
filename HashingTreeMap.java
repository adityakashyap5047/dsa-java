import java.util.TreeMap;

public class HashingTreeMap {
    
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);
        tm.put("Nepal", 5);
        tm.put("Indonesia", 6);

        System.out.println(tm);
    }
}
