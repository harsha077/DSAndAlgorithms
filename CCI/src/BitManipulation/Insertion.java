package BitManipulation;

public class Insertion {

	public static void main(String[] args) {
		int x = 1011;
		int y = 4;
		System.out.println(ConvertDecimalToBin.convertDecToBin(x));
		System.out.println(ConvertDecimalToBin.convertDecToBin(y));
		System.out.println("==============================");
		int num = insertAnotherValue(x,y,6,8);
		System.out.println(ConvertDecimalToBin.convertDecToBin(num));
	}
	
	public static int insertAnotherValue(int x, int y, int start, int end) {
		ConvertDecimalToBin cdtb = new ConvertDecimalToBin();
		int start2 = 0;
		while(start <= end) {
			int bit1 = getithbit(x,start);
			int bit2 = getithbit(y,start2);
			if(bit1 != bit2) {
				x = updateithBit(x, start,bit2);
				System.out.println(cdtb.convertDecToBin(x));
			}
			System.out.println(cdtb.convertDecToBin(x));
			start++;
			start2++;
		}
		return x;
	}
	
	public static int getithbit(int num, int i) {
		return ((num & (1 << i)) != 0?1:0);
	}
	
	public static int setithbit(int num, int i) {
		return (num | (1 << i));
	}
	
	public static int updateithBit(int num, int i, int bitis1) {
		//int value = bitis1 ? 1 : 0;
		int value = bitis1;
		int mask = ~(1 << i);
		return (num & mask) | (value << i);
	}
}
