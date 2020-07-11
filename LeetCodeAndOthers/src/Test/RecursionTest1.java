package Test;

public class RecursionTest1 {

	public static void main(String ...args) {
		String str = "ABCDE";
		getStringDepth(str,str.length());
	}
	
	public static void getStringDepth(String str,int depth) {
		
		if(depth<=0) {
			return;
		}
		
		String str2 = str.substring(0, depth);
		System.out.println(str2+" : "+str2.length());
		getStringDepth(str2,str2.length()-1);
	}
}
