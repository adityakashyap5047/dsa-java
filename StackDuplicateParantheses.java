import java.util.Stack;

public class StackDuplicateParantheses {
    
    public static boolean isDuplicateParantheses(String expression){
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (ch == ')') {
                if (s.isEmpty()) {
                    return false;
                }
                int count = 0;
                while (!(s.peek() == '(')) {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                }
                s.pop();
            } else {
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String expression = "((a+(b))+(c+d))";
        System.out.println(isDuplicateParantheses(expression));
    }
}
