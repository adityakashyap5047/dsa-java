import java.util.*;

public class JavaBasicArray {
    public static void main(String[] args) {

        //Creating an array

        int numbers[] = {1, 2, 3};
        String fruits[] = {"apple", "mango", "orange"};

        int marks[] = new int[50];

        //input in array

        Scanner sc = new Scanner(System.in);
        
        //int phy;
        //phy = sc.nextInt();

        System.out.println("length of array = "+ marks.length);
        
        System.out.println("Enter the marks of phy:");
        marks[0] = sc.nextInt();
        System.out.println("Enter the marks of chem:");
        marks[1] = sc.nextInt();
        System.out.println("Enter the marks of math:");
        marks[2] = sc.nextInt();

        //output in array

        System.out.println("phy : "+ marks[0]);
        System.out.println("chem : "+ marks[1]);
        System.out.println("math : "+ marks[2]);

        //update in array

        System.out.println("Enter correct marks of math:");
        marks[2] = sc.nextInt();

        System.out.println("phy : "+ marks[0]);
        System.out.println("chem : "+ marks[1]);
        System.out.println("math : "+ marks[2]);

    }
}
