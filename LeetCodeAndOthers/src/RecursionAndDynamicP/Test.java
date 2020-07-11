package RecursionAndDynamicP;

public class Test {
	//public int index = 0;
	public int[] mem = new int[5];
	public static void main(String... args) {
		Test test = new Test();
		System.out.println(test.dp(4));
		
		/*test.percentTest();
		int[] arr = {7,1,2,3,4};
		test.dp(arr,0);*/
	}
	
	public int dp(int x) {
		if(x==0) {
			return 1;
		}
		return (mem[x] = x * dp(x-1));
	}
	
	/*public int dp(int[] arr,int index) {
		int val = 0;
		if(index >= arr.length) {
			return -1;
		}
		val = arr[index];
		index = index+1;
		if(val!=-1) System.out.println(val);
		
		dp(arr,index);
		
		return val;
	}*/
	
	/*public void percentTest() {
		System.out.println(1/2);
	}*/
}
