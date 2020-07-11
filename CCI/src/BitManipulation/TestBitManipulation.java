package BitManipulation;

public class TestBitManipulation {

	public static void main(String[] args) {
		
	}
	
	
	public static void substraction() {
		NextNumber nn = new NextNumber();
		int p=4;
		
		System.out.println("p="+p+"; no of 1s in p = "+nn.count1s(p));
		int a = 1 << p;
		System.out.println("a="+a+"; no of 1s in a = "+nn.count1s(a));
		int b = a - 1;
		System.out.println("b="+b+"; no of 1s in b = "+nn.count1s(b));
	}
}
