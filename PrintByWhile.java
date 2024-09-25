import java.util.*;

public class PrintByWhile {
    public static void main(String[] args) {
        int count = 1;


        while (count <= 100) {
            System.out.println(count+" Hello World");
            count += 1;
        }


        while (count <= 10) {
            System.out.print(count+" ");
            count += 1;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of last number:");
        int number = sc.nextInt();

        while (count <= number) {
            System.out.print(count+" ");
            count += 1;
        }
    }
}
