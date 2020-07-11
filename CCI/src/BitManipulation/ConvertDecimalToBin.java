package BitManipulation;

public class ConvertDecimalToBin {
	
	public static void main(String[] args) {
		int decimal = 12;
		String binStr = new String();
		while(decimal > 0) {
			int bin = decimal%2;
			decimal = decimal/2;
			binStr = bin + binStr;
		}
		System.out.println(binStr);
	}
	
	public static String convertDecToBin(int decimal) {
		String binStr = new String();
		while(decimal>0) {
			int bin = decimal%2;
			decimal = decimal/2;
			binStr = bin + binStr;
		}
		return binStr;
	}
}
