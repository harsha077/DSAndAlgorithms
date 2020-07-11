package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class SumLists {
	
	public Node head;
	
	public static void main(String[] args) {

		List<Integer> ll = new ArrayList<Integer>();
		List<Integer> ll2 = new ArrayList<Integer>();
		SingleLinkedList sll = new SingleLinkedList();
		SingleLinkedList sll2 = new SingleLinkedList();
		SumLists sl = new SumLists();
		
		ll.add(7);
		ll.add(1);
		ll.add(6);

		ll2.add(5);
		ll2.add(9);
		ll2.add(2);
		
		
		Node currenthead = sll.createLinkedList(ll);
		Node currenthead2 = sll2.createLinkedList(ll2);
		Integer val1 = sl.sumLists(currenthead,sll);
		Integer val2 = sl.sumLists(currenthead2,sll);
		
		sl.makeList(val1+val2, sll);
	}
	
	public Integer sumLists(Node currentNode1, SingleLinkedList sll)
	{
		head = currentNode1;
		Node temp = currentNode1;
		int dec = 1;
		int result=0;
		while(temp!=null)
		{
			int tempVal = temp.value;
			int currentVal = tempVal*dec;
			dec=dec*10;
			result=result+currentVal;
			temp=temp.next;
		}
		return result;
	}
	
	public void makeList(Integer result, SingleLinkedList sll)
	{
		Integer currentVal=0;
		Node resultHead = null;
		Node temp=null;
		
		while(result>0)
		{
			currentVal = result%10;
			result = result/10;
			if(resultHead==null)
			{
				resultHead = new Node(currentVal);
				temp = resultHead;
			}else
			{
				temp.next = new Node(currentVal);
				temp = temp.next;
			}
		}
		
		sll.printNodes(resultHead);
	}
}
