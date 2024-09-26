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
    public static int size;

    public void addFirst(int data) {        // T.C - O(1)

        // step1 = create new node
        Node newNode = new Node(data);
        size++;

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
        size++;

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
        size++;
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

    public int removeFirst() {
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int removeLast() {
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        } 
        //prev: i = size-2
        Node temp = head;
        for(int i = 0; i < size - 2; i ++){
            temp = temp.next;
        }
        int value = temp.next.data;     //tail.data
        temp.next = null;
        tail = temp;
        size--;
        return value;
    }

    public int findKey(int key){        // T.C - O(n)
        Node temp = head;
        /* 
            for(int i = 0; i < size; i++){
                if(temp.data == key){
                    return i;
                }
                temp = temp.next;
            }
        */
        //other way
        int j = 0;
        while (temp != null) {
            if(temp.data == key){
                return j;
            }
            temp = temp.next;
            j++;
        }
        return -1;
    }

    public int helper(Node head, int key){      //T.C - O(n)  S.C - O(n)
        if (head == null) {
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }

    public int findKeyByRecursion(int key){
        return helper(head, key);
    }

    public void reverseLinkedList() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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
        System.out.println(ll.size);
        System.out.println(ll.removeFirst());
        ll.printLinkedList();
        System.out.println(ll.removeLast());
        ll.printLinkedList();
        System.out.println(ll.size);
        System.out.println("The key is found at index: "+ll.findKey(10));
        System.out.println("The key is found at index: "+ll.findKeyByRecursion(10));
        ll.reverseLinkedList();
        ll.printLinkedList();
    }
}
