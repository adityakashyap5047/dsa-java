import java.util.*;

public class SubArrays {
    public static void printSubArrays(int numbers[]){
        int totalsubArrays = 0;
        int sum;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<=(numbers.length-1); i++){
            for(int j=i; j<=(numbers.length-1);j++){
                sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k]+" "); 
                    sum += numbers[k];  
                }
                totalsubArrays++;
                System.out.println(" sum :- ("+sum+")");
                if (sum < min) {
                    min = sum;
                }
                if (sum > max) {
                    max = sum;
                }
            }
            System.out.println();
        }
        System.out.println("The total number of pair is: "+totalsubArrays);
        System.out.println("min Subarray Sum: "+min);
        System.out.println("max Subarray Sum: "+max);
    }        
        //The time complexity of above code is O(n*n*n)

    
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubArrays(numbers);
    }
}
