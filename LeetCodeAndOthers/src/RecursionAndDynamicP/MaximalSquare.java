package RecursionAndDynamicP;

public class MaximalSquare {

	public static void main(String[] args) {
		char[][] matrix = {{'1','1','1','1','0'},
						   {'1','1','1','1','1'},
						   {'1','1','1','1','1'},
						   {'1','0','0','1','0'}};
		System.out.println(new MaximalSquare().maximalSquare(matrix));
	}
	
	public int maximalSquare(char[][] matrix) {
		int result=0;
		int r=matrix.length,c=matrix[0].length;
		int[][] dp = new int[r+1][c+1];
		
		for(int i=1;i<=r;i++) {
			for(int j=1;j<=c;j++) {
				if(matrix[i-1][j-1]=='1') {
					dp[i][j] = Math.min(Math.min(dp[i][j-1],dp[i-1][j]), dp[i-1][j-1])+1;
					result = Math.max(dp[i][j], result);
				}
			}
		}
		return result*result;
	}
}
