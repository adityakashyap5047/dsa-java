import java.util.HashSet;

public class HashingCountDistinctNumbers {
    
    public static void main(String[] args) {
        int numbers[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            hs.add(numbers[i]);
        }

        System.out.println(hs.size());
    }
}
