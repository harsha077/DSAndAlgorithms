package BitManipulation;

public class ConvertBinary {
	
	public static void main(String[] args) {
		String str = "1010111001";
		System.out.println(BinStringToInteger(str));
	}
	
	public static int BinStringToInteger(String binString) {
		Integer result = 0;
		int len = binString.length();
		int k = 0;
		for(int i=len-1;i>=0;i--) {
			int twoPowK = (int)Math.pow(2, k);
			if(binString.charAt(i) == '1') {
				result += twoPowK;
			}
			k++;
		}
		return result;
	}
	
	
	/*public static String doubleToString(double value) {
		//Double result = value*100;
		String resultStr = new String();
		value = value*100;
		int intVal = (int)value;
		while(intVal > 0) {
			int b = intVal%2;
			intVal = intVal/2;
			resultStr = b + resultStr;
		}
		resultStr = "0."+resultStr;
		return resultStr;
	}*/
}
