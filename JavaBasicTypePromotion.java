import java.util.*;

public class JavaBasicTypePromotion{
    public static void main(String args[]){
        char a = 'a';
        char b = 'b';

        System.out.print(b+": ");
        System.out.println((int)(b));
        System.out.print(a+": ");
        System.out.println((int)(a));
        System.out.println(b-a);

        char ch = (char)(b-a);
        System.out.println(ch);


        int num1 = 10;
        float num2 = 20.20f;
        long num3 = 100;
        double num4 = 25.25;
        double ans = num1 + num2 + num3 + num4;
        System.out.println(ans);

        byte bt1 = 5;
        byte bt2 = (byte)(bt1*2);
        System.out.println(bt2);

    }
}