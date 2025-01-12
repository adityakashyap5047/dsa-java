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

    public static int getMaxUtil(int STIdx, int si, int sj, int qi, int qj){
        if (qj <= si || qi >= sj) {  // non overlapping
            return Integer.MIN_VALUE;
        } else if (si >= qi && sj <= qj) {  //complete overlap
            return tree[STIdx];
        } else {
            int mid = (si + sj)/2;
            int leftSubtree = getMaxUtil(2 * STIdx + 1, si, mid, qi, qj);
            int rightSubtree = getMaxUtil(2 * STIdx + 2, mid+1, sj, qi, qj);

            return Math.max(leftSubtree, rightSubtree);
        }
    }

    public static int getMax(int numbers[], int qi, int qj){
        int n = numbers.length;

        return getMaxUtil(0, 0, n-1, qi, qj);
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

        System.out.println(getMax(numbers, 0, 3));
    }
}
