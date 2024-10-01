public class QueueArrayIntro {
    
    static class Queue {
    
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {          // T.C - O(1)
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public static int remove() {        // T.C - O(n)    
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }
            int front = arr[0];
            for (int i = 1; i <= rear; i++) {
                arr[i-1] = arr[i];
            }
            rear--;
            return front;
        }

        public static int peek() {      // T.C - O(1)
            if (isEmpty()) {
                return Integer.MIN_VALUE;
            }
            return arr[0];
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(2);
        q.add(8);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
