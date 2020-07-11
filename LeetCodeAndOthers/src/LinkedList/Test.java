package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(5);
	list.add(7);
	list.add(9);
	
	System.out.println(list.get(0));
	System.out.println(list.remove(0));
	System.out.println(list.get(0));
}
}
