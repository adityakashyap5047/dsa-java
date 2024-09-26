public class LinkedListIntro {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {        // T.C - O(1)

        // step1 = create new node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step2 - newNode = head
        newNode.next = head; // link

        // step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data) {             // T.C - O(1)

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void printLinkedList(){             // T.C - O(n)
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx-1) {
            temp = temp.next;
            i++;
        }

        // i = idx-1 i.e. temp = prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        LinkedListIntro ll = new LinkedListIntro();
        ll.printLinkedList();
        ll.addFirst(1);
        ll.addFirst(4);
        ll.printLinkedList();
        ll.addLast(3);
        ll.addLast(12);
        ll.printLinkedList();
        ll.add(2, 10);
        ll.add(4, 40);
        ll.printLinkedList();
    }
}
