package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PeekingIterator implements Iterator<Integer>{
	private Iterator<Integer> it;
	Integer next;
	boolean hasNext;
	
	public PeekingIterator(Iterator<Integer> iterator) {
		this.it = iterator;
		
		if(it.hasNext()==true) {
			next = it.next();
		}
	}
	
	public Integer peek() {
		return next;
	}
	
	@Override
	public Integer next() {
		Integer ans = next;
		
		
		if(it.hasNext()==true) {
			next = it.next();
		}else {
			next = -1;
		}
		return ans;
	}
	
	@Override
	public boolean hasNext() {
		return it.hasNext();
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(7);
		list.add(9);
		
		Iterator<Integer> itr = list.iterator();
		PeekingIterator pItr = new PeekingIterator(itr);
		System.out.println("peek:"+pItr.peek());
		System.out.println("next:"+pItr.next());
		System.out.println("peek:"+pItr.peek());
		System.out.println("next:"+pItr.next());
		System.out.println("peek:"+pItr.peek());
		System.out.println("next:"+pItr.next());
		System.out.println("next:"+pItr.next());
		
	}
}
