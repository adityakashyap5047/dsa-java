public class TilingProblem {
    public static int tilingWays(int n){
        if (n == 0 || n == 1) {
            return 1;
        }

        int verticalTile = tilingWays(n-1);
        int horizontalTile = tilingWays(n-2);

        return verticalTile + horizontalTile;
    }

    public static void main(String[] args) {
        System.out.println(tilingWays(3));
        System.out.println(tilingWays(4));
    }
}