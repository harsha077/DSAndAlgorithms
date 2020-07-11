package StacksANDQueues;

public class StackUsingArray {

	public int arrIndex = -1;
	public int[] arr = new int[10];
	
	public void push(int x)
	{
		arrIndex = arrIndex+1;
		arr[arrIndex] = x;
	}
	
	public int pop()
	{
		int val = 0;
		if(arrIndex>=0)
		{
			val = arr[arrIndex];
			arr[arrIndex] = 0;
			arrIndex = arrIndex - 1;
			return val;
		}else{
			System.out.println("stack is empty");
		}
		return val;
	}
	
	public int peek()
	{
		int val = 0;
		if(arrIndex>=0)
		{
			val = arr[arrIndex];
			return val;
		}else{
			System.out.println("stack is empty");
		}
		return val;
	}
	
	public boolean empty(){
		if(arrIndex>=0 && arr[arrIndex] != 0)
		{
			return false;
		}else
		{
			return true;
		}
	}
	
	public void printArray()
	{
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}	
	}
	
	public static void main(String[] args) {

		StackUsingArray stack = new StackUsingArray();
		
		stack.push(1);
		stack.push(2);
		stack.push(7);
		stack.push(9);
		
		System.out.println(stack.pop());
		stack.printArray();
	}

}
