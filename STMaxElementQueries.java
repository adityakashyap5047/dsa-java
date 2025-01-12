public class STMaxElementQueries {
    
    static int tree[];

    public static void init(int n){
        tree = new int[4*n];
    }

    public static int buildST(int numbers[], int STIdx, int st, int end){
        if (st == end) {
            tree[STIdx] = numbers[st];
            return numbers[st];
        }

        int mid = (st + end)/2;

        int leftSubtree = buildST(numbers, 2 * STIdx + 1, st, mid); // left subtree -> 2*i + 1
        int rightSubtree = buildST(numbers, 2* STIdx + 2, mid+1, end); // right subtree -> 2*i + 2

        tree[STIdx] = Math.max(leftSubtree, rightSubtree);

        return tree[STIdx];
    }

    public static void main(String[] args) {
        int numbers[] = {6, 8, -1, 2, 17, 1, 3, 2, 4};
        int n = numbers.length;

        init(n);

        buildST(numbers, 0, 0, n-1);

        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i]+" ");
        }
        System.out.println();
    }
}
