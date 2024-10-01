public class QueueUsingLinkedList {

    static class Node {
    
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        //add
        public static void add(int data){           //T.C - O(1)
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //remove
        public static int remove() {            //T.C - O(1)
            if (isEmpty()) {
                System.out.println("Empty queue");
                return Integer.MIN_VALUE;
            }
            int value = head.data;
            //single element
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return value;
        }

        //peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return Integer.MIN_VALUE;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
