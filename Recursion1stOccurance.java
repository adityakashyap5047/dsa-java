public class Recursion1stOccurance {
    public static int firstOcc(int arr[], int key, int i){ //Time complexity = O(n)
                                                           //Space complexity = O(n)
        if (arr[i] == key) {
            return i;
        }
        else if(i == arr.length-1){
            return -1;
        }
        return firstOcc(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {6, 78, 67, 45, 1, 2, 3, 4, 5, 6};

        System.out.println(firstOcc(arr, 1, 0));
        System.out.println(firstOcc(arr, 2, 0));
        System.out.println(firstOcc(arr, 3, 0));
        System.out.println(firstOcc(arr, 5, 0));
        System.out.println(firstOcc(arr, 6, 0));
        System.out.println(firstOcc(arr, 7, 0));
        System.out.println(firstOcc(arr, 19, 0));

    }
}
