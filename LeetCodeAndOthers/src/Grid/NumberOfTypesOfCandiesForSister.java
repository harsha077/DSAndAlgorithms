package Grid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfTypesOfCandiesForSister {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int distributeCandies(int[] candies) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        int count = 0;
        
        List<Integer> list = new ArrayList<Integer>();
        //System.out.println(candies.length/2);
        for(int i=0;i<candies.length;i++)
        {
            if(!map.containsKey(candies[i])){
                if(map.keySet().size() < candies.length/2){
                    map.put(candies[i],1);
                    count += 1;
                }else{
                    list.add(candies[i]);
                }
            }else{
                list.add(candies[i]);
            }
        }
        
    return count;
    }

}
