import java.util.ArrayList;

public class StackIntro {
    
    static class Stack {
    
        static ArrayList<Integer> list = new ArrayList<>();
        
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(5);
        s.push(2);
        s.push(13);
        s.push(9);
        
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
