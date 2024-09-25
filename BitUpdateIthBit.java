import java.util.Scanner;

public class BitUpdateIthBit {

    public static int setIthBit(int number, int i){
        int bitMask = (1<<i);
        return number | bitMask;
    }

    public static int clearIthBit(int number, int i){
        int bitMask = ~(1<<i);
        return number & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit){
        if (newBit == 0) {
            return clearIthBit(n, i);
        }
        else{
            return  setIthBit(n, i);
        }
    }

    public static int updateIthNoBit(int n, int i, int newBit){
        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return (n | bitMask);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        System.out.print("Enter the ith number : ");
        int i = sc.nextInt();
        System.out.print("Enter the newBit number : ");
        int newBit = sc.nextInt();

        System.out.println("After updating the "+i+"th bit of  number "+number+" with "+newBit+" it will be : "+updateIthBit(number, i, newBit));
        
        System.out.println("After updating the "+i+"th bit of  number "+number+" with "+newBit+" it will be : "+updateIthNoBit(number, i, newBit));
    }
}
