import java.util.*;

public class Strings {
    public static void printLetters(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str1 = "abcd";
        String str2 = new String("xyz");

        //Strings are IMMUTABLE


        //input - output in String
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String fname = sc.next();
        System.out.println("Your Name is :- "+fname);
        System.out.print("Enter your Full Name : ");
        sc.nextLine();
        String fullName = sc.nextLine();

        System.out.println("Your Full Name is :- "+fullName);

        //Length of String
        System.out.println("The length of Your Full Name is : "+fullName.length());

        //concatenation
        String firstName = "Aditya";
        String lastName = "Kumar";
        String name = firstName +" "+ lastName; 
        System.out.println(name);    

        //Accessing the character of string
        System.out.println(name.charAt(5));

        //printing all characters of String
        printLetters(name);
    }
}
