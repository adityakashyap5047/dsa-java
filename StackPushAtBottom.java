import java.util.Stack;

public class StackPushAtBottom {

    public static void pushAtBottom(Stack<Integer> s, int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(5);
        s.push(3);
        pushAtBottom(s, 6);
        pushAtBottom(s, 9);
        pushAtBottom(s, 2);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
