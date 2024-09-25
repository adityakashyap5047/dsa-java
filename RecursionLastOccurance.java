public class RecursionLastOccurance {
    public static int lastOcc(int arr[], int key, int i){ //Time complexity = O(n)
        //Space complexity = O(n)
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOcc(arr, key, i+1); 
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 3, 5, 6, 7, 5};
        System.out.println(lastOcc(arr, 1, 0));
        System.out.println(lastOcc(arr, 3, 0));
        System.out.println(lastOcc(arr, 5, 0));
        System.out.println(lastOcc(arr, 6, 0));
        System.out.println(lastOcc(arr, 7, 0));
    }
}
