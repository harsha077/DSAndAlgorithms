package Examples;

public class BinHexCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinHexCompare bhc = new BinHexCompare();
		/*int a = bhc.digitToValue('1');
		System.out.println(a);*/
		
		System.out.println(bhc.CompareBinToHex("1010","A"));
	}
	
	boolean CompareBinToHex(String binary, String hex){
		int n1 = convertFromBase(binary,2);
		int n2 = convertFromBase(hex,16);
		
		if(n1<0 || n2<0){
			return false;
		}
		return n1==n2;
	}
	
	int convertFromBase(String number, int base){
		if(base<2|| (base>10 && base!=16)) return -1;
		
		int value=0;
		for(int i=number.length()-1;i>=0;i--){
			int digit = digitToValue(number.charAt(i));
			if(digit<0 || digit>=base){
				return -1;
			}
			
			int exp = number.length();
			value += digit * Math.pow(base,exp);
		}
		return value;
	}
	
	int digitToValue(char c){
		return ((int)c);
	}

}
