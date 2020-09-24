package DynamicP1;
class PaintFill{
	
	//My Solution, RunTime O(1)
	/*public static int[][] paintFill(int[][] imageArr, int A, int B,int color){
		int row = imageArr.length-1;
		int col = imageArr[0].length-1;
		
		int finalA = A+1;
		int finalB = B+1;
		int a=A-1;

		while (a<=finalA) {
			int b=B-1;
			while (b<=finalB) {
				//System.out.println(a +","+b);
				if(a >= 0 && a <= row && b >= 0 && b <= col){	
					imageArr[a][b] = color;
					//System.out.print(color);
				}
				b++;
			}
			a++;
		}

		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(imageArr[i][j]);
			}
			System.out.println();
		}
		return imageArr;

	}*/


	//CCI Solution
	/*public static int[][] paintFill(int[][] imageArr, int r, int c,int color){

		if(r < 0 || r > imageArr.length-1 || c < 0 || c > imageArr[0].length-1){
			return imageArr;
		}

		imageArr[r][c] = color;

		paintFill(imageArr,r-1,c,color);
		paintFill(imageArr,r+1,c,color);
		paintFill(imageArr,r,c-1,color);
		paintFill(imageArr,r,c+1,color);

		return imageArr;
	}
*/
	public static void main(String... args){
		int[][] imageArr = new int[5][5];
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				imageArr[i][j] = 1;
			}
		}

		int a = 2; 
		int b = 2;
		int color = 7;

		//imageArr = paintFill(imageArr,a,b,color);
		
		/*for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(imageArr[i][j]);
			}
			System.out.println();
		}*/
		
	}

}