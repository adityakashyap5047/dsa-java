public class BSTValidate {
    
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

    public static boolean isValidBST(Node root, Node min, Node max){
        if (root == null) {
            return true;
        }

        if (min != null && root.data <= min.data) {
            return false;
        }

        if (max != null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        Node root = null;

        for(int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }
        
        if (isValidBST(root, null, null)) {
            System.out.println("The given data forms a valid BST");
        } else {
            System.out.println("The given data does not form a valid BST");
        }
    }
}
