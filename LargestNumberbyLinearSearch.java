import java.util.*;

public class LargestNumberbyLinearSearch {


    public static int max(int numbers[]){
        int largest = numbers[0];
        // int largest = Integer.MIN_VALUE;  // it means minus infinity
        for(int i=0; i<(numbers.length-1); i++){
            if(largest < numbers[i+1]){
                largest = numbers[i+1];
            }
        }
        return largest;
    }

    public static int min(int numbers[]){
        int smallest = Integer.MAX_VALUE;  // it means infinity
        for(int i=0; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }


    public static void main(String[] args) {
        int numbers[] = {20, 3, 10, 5, 1086, 236, 34, 45, 78};
        int largest = max(numbers);
        System.out.println("The largest number in the given Array is "+largest);
        int smallest = min(numbers);
        System.out.println("The largest number in the given Array is "+smallest);
    }
}
