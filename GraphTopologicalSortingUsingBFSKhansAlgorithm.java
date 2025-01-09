import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphTopologicalSortingUsingBFSKhansAlgorithm {
    
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void calcIndeg(ArrayList<Edge>[] graph, int[] indeg){
        for (int i = 0; i < graph.length; i++) {            // i -> vertex of graph
            for (int j = 0; j < graph[i].size(); j++) {     // j -> edge at vertex i
                Edge e = graph[i].get(j);
                indeg[e.dest]++;
            }
        }
    }

    public static void topologicalSort(ArrayList<Edge>[] graph){
        int indeg[] = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();

        calcIndeg(graph, indeg);

        for (int i = 0; i < indeg.length; i++) {
            if (indeg[i] == 0) {
                q.add(i);
            }
        }

        //bfs
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr+" ");

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                indeg[e.dest]--;
                if (indeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*
         * 
         *      5 -- * 0 *-- 4 
         *               
         *      |            |
         *      |            |      
         *      |            |    
         *      *            * 
         *      2 -- * 3 --* 1
         * 
        */

        int V = 6;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        topologicalSort(graph);
    }
}
