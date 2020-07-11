package StacksANDQueues;

public class StackOfPlates {

	int fullIndex=0;
	int[] fullArray = null;
	int[] sizes = null;
	int sizeOfStack=0;
	int noOfArrays = 0;
	
	public static void main(String[] args) {
		
		StackOfPlates sop = new StackOfPlates();
		sop.createArray(3, 3);
		sop.push(1);
		sop.push(2);
		sop.push(3);
		sop.push(4);
		sop.push(5);
		sop.push(6);
		sop.push(7);
		sop.push(8);
		sop.push(9);
		sop.printArray();
		System.out.println("=============");
		System.out.println(sop.pop());
		System.out.println("=============");
		System.out.println(sop.popAtI(2));
		System.out.println("=============");
		System.out.println(sop.pop());
		System.out.println("=============");
		sop.printArray();
	}
	
	public void createArray(int noOfArrays, int sizeOfStack)
	{
		fullArray = new int[noOfArrays*sizeOfStack];
		sizes = new int[sizeOfStack];
		this.noOfArrays = noOfArrays;
		this.sizeOfStack = sizeOfStack;
	}
	
	public void push(int value)
	{
		
		if(fullArray[fullIndex] == 0)
		{
			fullArray[fullIndex] = value;
			int currentStack  = currentStack();
			sizes[currentStack] = sizes[currentStack]+1;
		}else{
			fullIndex = fullIndex+1;
			fullArray[fullIndex] = value;
			int currentStack  = currentStack();
			sizes[currentStack] = sizes[currentStack]+1;
		}
	}
	
	public int pop(){
		int val = fullArray[fullIndex];
		fullArray[fullIndex] = 0;
		fullIndex = fullIndex - 1;
		return val;
	}
	
	public int popAtI(int stackNum){
		int sizeOfScurrenttack = sizes[stackNum];
		int val = 0;
		if(sizeOfStack > 0)
		{
			int popIndex = sizeOfScurrenttack + (sizeOfStack * (stackNum-1));
			val = fullArray[popIndex];
			fullArray[popIndex] = 0;
			updateSizes(stackNum);
		}
		return val;
	}

	public void updateSizes(int stackNum)
	{
		int arrNumSize = sizes[stackNum];
		
		if(stackNum>-1)
		{
			if(arrNumSize <= sizeOfStack)
			{
				sizes[stackNum] = arrNumSize-1;
			}
		}
	}
	
	public int currentStack()
	{
		int val = 0;
		for (int i = 1; i <= noOfArrays; i++) {
			int maxStackValues = i*sizeOfStack;
			int minStackValues = (i-1)*sizeOfStack;
			if(minStackValues < fullIndex && fullIndex<=maxStackValues)
			{
				return i-1;
			}
		}
		return val;
	}
	
	public void printArray()
	{
		for (int i = 0; i < fullArray.length; i++) {
			System.out.println(fullArray[i]);
		}
	}
	
}
