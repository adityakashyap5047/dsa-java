public class SelectionSort {
    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            //finding smallest
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {             //To sort in descending order replace '>' to '<'
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
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
        //int numbers[] = {1, 2, 3, 5, 4};
        //int marks[] = {94, 95, 96, 97, 98};

        selectionSort(arr);
        printArr(arr);

        // selectionSort(marks);
        // printArr(marks);

        // selectionSort(numbers);
        // printArr(numbers);
    }
}
