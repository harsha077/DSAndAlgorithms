package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class FindKthElementInLinkedList {

	public Node head;
	
	public static void main(String[] args) {

		List<Integer> ll = new ArrayList<Integer>();
		SingleLinkedList sll = new SingleLinkedList();
		FindKthElementInLinkedList fel = new FindKthElementInLinkedList();
		
		ll.add(2);
		ll.add(7);
		ll.add(9);
		ll.add(9);
		ll.add(2);
		
		Node currentNode = sll.createLinkedList(ll);
		Node node = fel.kthelement(7, currentNode);
		
		System.out.println(node.value);
	}
	
	
	public Node kthelement(int k, Node currentNode)
	{
		head = currentNode;
		Node temp = head;
		int i = 1;
		
		if(k==1)
		{
			return temp;
		}
		
		while(temp!=null)
		{
			if(i==k)
			{
				return temp;
			}else{
				temp = temp.next;
				i=i+1;
			}
		}
		
		return null;
	}
	
	public void kthElementFromLast(int k, Node currentNode)
	{
		
	}
}
