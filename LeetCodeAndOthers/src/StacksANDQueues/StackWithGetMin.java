package StacksANDQueues;

public class StackWithGetMin {

	public stacknode head;
	public int min;
	
	public static void main(String[] args) {
		StackWithGetMin sg = new StackWithGetMin();
		
		sg.push(1);
		sg.pop();
		sg.push(7);
		sg.push(44);
		sg.push(9);
		sg.push(9);
		sg.push(1);
		sg.pop();
		
		
		
		System.out.println(sg.getmin());
	}
	
	public void push(int x)
	{
		
		if(head==null)
		{
			head = new stacknode(x,x);
			min = x;
		}else{
			if(x<min)
			{
				min = x;
			}
			stacknode temp = head;
			head = new stacknode(x,min);
			head.next = temp;
		}
	}
	
	public int pop()
	{
		stacknode temp = head;
		int currentVal=0;
		if(head!=null)
		{
			if(head.next!=null)
			{
				currentVal = head.value;
				head.value = temp.next.value;
				head.minValue = temp.next.minValue;
				temp.next = temp.next.next;
				min = head.minValue;
			}else{
				head = temp.next;
				min = -1;
			}
		}
		
		return currentVal;
	}
	
	public int getmin()
	{
		if(min>-1)
		{
			return min;
		}
		return -1;
	}

}

class stacknode{
	int value;
	int minValue;
	stacknode next;
	
	public stacknode()
	{
	}
	
	public stacknode(int value, int minvalue)
	{
		this.value = value;
		this.minValue = minvalue;
	}
	
	
}