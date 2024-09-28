public class LinkedListDoubly {
    
    public class Node {
    
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //addFirst
    public void addFirst(int data){

        Node newNode = new Node(data);

        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode; 
    }


    public static void main(String[] args) {
        
        LinkedListDoubly dll = new LinkedListDoubly();

    }
}
