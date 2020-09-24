package DynamicP1;

public class CountStairs {

	public static void main(String[] args) {
		CountStairs cs = new CountStairs();
		System.out.println(cs.countStairs(5));
	}
	
	/**
	 * Without dp array
	 * @param n
	 * @return
	 */
	public int countStairs(int n) {
		int[] dp = new int[n+1];
		
		if(n==0) return 0;
		if(n==1) return 1;
		if(n==2) return 2;
		int one_step_away=1;
		int two_step_away=2;
		int all_steps=0;
		for(int i=3;i<=n;i++) {
			all_steps = one_step_away+two_step_away;
			one_step_away = two_step_away;
			two_step_away = all_steps;
		}
		
		return all_steps;
	}
	
	/**with DP array
	/*public int countStairs(int n) {
		int[] dp = new int[n+1];
		
		if(n==0) return 0;
		if(n==1) return 1;
		if(n==2) return 2;
		dp[0]=0;dp[1]=1;dp[2]=2;
		for(int i=3;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		
		return dp[n];
	}*/
}
