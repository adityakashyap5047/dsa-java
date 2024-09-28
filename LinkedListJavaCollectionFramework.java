import java.util.LinkedList;

public class LinkedListJavaCollectionFramework {
    
    public static void main(String[] args) {
        //create
        LinkedList<Integer> ll = new LinkedList<>();

        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        
        //remove
        ll.removeFirst();
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
    }
}
