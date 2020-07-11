package LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PalindromeList {

	Node head;
	
	public static void main(String[] args) {
		
		List<Integer> ll = new ArrayList<Integer>();
		SingleLinkedList sll = new SingleLinkedList();
		PalindromeList sl = new PalindromeList();
		
		ll.add(7);
		ll.add(1);
		ll.add(1);
		ll.add(7);

		
		Node currenthead = sll.createLinkedList(ll);
		
		boolean bool = sl.isPalindrome(currenthead);
		if(bool){
			System.out.println("palindrome link list");
		}else
		{
			System.out.println("not palindrom link list");
		}
	}
	
	public boolean isPalindrome(Node currentHead)
	{
		Stack stack = new Stack();
		head = currentHead;
		Node temp = head;
		Node temp2 = head;
		int i=0;
		
		int listLength = 0;
		int halfCount;
		
		while(temp!=null)
		{
			listLength = listLength+1;
			
			temp = temp.next;
		}
		
		halfCount = listLength/2;
		
		if(listLength%2==0)
		{
			while(temp2!=null)
			{
				if(i<halfCount)
				{
					stack.push(temp2.value);
					i=i+1;
				}else{
					if(!stack.empty()){
						Object val = stack.pop();
						if(!val.equals(temp2.value))
						{
							return false; 
						}
					}
				}
				temp2 = temp2.next;
			}
		}else{
			halfCount = halfCount+1;
			while(temp2!=null)
			{
				if(i+1==halfCount)
				{
					temp2=temp2.next;
					i=i+1;
					continue;
				}
				if(i<halfCount){
					stack.push(temp2.value);
					i=i+1;
				}else{
					if(!stack.empty()){
						Object val = stack.pop();
						if(!val.equals(temp2.value))
						{
							return false; 
						}
					}
				}
				temp2=temp2.next;
			}
		}
		
		return true;
	}
	
	

}
