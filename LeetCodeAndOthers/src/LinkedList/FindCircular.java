package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class FindCircular {
	
	Node head;
	
	public static void main(String[] args) {
		
		List<Integer> ll = new ArrayList<Integer>();
		SingleLinkedList sll = new SingleLinkedList();
		
		FindCircular fc = new FindCircular();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		
		Node currentNode = sll.createCircularLinkedList(ll);
		Node resultNode = fc.findCircularBug(currentNode);
		
		System.out.println(resultNode.value);
	}
	
	public Node findCircularBug(Node currentHead)
	{
		head = currentHead;

		boolean isCircular = isCircularLinkedList(currentHead);
		if(isCircular)
		{
			while(currentHead!=null)
			{
				if(currentHead.visited == true)
				{
					return currentHead;
				}else{
					currentHead.visited = true;
					currentHead = currentHead.next;
				}
			}
		}
		
		return null;
	}
	
	public boolean isCircularLinkedList(Node currentHead)
	{
		Node slowPointer = currentHead;
		Node fastPointer = currentHead;
		
		while(slowPointer.next!=null && fastPointer.next.next!=null)
		{
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if(slowPointer == fastPointer)
			{
				return true;
			}
		}
		return false;
	}

}
