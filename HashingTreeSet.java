import java.util.TreeSet;

public class HashingTreeSet {
    
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(4);
        numbers.add(1);
        numbers.add(6);
        numbers.add(3);
        numbers.add(2);
        numbers.add(9);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
