import java.util.*;;

public class CountingSort {

    public static int max(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void countingSort(int arr[]){
        int count[] = new int[max(arr)+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        countingSort(arr);
        printArr(arr);
    }
}
