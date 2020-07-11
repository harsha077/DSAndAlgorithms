package StacksANDQueues;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {

	public Node head;
	//Cat == 1
	//Dog == 3
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		AnimalShelter as = new AnimalShelter();
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(3);
		list.add(3);
		list.add(1);
		
		as.Createhead(list);
		as.PrintStack();
		System.out.println(as.dequeueLatest());
		as.PrintStack();
		System.out.println(as.dequeueLatest());
		as.PrintStack();
		System.out.println(as.dequeueDog());
		as.PrintStack();
	}
	
	public Node Createhead(List list)
	{
		StackUsingList sul = new StackUsingList();
		head = sul.CreateStackLinkedList(list);
		return head;
	}

	public int dequeueLatest(){
		if(head == null)
		{
			return 0;
		}
		
		int animal = head.value;
		head.value = head.next.value;
		head.next = head.next.next;
		return animal;
	}
	
	public int dequeueCat()
	{
		Node temp=null;
		int returnVal=0;
		if(head==null)
		{
			return 0;
		}
		
		if(head.value==1)
		{
			return dequeueLatest();
		}else{
			temp=head;
			while(temp!=null)
			{
				if(temp.value==1)
				{
					returnVal = temp.value;
					temp.value = temp.next.value;
					temp.next = temp.next.next;
					break;
				}
				temp=temp.next;
			}
		}
		return returnVal;
	}
	
	public int dequeueDog()
	{
		Node temp=null;
		int returnVal=0;
		if(head==null)
		{
			return 0;
		}
		
		if(head.value==3)
		{
			return dequeueLatest();
		}else{
			temp=head;
			while(temp!=null)
			{
				if(temp.value==3)
				{
					returnVal = temp.value;
					temp.value = temp.next.value;
					temp.next = temp.next.next;
					break;
				}
				temp=temp.next;
			}
		}
		return returnVal;
	}
	
	public void RemoveNode(Node removeNode)
	{
		
	}
	
	public void PrintStack()
	{
		System.out.println("======================");
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println("======================");
	}
}
