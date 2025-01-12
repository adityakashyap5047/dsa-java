public class STCreation {
    
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

        buildST(numbers, 2 * stIdx + 1, st, mid);  // left subtree -> 2*i + 1
        buildST(numbers, 2 * stIdx + 2, mid+1, end);  // right subtree -> 2*i + 2

        tree[stIdx] = tree[2 * stIdx + 1] + tree[2 * stIdx + 2];

        return tree[stIdx];
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = numbers.length; 

        init(n);
        buildST(numbers, 0, 0, n-1);

        for (int i = 0; i < tree.length; i++) {
            System.out.print(tree[i]+" ");
        }
    }
}
