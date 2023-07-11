 import java.util.*;

public class undirectedTree {
   


    private int vertexCount;
    private static LinkedList<Integer> adj[];

    undirectedTree(int vertexCount) {
        this.vertexCount = vertexCount;
        this.adj = new LinkedList[vertexCount];
        for (int i = 0; i < vertexCount; ++i) {
            adj[i] = new LinkedList<Integer>();    
        }
    }

    public void addEdge(int v, int w) {
        if (!isValidIndex(v) || !isValidIndex(w)) {
            return;
        }
        adj[v].add(w);
        adj[w].add(v);
    }

    private boolean isValidIndex(int i) {
        // Write code here
         return i >= 0 && i < vertexCount;
    }

    private boolean isCyclic(int v, boolean visited[], int parent) {
        // Write code here
         visited[v] = true;

        for (int neighbor : adj[v]) {
            if (!visited[neighbor]) {
                if (isCyclic(neighbor, visited, v))
                    return true;
            } else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }

    public boolean isTree() {
        // Write Code here
          boolean[] visited = new boolean[vertexCount];

        // Check for cycle
        if (isCyclic(0, visited, -1))
            return false;

        // Check for connectivity
        for (int i = 0; i < vertexCount; i++) {
            if (!visited[i])
                return false;
        }

        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Get the number of nodes from the input.
        int noOfNodes =  sc.nextInt();
         // Get the number of edges from the input.
        int noOfEdges = sc.nextInt();

        undirectedTree graph = new undirectedTree(noOfNodes);
        // Adding edges to the graph
        for (int i = 0; i <noOfEdges; ++i) {
            graph.addEdge(sc.nextInt(),sc.nextInt());
        }
        if (graph.isTree()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

