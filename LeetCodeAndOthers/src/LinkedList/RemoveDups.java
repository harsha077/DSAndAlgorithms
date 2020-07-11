package LinkedList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDups {

	public Node head;
	
	public static void main(String[] args) {

		List<Integer> ll = new ArrayList<Integer>();
		SingleLinkedList sll = new SingleLinkedList();
		RemoveDups rd = new RemoveDups();
		
		ll.add(2);
		ll.add(7);
		ll.add(9);
		ll.add(9);
		ll.add(2);
		
		
		Node currenthead = sll.createLinkedList(ll);
		
		rd.removeDups(currenthead,sll);
		
	}
	
	public void removeDups(Node currenthead1, SingleLinkedList sll)
	{
		head = currenthead1;
		Node currenthead = currenthead1;
		Set<Integer> set = new HashSet<Integer>();
		Node previous = null;
		while(currenthead!=null)
		{
			if(set.contains(currenthead.value))
			{
				//currenthead = sll.removeNode(currenthead);
				previous.next = currenthead.next;
			}
			else
			{
				set.add(currenthead.value);
				previous = currenthead;
			}
			currenthead = currenthead.next;
		}
		
		sll.printNodes(head);
	}
}
