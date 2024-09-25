import java.util.*;

public class JavaDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Iteration");
        int number = sc.nextInt();
        int counter = 1;
        do {
            System.out.println(counter+" Hello World");
            counter++;
        } while (counter <= number);
    }
}