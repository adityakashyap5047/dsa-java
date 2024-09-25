import java.util.*;

public class JavaContinueLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number:");
            int number = sc.nextInt();
            if(number % 10 == 0){
                System.out.println("I am skiping the loop");
                continue;
            }
            System.out.println(number);
        }
    }
}
