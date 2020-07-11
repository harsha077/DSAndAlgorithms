package StacksANDQueues;

public class SortedStack {

	StackUsingArray stack1 = new StackUsingArray();
	StackUsingArray stack2 = new StackUsingArray();
	
	public static void main(String[] args) {
		SortedStack sortedStack = new SortedStack();
		
		sortedStack.CreateStacks(4);
		sortedStack.CreateStacks(1);
		sortedStack.CreateStacks(1);
		sortedStack.CreateStacks(7);
		sortedStack.CreateStacks(3);
		sortedStack.CreateStacks(1);
		sortedStack.CreateStacks(2);
		sortedStack.CreateStacks(9);
		
		sortedStack.ReverseStack();
		
		sortedStack.PrintStack();
		
	}
	
	public void CreateStacks(int value)
	{
		if(stack2.peek()<value)
		{
			stack2.push(value);
		}else{
			while(!(stack2.peek()<value))
			{
				stack1.push(stack2.pop());
			}
			
			stack2.push(value);
			
			while(!stack1.empty())
			{
				stack2.push(stack1.pop());
			}
		}
	}
	
	public void ReverseStack()
	{
		while(!stack2.empty())
		{
			stack1.push(stack2.pop());
		}
	}
	
	public void PrintStack(){
		stack1.printArray();
	}

}
