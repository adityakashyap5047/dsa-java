import java.util.*;

public class BinarySearch {

    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1;
        
        while (start <= end) {
            int mid = (start+end)/2;

            //comparision
            if (numbers[mid] == key) {
                return mid;
            }
            else if(numbers[mid] < key){ //right
                start = mid+1;
            }
            else{ //left
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        int idx = binarySearch(numbers, key);
        if(idx == -1){
            System.out.println("The number "+key+" is not found in the given Array");
        }
        else{
            System.out.println("The index of "+key+" in the given Array is "+idx);
        }

    }
}
