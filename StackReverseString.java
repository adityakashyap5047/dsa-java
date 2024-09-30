import java.util.Stack;

public class StackReverseString {

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(reverseString("abc"));        

    }
}
