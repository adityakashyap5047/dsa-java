public class STMaxElementQueries {
    
    static int tree[];

    public static void init(int n){
        tree = new int[4*n];
    }

    public static int buildST(int numbers[], int stIdx, int st, int end){
        if (st == end) {
            tree[stIdx] = numbers[st];
            return numbers[st];
        }

        int mid = (st + end)/2;

        int leftSubtree = buildST(numbers, 2 * stIdx + 1, st, mid); // left subtree -> 2*i + 1
        int rightSubtree = buildST(numbers, 2* stIdx + 2, mid+1, end); // right subtree -> 2*i + 2

        tree[stIdx] = Math.max(leftSubtree, rightSubtree);

        return tree[stIdx];
    }

    public static int getMaxUtil(int stIdx, int si, int sj, int qi, int qj){
        if (qj <= si || qi >= sj) {  // non overlapping
            return Integer.MIN_VALUE;
        } else if (si >= qi && sj <= qj) {  //complete overlap
            return tree[stIdx];
        } else {
            int mid = (si + sj)/2;
            int leftSubtree = getMaxUtil(2 * stIdx + 1, si, mid, qi, qj);
            int rightSubtree = getMaxUtil(2 * stIdx + 2, mid+1, sj, qi, qj);

            return Math.max(leftSubtree, rightSubtree);
        }
    }

    public static int getMax(int numbers[], int qi, int qj){
        int n = numbers.length;

        return getMaxUtil(0, 0, n-1, qi, qj);
    }

    public static void updateUtil(int stIdx, int si, int sj, int idx, int newVal){
        if (idx > sj || idx < si) {
            return;
        }

        if (si == sj) {
            tree[stIdx] = newVal;
        } else{ //non-leaf
            int mid = (si + sj)/2;
            updateUtil(2 * stIdx + 1, si, mid, idx, newVal); //left
            updateUtil(2 * stIdx + 2, mid+1, sj, idx, newVal); //right
            tree[stIdx] = Math.max(tree[2 * stIdx + 1], tree[2 * stIdx + 2]);
        }
    }

    public static void update(int numbers[], int idx, int newVal){
        int n = numbers.length;
        numbers[idx] = newVal;

        updateUtil(0, 0, n-1, idx, newVal);
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

        update(numbers, 4, 7);
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i]+" ");
        }
        System.out.println();
    }
}
