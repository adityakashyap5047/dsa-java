import java.util.*;

public class JavaBasicTypeConversion{
    public static void main(String args[]){
        int a =  25;
        long b = a;

        System.out.println(b);

        Scanner sc = new Scanner(System.in);

        /*
        long c = 30;
        int d = c;
        System.out.println(d);

        int number = sc.nextFloat();
        System.out.println(number);
        */

        float price = sc.nextInt();
        System.out.println(price);

        char ch = 'a';
        int num = ch;
        System.out.println(num);
    }
}