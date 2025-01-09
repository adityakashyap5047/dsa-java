public class GraphsFloodFillAlgorithm {

    public static void helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int orgClr){
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != orgClr) {
            return;
        }

        // Mark the current cell as visited
        vis[sr][sc] = true;

        // Change the color of the current cell
        image[sr][sc] = color;

        //left
        helper(image, sr, sc-1, color, vis, orgClr);

        //right
        helper(image, sr, sc+1, color, vis, orgClr);

        //up
        helper(image, sr-1, sc, color, vis, orgClr);

        //down
        helper(image, sr+1, sc, color, vis, orgClr);
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color){
        boolean vis[][] = new boolean[image.length][image[0].length];

        helper(image, sr, sc, color, vis, image[sr][sc]);

        return image;
    }
    
    public static void main(String[] args) {
        int image[][] = {{1, 1, 1},
                        {1, 1, 0},
                        {1, 0, 1}};
        int sr = 1, sc = 1, color = 2;

        floodFill(image, sr, sc, color);

        int[][] result = floodFill(image, sr, sc, color);

        // Print the resulting image
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
