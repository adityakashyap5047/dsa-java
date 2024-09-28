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

    //addLast
    public void addLast(int data){

        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    //removeFirst
    public int removeFirst(){
        
        if(head == null){
            return Integer.MIN_VALUE;
        }

        int value = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return value;
    }

    //removeLast

    public int removeLast(){

        if(head == null){
            return Integer.MIN_VALUE;
        }

        int value = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return value;
    }

    //print 
    public void printDLL() {
        Node temp = head;
        //One method

        /*  for(int i = 0; i < size; i++){
        **      System.out.print(temp.data+"<->");
        **  }
        */

        //another method
        System.out.print("null<->");
        while (temp != null) {
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        
        LinkedListDoubly dll = new LinkedListDoubly();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.printDLL();
        System.out.println("The size of the Doubly LinkedList is: "+size);
        dll.addLast(8);
        dll.addLast(9);
        dll.printDLL();
        System.out.println("The size of the Doubly LinkedList is: "+size);
        System.out.println(dll.removeFirst());
        dll.printDLL();
        System.out.println("The size of the Doubly LinkedList is: "+size);
        System.out.println(dll.removeLast());
        dll.printDLL();
        System.out.println("The size of the Doubly LinkedList is: "+size);
    }
}
