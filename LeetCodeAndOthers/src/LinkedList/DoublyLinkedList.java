package LinkedList;

import java.util.List;

public class DoublyLinkedList {

	public DoublyNode head;
	
	/*public DoublyNode createdDoublyLinkedList(List<Integer> list)
	{
	}*/
	
}

class DoublyNode{
	
	int value;
	DoublyNode next;
	DoublyNode prev;
	
	public DoublyNode(int value)
	{
		this.value = value;
	}
}
