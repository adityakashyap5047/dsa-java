public class STCreation {
    
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

        buildST(numbers, 2 * STIdx + 1, st, mid);  // left subtree -> 2*i + 1
        buildST(numbers, 2 * STIdx + 2, mid+1, end);  // right subtree -> 2*i + 2

        tree[STIdx] = tree[2 * STIdx + 1] + tree[2 * STIdx + 2];

        return tree[STIdx];
    }

    public static int getSumUtil(int STIdx, int si, int sj, int qi, int qj){
        if (qj <= si || qi >= sj) {  // non overlapping
            return 0;
        } else if (si >= qi && sj <= qj) {  //complete overlap
            return tree[STIdx];
        } else {
            int mid = (si + sj)/2;
            int leftSubtree = getSumUtil(2 * STIdx + 1, si, mid, qi, qj);
            int rightSubtree = getSumUtil(2 * STIdx + 2, mid+1, sj, qi, qj);

            return leftSubtree + rightSubtree;
        }
    }

    public static int getSum(int arr[], int qi, int qj){
        int n = arr.length;
        return getSumUtil(0, 0, n-1, qi, qj); // si = 0 && sj = n-1 because the root stores the sum of subarray with the length of 0 to n-1
    }

    public static void updateUtil(int STIdx, int si, int sj, int idx, int diff){
        if (idx > sj || idx < si) {
            return;
        }

        tree[STIdx] += diff;
        if (si != sj) {     //non-leaf
            int mid = (si + sj)/2;
            updateUtil(2 * STIdx + 1, si, mid, idx, diff); //left
            updateUtil(2 * STIdx + 2, mid+1, sj, idx, diff); //right
        }
    }

    public static void update(int arr[], int idx, int newVal){
        int n = arr.length;
        int diff = newVal - arr[idx];
        arr[idx] = newVal;

        updateUtil(0, 0, n-1, idx, diff);
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = numbers.length; 

        init(n);
        buildST(numbers, 0, 0, n-1);

        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i]+" ");
        }
        System.out.println();

        System.out.println(getSum(numbers, 2, 5));

        update(numbers, 2, 2);
        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i]+" ");
        }
        System.out.println();
    }
}
