public class BTCalculateDiameter{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int ht = Math.max(lh, rh) + 1;
        return ht;
    }

    public static int diameter(Node root){
        if (root == null) {
            return 0;
        }

        int ldiam = diameter(root.left);
        int rdiam = diameter(root.right);
        int lh = height(root.left);
        int rh = height(root.right);

        int selfDiam = lh + rh + 1;

        return Math.max(Math.max(ldiam, rdiam), selfDiam);
    }

    public static void main(String[] args) {
        /* 
         *  
         *              1
         *            /   \
         *           2     3
         *          / \   / \
         *         4   5 6   7
         * 
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameter(root));
    }
}