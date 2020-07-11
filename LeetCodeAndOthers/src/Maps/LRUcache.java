package Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUcache extends LinkedHashMap<Integer,Integer>{
	int capacity;
	public LRUcache(int capacity) {
		super(capacity,0.75F,true);
		this.capacity=capacity;
	}
	
	public int get(int value) {
		return super.getOrDefault(value, -1);
	}
	
	public void put(int key, int value) {
		super.put(key, value);
	}
	
	protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest) {
        return size()>capacity;
    }
	
	public static void main(String ...args) {
		LRUcache lru = new LRUcache(2);
		
		lru.put(7, 7);
		lru.put(2, 2);
		System.out.println(lru.get(2));
		System.out.println(lru.get(7));
		lru.put(3, 3);
		System.out.println(lru.get(2));
	}
}
