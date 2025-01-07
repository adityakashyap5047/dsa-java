import java.util.ArrayList;

public class BSTConvertToBalancedBST {
    
    static class Node {
    
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node balancedBST(ArrayList<Integer> sortedList, int st, int end){
        if (st > end) {
            return null;
        }
        int mid = (st + end)/2;
        
        Node root = new Node(sortedList.get(mid));

        root.left = balancedBST(sortedList, st, mid-1);
        root.right = balancedBST(sortedList, mid+1, end);

        return root;
    }

    public static void inOrder(Node root, ArrayList<Integer> sortedList){
        if (root == null) {
            return;
        }
        inOrder(root.left, sortedList);
        sortedList.add(root.data);
        inOrder(root.right, sortedList);
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
         *       8
         *     /   \
         *    6     10
         *   /        \ 
         *  5         11
         * /            \
         * 3             12
         * 
        */

        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        ArrayList<Integer> sortedList = new ArrayList<>();
        inOrder(root, sortedList);

        /*
         *
         *       8
         *     /   \
         *    5     11
         *   / \    / \ 
         *  3   6  10  12
         * (EXPECTED BST)
        */

        Node balancedRoot = balancedBST(sortedList, 0, sortedList.size()-1);
        preOrder(balancedRoot);
    }
}
