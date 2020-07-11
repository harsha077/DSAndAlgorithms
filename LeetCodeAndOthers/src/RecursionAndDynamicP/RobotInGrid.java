package RecursionAndDynamicP;

import java.util.ArrayList;

public class RobotInGrid {
    int[][] mat;
    boolean[][] visited;
    static ArrayList<Point> pointList;
    //static int X = 0, Y = 0;
    public RobotInGrid(){}

    /* public Robot(int[][] mat){
        this.mat = mat;
        this.visited = new int[mat.length][mat[0].length];
    }*/
    public void robot(int[][] mat){
        this.mat = mat;
        this.visited = new boolean[mat.length][mat[0].length];
        pointList = new ArrayList<>();
        //return robot(0,0);
        robot(0,0,false);
    }

    /** Finding desitination Only: Little example on how to navigate the matrix**/
    /*public boolean robot(int x, int y){
        boolean found = false;
        if(x > mat.length-1 || y > mat[0].length-1) return false;
        if(mat[x][y] == 1) return true;

        found = robot(x+1,y);
        if(found == true) return found;
        found = robot(x,y+1);
        return found;
    }*/

    /* Finding desitination Only: Solution If we are trying to reach bottom right most place from the Input, Assuming that is 0*/
   /* public boolean robot(int x, int y){
        boolean found = false;
        if(x > mat.length - 1 || y > mat[0].length - 1) return false;
        if(mat[x][y] == 1) return false;
        if(x == mat.length - 1 && y == mat[0].length - 1) {
            System.out.println(x + "," + y);
            return true;
        }

        found = robot(x+1, y);
        if(found == true) return found;
        found = robot(x,y+1);
        return found;

    }*/

   /*Finding desitination Only: find any BOTTOM Right MOST destination*/
   /*public void robot(int x, int y){
       if(x > mat.length - 1 || y > mat[0].length - 1) return;
       if(mat[x][y] == 1) return;

       this.X = x;
       this.Y = y;

       robot(x+1,y);
       robot(x,y+1);
   }*/

   /*Finding PATH: For BOTTOM RIGHT MOST Destination*/
    public boolean robot(int r, int c,boolean found){
        if(r > mat.length-1 || c > mat[0].length-1) return false;
        if(mat[r][c] == 1) return false;
        if(mat[r][c] == 0 && visited[r][c]==false){
            Point p = new Point(r,c);
            pointList.add(p);
            found = true;
        }
        visited[r][c] = true;
        boolean foundTemp = robot(r+1,c,found);
        if(foundTemp == true) {
            return foundTemp;
        }
        foundTemp = robot(r,c+1,found);

        return found;
    }

    public static void main(String[] args) {
        int[][] mat = {{0,0,1,0,0},
                       {1,0,0,0,0},
                       {0,1,0,0,0},
                       {0,0,0,0,0},
                       {0,0,0,0,1}};
        new RobotInGrid().robot(mat);
        for(Point p:pointList){
            System.out.println(p.r +","+p.c);
        }
    }
}

class Point{
    public int r;
    public int c;
    public Point(int r, int c){
        this.r = r;
        this.c = c;
    }
}
