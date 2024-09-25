public class RecursionCheckArraySorted {
    public static boolean isSort(int arr[], int i){ //Time complexity O(n)
                                                    //Space complexity O(n)
        if (i == arr.length-1){
            return true;
        }
        else if(arr[i] < arr [i+1]){
            return isSort(arr, i+1);
        }
        return false;
    }
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 3, 6, 7, 8, 6};
        int arr2[] = {1, 2, 3, 4, 5};
        int arr3[] = {1, 2, 3, 4, 2};
        int arr4[] = {5, 2, 3, 4, 2};
        

        System.out.println(isSort(arr, 0));
        System.out.println(isSort(arr2, 0));
        System.out.println(isSort(arr3, 0));
        System.out.println(isSort(arr4, 0));
    }
}
