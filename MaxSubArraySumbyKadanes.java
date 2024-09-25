import java.util.*;

public class MaxSubArraySumbyKadanes {

    public static int max(int numbers[]) {
        int largest = Integer.MIN_VALUE; // it means infinity
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void kadanes(int numbers[]){
        boolean isnegative = true;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                isnegative = false;
            }
        }

        if (isnegative) {
            int ms = max(numbers);
            System.out.println("our max subarray sum is: "+ms);
        }
        else{
            int ms = Integer.MIN_VALUE;
            int cs = 0;
            for (int i = 0; i < numbers.length; i++) {
                cs += numbers[i];
                if (cs < 0) {
                    cs = 0;
                }
                ms = Math.max(cs, ms);
            }
            System.out.println("our max subarray sum is: "+ms);
       }
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int negativenumbers[] = { -27, -30, -46, -18, -25, -19, -5, -38 };

        kadanes(numbers);
        kadanes(negativenumbers);
    }
}
