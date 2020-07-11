package Backtracking;

public class HamiltonianCycle {
    private int numOfVertices;
    public int[][] adjacencyMatrix;
    public int[] hamiltonianPath;

    public HamiltonianCycle(int[][] adjacencyMatrix){

    }

    public static void main(String[] args) {
        int[][] adjacencyMatrix = {{0,1,1,1,0,0},
                                   {1,0,0,0,1,0},
                                   {1,0,0,1,0,1},
                                   {1,0,1,0,1,1},
                                   {0,1,0,1,0,1},
                                   {0,0,1,1,1,0}};
    }
}
