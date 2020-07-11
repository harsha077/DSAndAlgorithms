package LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReverseALinkedList {

	public static void main(String...args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(20);
		list.add(2);
		list.add(7);
		list.add(9);
		
		SingleLinkedList sll = new SingleLinkedList();
		Node node = sll.createLinkedList(list);
		
		Node temp=node;
		while(temp!=null) {
			System.out.println(temp.value);
			temp=temp.next;
		}
		System.out.println("====================");
		Node head = reverse(node);
		while(head!=null) {
			System.out.println(head.value);
			head=head.next;
		}
		
		
	}
	
	public static Node reverse(Node node) {
		Node prev=null;
		Node current=node;
		Node next=null;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		node=prev;
		return node;
	}
}
