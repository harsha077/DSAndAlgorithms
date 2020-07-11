package StacksANDQueues;

import java.util.ArrayList;
import java.util.List;

public class StackUsingList {

	public Node head;
	
	public static void main(String[] args) {
		StackUsingList sul = new StackUsingList();
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(1);
		list.add(5);
		
		sul.CreateStackLinkedList(list);
		sul.PrintStack();
	}
	
	public Node CreateStackLinkedList(List<Integer> list)
	{
		Node temp=null;
		for (Integer value:list) {
			if(head==null)
			{
				head = new Node(value);
				temp = head;
			}else{
				temp.next = new Node(value);
				temp = temp.next;
			}
		}
		return head;
	}
	
	public void PrintStack()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
}

class Node{
	Node next;
	int value;
	
	public Node(int value)
	{
		this.value = value;
	}
}
