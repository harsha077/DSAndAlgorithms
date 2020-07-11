package StacksANDQueues;

public class MyQueueWithStacks {

	StackUsingArray stack1 = new StackUsingArray();
	StackUsingArray stack2 = new StackUsingArray();
	
	public static void main(String[] args) {
		
		MyQueueWithStacks stack = new MyQueueWithStacks();
		
		stack.Enqueue(2);
		stack.Enqueue(4);
		stack.Enqueue(7);
		stack.Enqueue(9);
		stack.printQueue();
		System.out.println(stack.Front());
		System.out.println(stack.Rear());
		/*System.out.println(stack.Dequeue());
		System.out.println(stack.Dequeue());
		stack.printQueue();
		stack.Enqueue(11);
		stack.printQueue();
		System.out.println(stack.Dequeue());
		stack.printQueue();*/
	}
	
	public void Enqueue(int value)
	{
		if(!stack2.empty())
		{
			while(!stack2.empty())
			{
				stack1.push(stack2.pop());
			}
		}
		stack1.push(value);
	}
	
	public int Dequeue()
	{
		int value;
		if(!stack2.empty())
		{
			value = stack2.pop();	
		}else{
			while(!stack1.empty())
			{
				int popVal = stack1.pop();
				stack2.push(popVal);
			}
			value = stack2.pop();
		}
		return value;
	}
	
	public int Front()
	{
		int value;
		
		if(!stack2.empty())
		{
			value = stack2.peek();
		}else{
			while(!stack1.empty())
			{
				int popValue = stack1.pop();
				stack2.push(popValue);
			}
			value = stack2.peek();
		}
		return value;
	}
	
	public int Rear()
	{
		int value;
		
		if(!stack1.empty())
		{
			value = stack1.peek();
		}else{
			while(!stack2.empty())
			{
				int popValue = stack2.pop();
				stack1.push(popValue);
			}
			value = stack1.peek();
		}
		return value;
	}
	
	public void printQueue()
	{
		System.out.println("===================");
		if(!stack1.empty())
		{
			int[] array = stack1.arr;
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
		
		if(!stack2.empty())
		{
			int[] array = stack2.arr;
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
		System.out.println("===================");
	}
}
