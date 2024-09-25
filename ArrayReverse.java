public class ArrayReverse {

    public static void reverseArray(int arr[]) {
        for (int i = 0; i < (arr.length / 2); i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void reverse(int arr[]) {
        int first = 0, last = arr.length-1;

        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 7, 9};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
