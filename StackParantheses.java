import java.util.Stack;

public class StackParantheses {

    public static boolean isValidParantheses(String parantheses) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < parantheses.length(); i++) {
            char ch = parantheses.charAt(i);
            switch (ch) {
                case '(':
                case '[':
                case '{':
                    s.push(ch);
                    break;
                case ')':
                    if (s.isEmpty() || s.peek() != '(') {
                        return false;
                    }
                    s.pop();
                    break;
                case ']':
                    if (s.isEmpty() || s.peek() != '[') {
                        return false;
                    }
                    s.pop();
                    break;
                case '}':
                    if (s.isEmpty() || s.peek() != '{') {
                        return false;
                    }
                    s.pop();
                    break;
                default:
                    break;
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String parantheses = "(({[]})([]))";
        System.out.println(isValidParantheses(parantheses)); // true
    }
}