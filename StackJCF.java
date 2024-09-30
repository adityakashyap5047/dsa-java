import java.util.Stack;

public class StackJCF {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        s.push(8);
        s.push(4);
        s.push(6);
        s.push(12);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
