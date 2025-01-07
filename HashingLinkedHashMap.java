import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashingLinkedHashMap {
    
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);
        lhm.put("Nepal", 5);

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        System.out.println(lhm);
        System.out.println(hm);
    }
}
