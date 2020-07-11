package LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LinkedListTest {

	public static void main(String[] args) {
		
		Set<Node> set = new HashSet<Node>();
		
		List<Integer> ll = new ArrayList<Integer>();
		SingleLinkedList sll = new SingleLinkedList();
		PalindromeList sl = new PalindromeList();
		
		ll.add(7);
		ll.add(1);
		ll.add(1);
		ll.add(7);
		
		Node currenthead = sll.createLinkedList(ll);
		
		Map<Integer, Node> map = new HashMap<Integer, Node>();
		
		while(currenthead!=null)
		{
			map.put(currenthead.value, currenthead);
		}
	}
	
	

}
