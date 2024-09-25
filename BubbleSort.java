public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int count = 0;
        for (int turn = 0; turn < arr.length-1; turn++) {
            int swaps = 0;
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){  //To sort in descending order replace '>' to '<'
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
                count++;
            }
            //System.out.println("count: "+count);
            if (swaps == 0) {
                return;
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
        int arr[] = {5, 4, 1, 3, 2};
        int numbers[] = {1, 2, 3, 5, 4};
        int marks[] = {94, 95, 96, 97, 98};

        bubbleSort(arr);
        printArr(arr);

        bubbleSort(marks);
        printArr(marks);

        bubbleSort(numbers);
        printArr(numbers);
    }
}
