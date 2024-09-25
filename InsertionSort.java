public class InsertionSort {
    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];  
            int prev = i-1;
            //finding out the current pos to insert
            while (prev >= 0 && arr[prev] > curr) {         //To sort in descending order replace '>' to '<' between (arr[prev] and curr)
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        insertionSort(arr);
        printArr(arr);

        int arr2[] = {6, 3, 9, 5, 2, 8};
        insertionSort(arr2);
        printArr(arr2);
    }
}
