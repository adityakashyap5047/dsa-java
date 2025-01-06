public class BSTMirrorNodes {
    
    static class Node {
    
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static void inOrder(Node root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static Node mirror(Node root){
        if (root == null) {
            return null;
        }

        Node leftMirror = mirror(root.left);
        Node rightMirror = mirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    public static void main(String[] args) {
        /*
         *
         *      8
         *     / \
         *    5  10
         *   / \   \ 
         *  3   6   11
         * 
        */

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        inOrder(root);
        System.out.println();

        /*
         *
         *      8
         *     / \
         *    10  5
         *   /   / \ 
         *  11  6   3
         *  MIRROR BST
         * 
        */
        
        mirror(root);
        inOrder(root);
    }
}
