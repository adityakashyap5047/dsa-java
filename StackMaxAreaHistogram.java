import java.util.Stack;

public class StackMaxAreaHistogram {
    
    public static void nextSmallerRight(int heights[], int nextSmallerRightArr[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = heights.length-1; i >= 0; i--) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextSmallerRightArr[i] = heights.length;
            } else {
                nextSmallerRightArr[i] = s.peek();
            }
            s.push(i);
        }
    }

    public static void nextSmallerLeft(int heights[], int nextSmallerLeftArr[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < heights.length; i++) {
            while (!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextSmallerLeftArr[i] = -1;
            } else {
                nextSmallerLeftArr[i] = s.peek();
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int heights[] = { 2, 1, 5, 6, 2, 3 };

        int nextSmallerRightArr[] = new int[heights.length];
        int nextSmallerLeftArr[] = new int[heights.length];
        int area[] = new int[heights.length];

        nextSmallerRight(heights, nextSmallerRightArr);
        nextSmallerLeft(heights, nextSmallerLeftArr);

        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < nextSmallerRightArr.length; i++) {
            area[i] = heights[i] * (nextSmallerRightArr[i] - nextSmallerLeftArr[i] - 1);
            if (maxArea < area[i]) {
                maxArea = area[i];
            }
        }
        System.out.println(maxArea);
    }
}
