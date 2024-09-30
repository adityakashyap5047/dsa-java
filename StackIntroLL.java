public class StackIntroLL {

    public static class Node {
    
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
    
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
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
