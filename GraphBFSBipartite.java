import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFSBipartite {
    
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
    }

    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int col[] = new int[graph.length];
        for (int i = 0; i < col.length; i++) {
            col[i] = -1; // no color
        }

        for (int i = 0; i < graph.length; i++) {
            if(col[i] == -1){
                return isBipartiteUtil(graph, i, col);
            }
        }
        return true;
    }

    public static boolean isBipartiteUtil(ArrayList<Edge>[] graph, int currVertex, int[] col){
        Queue<Integer> q = new LinkedList<>();
        q.add(currVertex);
        col[currVertex] = 0; // yellow color
        while (!q.isEmpty()) {
            int curr = q.remove();
            for (int j = 0; j < graph[curr].size(); j++) {
                Edge e = graph[curr].get(j);
                if (col[e.dest] == -1) {
                    int nexxtCol = col[curr] == 0 ? 1 : 0;
                    col[e.dest] = nexxtCol;
                    q.add(e.dest);
                }
                else if (col[e.dest] == col[curr]) {
                    return false;   // not bipartite
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /*
         * 
         *   0 ------ 2
         *  /        /
         * 1        4
         *  \      /
         *   \    /
         *    \  /
         *     3
         * 
         *  ( FALSE )
        */

        int V = 5;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);
        System.out.println(isBipartite(graph));
        
    }
}
