import java.util.Stack;

public class StackNextGreater {

    public static void nextGreater(int arr[], int nextGreaterArr[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length-1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreaterArr[i] = -1;
            } else {
                nextGreaterArr[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int nextGreaterArr[] = new int[arr.length];
        nextGreater(arr, nextGreaterArr);
        for (int i = 0; i < nextGreaterArr.length; i++) {
            System.out.print(nextGreaterArr[i] + " ");
        }
    }
}
