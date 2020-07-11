package Backtracking;

public class NQueens {
    int[][] chess;
    int rlen=0;
    int clen=0;

    /*public NQueens(int[][] chess){
        this.chess = chess;
        if(chess.length > 0){

            rlen = chess.length;
            clen = chess[0].length;
        }
    }*/

    public NQueens(int row, int col){
        this.chess = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                chess[i][j] = 0;
            }
        }
        this.rlen = row;
        this.clen = col;
    }

    public boolean nQueens(){
        return backtrack_queen(0);
    }

    public int[][] nQueenArray(){
        backtrack_queen(0);
        return chess;
    }

    public boolean backtrack_queen(int col){
        if(col == clen) return true;

        for(int r=0;r<rlen;r++){
            if(canBeAttacked(r,col)==false){
                placeQueen(r,col);
                boolean successState = backtrack_queen(col+1);
                if(successState == true) return successState;
                removeQueen(r,col);
            }
        }
        return false;
    }

    public boolean canBeAttacked(int row, int col) {
        if (row >= 0 && col >= 0 && row < rlen && col < clen) {
            //checking queen's attack vertically
            for (int r = 0; r < rlen; r++) {
                if (r != row) {
                    if(chess[r][col] == 1) return true;
                }
            }
            // Checking queen's attack horizontally
            for(int c = 0; c < clen; c++){
                if(c != col){
                    if(chess[row][c] == 1) return true;
                }
            }

            //Checking current position to left top diagonal
            for(int r=row,c=col;r>=0 && c>=0;r--,c--){
                if(r!=row && c!=col){
                    if(chess[r][c] == 1) return true;
                }
            }

            //Checking current position to left bottom diagonal
            for(int r=row,c=col;r<rlen && c>=0;r++,c--){
                if(r!=row && c!=col){
                    if(chess[r][c] == 1) return true;
                }
            }
        }
        return false;
    }

    public void placeQueen(int row, int col){
        if(chess[row][col] != 1){
            chess[row][col] = 1;
        }
    }

    public void removeQueen(int row, int col){
        if(chess[row][col]==1) {
            chess[row][col] = 0;
        }
    }



    public static void main(String[] args) {
        /*int[][] chess = {{0,0,0,0},
                         {0,0,0,0},
                         {0,0,0,0},
                         {0,0,0,0}};*/
       // System.out.println(new NQueens(4,4).nQueens());
        int arrSize = 4;
        int[][] chess = new NQueens(arrSize,arrSize).nQueenArray();
        for(int i=0;i<chess.length;i++){
            for(int j=0;j<chess[0].length;j++){
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
        }
    }
}
