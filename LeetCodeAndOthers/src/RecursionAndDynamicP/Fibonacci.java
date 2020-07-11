package RecursionAndDynamicP;

public class Fibonacci {

	
	int[] memo = new int[5];
	
	public static void main(String... args) {
		Fibonacci fib = new Fibonacci();
		System.out.println(fib.fib(4));
		
	}
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public int fib(int n) {
		int result = 0;
		if(memo[n]!='\0') {
			return memo[n];
		}
		if(n==1 || n==2) {
			result = 1;
		}else {
			result = fib(n-1)+fib(n-2);
		}
		memo[n] = result;
		return result;
	}
}
