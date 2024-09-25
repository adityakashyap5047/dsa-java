import java.util.*;

public class MaxSubArraySumbyPrefix {
    public static void printSubArrays(int numbers[]){
        int sum;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        // Calculate prefix array
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<=(numbers.length-1); i++){
            for(int j=i; j<=(numbers.length-1);j++){
                sum = (i == 0 ? prefix[j] : (prefix[j] - prefix[i-1]));
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println("max Subarray Sum: "+max);
    }        
        //The time complexity of above code is O(n*n)

    
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        printSubArrays(numbers);
    }
}
 