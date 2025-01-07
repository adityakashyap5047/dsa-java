import java.util.ArrayList;

public class BSTMerge2BSTs {
    
    static class Node {
    
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> inOrder1){
        if (root == null) {
            return;
        }
        getInorder(root.left, inOrder1);
        inOrder1.add(root.data);
        getInorder(root.right, inOrder1);
    }

    public static void mergeSortedList(ArrayList<Integer> list1, ArrayList<Integer> list2, ArrayList<Integer> list){
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                list.add(list1.get(i));
                i++;
            } else {
                list.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            list.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            list.add(list2.get(j));
            j++;
        }
    }

    public static Node createBST(ArrayList<Integer> inOrder, int st, int end){

        if (st > end) {
            return null;
        }

        int mid = (st + end)/2;

        Node root = new Node(inOrder.get(mid));

        root.left = createBST(inOrder, st, mid-1);
        root.right = createBST(inOrder, mid+1, end);

        return root;
    }

    public static Node mergeBSTs(Node root1, Node root2){
        ArrayList<Integer> inOrder1 = new ArrayList<>();
        ArrayList<Integer> inOrder2 = new ArrayList<>();
        ArrayList<Integer> sortedInOrder = new ArrayList<>();

        //Finding inOrde of BST1
        getInorder(root1, inOrder1);

        //Finding inOrde of BST1
        getInorder(root2, inOrder2);

        //Merge inOrder of two BSTS
        mergeSortedList(inOrder1, inOrder2, sortedInOrder);

        //Form the BST from the inOrder
        return createBST(sortedInOrder, 0, sortedInOrder.size() - 1);
    }

    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        /*
         * 
         *                   2
         *                /    \
         *                1     4
         * 
         *               ( BST 1 )
         * 
        */

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        /*
         * 
         *                   9
         *                /    \
         *                3     12
         * 
         *               ( BST 2 )
         * 
        */

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        /*
         * 
         *                   3
         *                /    \
         *                1     9
         *                 \   / \
         *                  2  4  12
         * 
         *               ( FINAL BST )
         * 
        */

        Node root = mergeBSTs(root1, root2);
        preOrder(root);

    }
}
