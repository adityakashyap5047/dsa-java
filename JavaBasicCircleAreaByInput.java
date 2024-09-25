import java.util.*;

public class JavaBasicCircleAreaByInput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of circle:");
        double rad = sc.nextDouble();

        double area = 3.14*rad*rad;

        System.out.println("The area of circle having radius "+rad+" is "+area);
    }
}