package Test;

public class Test {
	
	public static void main(String[] args) {
		char c = getChar(97);
		char c1 = getChar(122);
		System.out.println(c+" "+c1);
	}
	
	public static char getChar(int val) {
		char c = (char) val;
		return c;
	}

	/*public static boolean[][] visited = null;
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		visited = new boolean[arr.length][arr[0].length];
		
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
	
	public static void solution(int[][] arr) {
		
	}

	public static void fizzbuzz() {
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%5!=0) {
				System.out.println("fizz");
			}else if(i%3!=0 && i%5==0) {
				System.out.println("buzz");
			}else if(i%3==0 && i%5==0) {
				System.out.println("fizzbuzz");
			}else {
				System.out.println(i);
			}
		}
	}*/
}
