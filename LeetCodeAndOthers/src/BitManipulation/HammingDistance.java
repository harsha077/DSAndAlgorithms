package BitManipulation;

public class HammingDistance {
	
	public static void main(String[] args) {
		//System.out.println(findHammingDistance(4,3));
		
		int x = 4;
		int y = 1;
		
		System.out.println(x ^ y);
	}
	
	public static int findHammingDistance(int x, int y) {
		return Integer.bitCount(x ^ y);
	}

	/*public static int findHammingDistance(int x, int y) {
		int hamDist = 0;
		
		String xStr = ConvertDecimalToBin.convertDecToBin(x);
		String yStr = ConvertDecimalToBin.convertDecToBin(y);
		int i = xStr.length()-1;
		int j = yStr.length()-1;
		while(i >= 0 || j >= 0) {
			int num1 = 0;
			int num2 = 0;
			
			if(i>=0) {
				num1 = Character.getNumericValue(xStr.charAt(i));
			}
			
			if(j>=0) {
				num2 = Character.getNumericValue(yStr.charAt(j));
			}
			if((num1 | num2) == 1) {
				if(num1 != 1 || num2 != 1) {
					hamDist = hamDist+1;
				}
			}
			
			i--;
			j--;
		}
		return hamDist;
	}*/
}
