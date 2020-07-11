package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class LinkedListIntersection {

	public static void main(String[] args) {
		List<Integer> ll = new ArrayList<Integer>();
		List<Integer> ll2 = new ArrayList<Integer>();
		SingleLinkedList sll = new SingleLinkedList();
		SingleLinkedList sll2 = new SingleLinkedList();
		LinkedListIntersection sl = new LinkedListIntersection();
		
		ll.add(1);
		ll.add(2);
		ll.add(4);
		ll.add(5);
		ll.add(7);
		
		ll2.add(0);
		ll2.add(9);
		
		TwoNodes twoNodes = sll.createIntersectedLinkedList(ll, ll2);
		
		Node result = sl.findIntersection(twoNodes.head, twoNodes.head1);
		System.out.println(result.value);
		
	}
	
	public Node findIntersection(Node currentHead1, Node currentHead2)
	{
		LinkedListIntersection lli = new LinkedListIntersection();
		
		int listLength1=0;
		int listLength2=0;
		
		Node shorter=null;
		Node longer=null;
		
		Result tailNode1 = lli.tailAndLength(currentHead1);
		Result tailNode2 = lli.tailAndLength(currentHead2);
		
		if(tailNode1.tail != tailNode2.tail)
		{
			return null;
		}
		
		listLength1 = tailNode1.length; 
		listLength2 = tailNode2.length;
		
		if(listLength1!=listLength2)
		{
			shorter = (listLength1<listLength2)?currentHead1:currentHead2;
			longer = (listLength2<listLength1)?currentHead1:currentHead2;
			
			//remove unncessary nodes
			int k = (listLength1<listLength2)?listLength2-listLength1: listLength1-listLength2;
			
			longer = lli.removeUnnNodes(k, longer);
		}else
		{
			shorter = currentHead1;
			longer = currentHead2;
		}
		
		while(shorter!=longer)
		{
			shorter = shorter.next;
			longer = longer.next;
		}
		return longer;
	}
	
	public Result tailAndLength(Node currentNode)
	{
		
		Node tailNode = null;
		int length=0;
		while(currentNode!=null)
		{
			length=length+1;
			if(null==currentNode.next){
				tailNode = currentNode;
			}
			currentNode = currentNode.next;
		}
		return new Result(tailNode, length);
	}
	
	public Node removeUnnNodes(int k, Node currentNode)
	{
		while(k>0)
		{
			currentNode = currentNode.next;
		}
		return currentNode;
	}
	
}

class Result{
	Node tail;
	int length;
	
	public Result(Node tail, int length)
	{
		this.tail = tail;
		this.length = length;
	}
}