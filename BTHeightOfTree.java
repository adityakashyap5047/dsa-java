public class BTHeightOfTree {
    
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

    static class BinaryTree{
        static int idx = -1;

        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
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

    }
    
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, 6, -1, 7, -1, -1, 3, -1, -1};
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);

        System.out.println(tree.height(root));

        /* 
         *  
         *              1
         *            /   \
         *           2     3
         *          / \   / \
         *         4   5 6   7
         * 
        */

        Node newRoot = new Node(1);
        newRoot.left = new Node(2);
        newRoot.right = new Node(3);
        newRoot.left.left = new Node(4);
        newRoot.left.right = new Node(5);
        newRoot.right.left = new Node(6);
        newRoot.right.right = new Node(7);

        System.out.println(tree.height(newRoot));
    }
}
