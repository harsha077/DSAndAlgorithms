package Grid;

public class IslandPermiter {

	
	public static void main(String[] args) {
		IslandPermiter ip = new IslandPermiter();
		int[][] matrix = {{0,1,0,0},
						  {1,1,1,0},
						  {0,1,0,0},
						  {1,1,0,0}};
		
		System.out.println(ip.IsLandPerimeter(matrix));
	}
	
	public int IsLandPerimeter(int[][] matrix){
			int maxPerimeter = 0;
			
			for(int row=0;row<matrix.length;row++){
				for(int column=0;column<matrix[1].length;column++){

					if(matrix[row][column]==1){
						int perimeter = getPerimeter(row,column,matrix);
						maxPerimeter += perimeter;
					}
				}
			}
		return maxPerimeter;
	}
	
	public int getPerimeter(int row,int column,int[][] matrix){
		int perimeter = 0;
			
		for(int r=row-1;r<=row+1;r++){
			if(r!=row){
				
				if(r<0 || r > matrix.length-1){
					perimeter += 1;
					continue;
				}
				
				if(matrix[r][column]==0){
					perimeter += 1;
				}
			}
		}
		
		for(int c=column-1;c<=column+1;c++){
			if(c!=column){
				
				if(c<0 || c > matrix[1].length-1){
					perimeter += 1;
					continue;
				}
				
				if(matrix[row][c]==0){
					perimeter += 1;
				}
			}
		}
		
		return perimeter;
	}
	
	

}
