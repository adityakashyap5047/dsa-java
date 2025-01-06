public class BSTDeleteNode {
    

    static class Node {
    
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (val < root.data) {
            //left subtree
            root.left = insert(root.left, val);
        } else {
            //right subtree
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static Node delete(Node root, int key){
        if (root.data < key) {
            root.right = delete(root.right, key);
        }
        else if(root.data > key) {
            root.left = delete(root.left, key);
        }
        else {
            //case 1 -> leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            //case 2 -> single child
            if (root.left == null) {
                return root.right;
            } else if(root.right == null){
                return root.left;
            }

            //case3 -> both children
            Node IS = findInOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static Node findInOrderSuccessor(Node root){
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static void inOrder(Node root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();
        root = delete(root, 1);
        inOrder(root);
        System.out.println();
        root = delete(root, 11);
        inOrder(root);
        System.out.println();
        root = delete(root, 5);
        inOrder(root);
    }
}
