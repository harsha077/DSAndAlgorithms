package Matrix;

public class PrintSurroundings {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		int r=1,c=1;
		int i=r-1,j=c;
		while(i<arr.length) {
			if(i!=r)
				System.out.println(arr[i][j]);
			i=i+1;
		}
		
		i=r;
		j=c-1;
		while(j<arr.length) {
			if(j!=c)
				System.out.println(arr[i][j]);
			j=j+1;
		}
	}
}
