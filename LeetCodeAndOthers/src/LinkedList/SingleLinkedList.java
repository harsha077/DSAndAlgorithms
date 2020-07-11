package LinkedList;

import java.util.List;

public class SingleLinkedList {

	public Node head;
	public Node head1;
	
	public Node createLinkedList(List<Integer> list)
	{
		Node temp=null;
		for(Integer value: list)
		{
			if(head==null)
			{
				head = new Node(value);
				temp = head;
				continue;
			}
			temp.next = new Node(value);
			temp=temp.next;
		}
		return head;
	}
	
	public TwoNodes createIntersectedLinkedList(List<Integer> list1, List<Integer> list2)
	{
		Node intersectingNode=null;
		Node temp=null,temp1=null;
		
		for(Integer value: list1)
		{
			if(head==null)
			{
				head = new Node(value);
				temp = head;
			}else{
				temp.next = new Node(value);
				temp = temp.next;
				if(value==4)
				{
					intersectingNode = temp;
				}
			}
		}
		
		for(Integer value: list2)
		{
			if(head1==null)
			{
				head1 = new Node(value);
				temp1 = head1;
			}else{
				temp1.next = new Node(value);
				temp1 = temp1.next;
			}
		}
		
		temp1.next = intersectingNode;
		
		return new TwoNodes(head,head1);
	}
	
	/**
	 * Create a Linked list to have a circular linked list
	 * @param list
	 * @return
	 */
	public Node createCircularLinkedList(List<Integer> list)
	{
		Node circleNode=null, temp=null;;
		for(Integer value: list)
		{
			if(head==null)
			{
				head = new Node(value);
				temp = head;
				if(value==1)
				{
					circleNode = temp;
				}
			}else{
				temp.next = new Node(value);
				temp = temp.next;
				if(value==4)
				{
					circleNode = temp;
				}
				
			}
		}
		
		temp = head;
		while(temp!=null)
		{
			if(temp.next==null)
			{
				temp.next = circleNode;
				break;
			}
			temp = temp.next;
		}
		
		return head;
	}
	
	public Node removeNode(int position)
	{
		if(head == null)
		{
			return head;
		}
		
		Node temp = head;
		
		//Remove the head if position is 0
		if(position == 0)
		{
			head = temp.next;
			return head;
		}
		
		//find the node which is less than current position.
		for(int i=0;temp!=null && i<position-1;i++)
		{
			temp = temp.next;
		}
		
		//find the node after the position
		Node nodeAfterCurrent = temp.next.next;
		
		//replace current node with its next node
		temp.next = nodeAfterCurrent;
		
		return head;
	}
	
	public Node removeNode(Node currentNode)
	{
		Node temp = head;
		if(head == null || currentNode == null)
		{
			return head;
		}
		
		if(currentNode == head)
		{
			head = temp.next;
			return head;
		}
		
		if(currentNode.next == null)
		{
			currentNode = null;
			return head;
		}
		
		currentNode.value = currentNode.next.value;
		currentNode.next = currentNode.next.next;
		
		return head;
	}
	
	public void printNodes()
	{
		while(head != null)
		{
			System.out.println(head.value);
			head = head.next;
		}
	}
	
	public void printNodes(Node node)
	{
		while(node != null)
		{
			System.out.println(node.value);
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		
		SingleLinkedList sll = new SingleLinkedList();
		
		sll.stupidfuckingjava(sll);
	}
	
	public void stupidfuckingjava(SingleLinkedList sll)
	{
		head = new Node(2);
		Node nodeA = new Node(7);
		Node nodeB = new Node(9);
		
		sll.removeNode(nodeB);
		
		sll.printNodes();
	}
}

class TwoNodes{
	Node head;
	Node head1;
	
	public TwoNodes(Node head, Node head1)
	{
		this.head = head;
		this.head1 = head1;
	}
}


class Node
{
	Node next;
	int value;
	boolean visited;
	
	public Node()
	{
	}
	
	public Node(int value)
	{
		this.value = value;
	}
	
	public Node(int value, boolean visited)
	{
		this.value = value;
		this.visited = visited;
	}
	
	public Node(Node node, int value, boolean visited)
	{
		this.next = node;
		this.value = value;
		this.visited = visited;
	}
}

