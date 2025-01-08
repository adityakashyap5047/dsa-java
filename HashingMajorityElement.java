import java.util.HashMap;
import java.util.Set;

public class HashingMajorityElement {
    
    public static void main(String[] args) {
        int nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // if (!hm.containsKey(nums[i])) {
            //     hm.put(nums[i], 1);
            // } else {
            //     hm.put(nums[i], hm.get(nums[i]) + 1);
            // }

            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        // Set<Integer> keys = hm.keySet();
        // for (Integer key : keys) {
        for (Integer key : hm.keySet()) {
            if (hm.get(key) > nums.length/3) {
                System.out.print(key+" ");
            }
        }
    }
}
