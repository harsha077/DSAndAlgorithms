package BitManipulation;

public class NextNumber {
	
	public static void main(String[] args) {
		System.out.println(nextNummber(7));
	}

	public static int nextNummber(int n) {
		int small=n;
		int big=n;
		int result = 0;
		int numOf1 = count1s(n);
		
		while(result != numOf1 && (small > 0 || big < Integer.MAX_VALUE)) {
			int smallRes = 0;
			if(small > 0)
			{
				small = small-1;
				smallRes = count1s(small);
			}
			big = big+1;
			int bigRes = count1s(big);
			
			if (smallRes == numOf1) result = numOf1;
			if (bigRes == numOf1) result = numOf1;
		}
		
		return result;
	}
	
	public static int count1s(int val) {
		
		int count = 0;
		while(val > 0) {
			if((val & 1) == 1)
			{
				count++;	
			}
			val >>>= 1;
		}
		return count;
	}
	
}
