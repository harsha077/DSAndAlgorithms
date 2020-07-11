package BitManipulation;

public class PairSwap {
	
	public static void main(String[] args) {
		int number = 52;
		number = ConvertBinary.BinStringToInteger("1010111001");
		System.out.println("number:"+Integer.toBinaryString(number));
		number = pairSwap(number);
		System.out.println("number:"+Integer.toBinaryString(number));
	}
	
	public static int pairSwap(int n) {
		return ((n & 0xaaaaaaaa) >>> 1 |( n & 0x55555555) << 1);
	}
	
	/**
	 * My Solution
	 * @param n
	 */
	public static void pairSwap1(int n) {
		int countBits = countBits(n);
		int evenBitMask = createMaskToGetEvenBits(countBits);
		//System.out.println("evenBitMask:"+Integer.toBinaryString(evenBitMask));
		int oddBitMask = createMaskToGetOddBits(countBits);
		//System.out.println("oddBitMask:"+Integer.toBinaryString(oddBitMask));
		int evenBits = n & evenBitMask;
		//System.out.println("evenBits:"+Integer.toBinaryString(evenBits));
		int oddBits = n & oddBitMask;
		//System.out.println("oddBits:"+Integer.toBinaryString(oddBits));
		evenBits = evenBits >> 1;
		//System.out.println("evenBits>>1:"+Integer.toBinaryString(evenBits));
		oddBits = oddBits << 1;
		//System.out.println("oddBits<<1:"+Integer.toBinaryString(oddBits));
		int result = oddBits | evenBits;
		System.out.println("result:"+Integer.toBinaryString(result));
	}
	
	/**
	 * My Solution
	 * @param n
	 */
	public static int countBits(int n) {
		int count = 0;
		while(n != 0) {
			n = n >>> 1;
			count++;
		}
		return count;
	}
	
	/**
	 * My Solution
	 * @param n
	 */
	public static int createMaskToGetEvenBits(int n) {
		int evenMask = 0;
		for(int i=0;i<n;i++) {
			if(i%2==1) {
				int maskVal = (int)Math.pow(2, i);
				//System.out.println(maskVal);
				evenMask = evenMask | maskVal;
				//System.out.println(Integer.toBinaryString(evenMask));	
			}
		}
		return evenMask;
	}
	
	/**
	 * My Solution
	 * @param n
	 */
	public static int createMaskToGetOddBits(int n) {
		int oddMask = 0;
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				int maskVal = (int)Math.pow(2, i);
				//System.out.println(maskVal);
				oddMask = oddMask | maskVal;
				//System.out.println(Integer.toBinaryString(oddMask));	
			}
		}
		return oddMask;
	}
}
