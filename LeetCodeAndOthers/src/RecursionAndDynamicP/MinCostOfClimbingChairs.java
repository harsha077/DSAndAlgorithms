package RecursionAndDynamicP;

import java.util.Arrays;

public class MinCostOfClimbingChairs {

	public static void main(String ...args) {
		int[] arr = {0,1,2,2};
		//int[] arr = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		//int[] arr = {0,1,2,0};
		//int[] arr = {0,0,0,1};
		//int[] arr = {0,0,1,1};
		//int[] arr = {1,1,0,0};
		//int[] arr = {1,0,2,4};
		//int[] arr = {1,0,2,3};
		//int[] arr = {10,15,20};
		//int[] arr = {0,1,0};
		//int[] arr = {1,0,1};
		//int[] arr = {1,0,0};
		//int[] arr = {0,0,1};
		MinCostOfClimbingChairs m = new MinCostOfClimbingChairs();
		System.out.println(m.minCostClimbingStairs(arr));
	}
	
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] tab = new int[len];
        Arrays.fill(tab, 0);
        int totalCost = 0;
        int startI = 0;
        
        
        if(len == 0){
            return 0;
        }
        if(len == 1){
            totalCost = cost[0];
        }
        
        if(len > 4)
        {
            if(cost[0]<=cost[1]){
                startI = 0;
            }else{
                startI = 1; 
            }
            int j = startI;
            tab[j] = cost[j];
            while(j<len){
               if((j+2)>len-1) {
            	   return tab[j];
               }
               int i = j;
               
               if(tab[i]+cost[i+1]<tab[i]+cost[i+2])
               {
            	   tab[i+1] = tab[i]+cost[i+1];
            	   j=i+1;
               }else {
            	   tab[i+2] = tab[i]+cost[i+2];
            	   j=i+2;
               }
            }
        }else if(len == 4){
        	int totalValue = 0;
        	if(cost[0]<=cost[1]){
                startI = 0;
            }else{
                startI = 1; 
            }
        	
        	int i = startI;
            tab[i] = cost[i];
            
            while(i<len) {
            	
            	if(i == len-1)
            	{
            		if(cost[len-2]<totalValue) {
            			int val = (len == 4)?cost[len-2]+tab[i]:cost[len-2];
            			return val;
            		}else {
            			return tab[i];
            		}
            	}
            	
            	if(i == len-2) {
            		if(cost[len-2]<totalValue) {
            			int val = (len == 4)?cost[len-2]+tab[i]:cost[len-2];
            			return val;
            		}else {
            			return tab[i];
            		}
            	}
            	
	        	if(tab[i]+cost[i+1]<tab[i]+cost[i+2])
	            {
	         	   tab[i+1] = tab[i]+cost[i+1];
	         	   totalValue = tab[i+1];
	         	   i=i+1;
	            }else {
	               tab[i+2] = tab[i]+cost[i+2];
	               totalValue = tab[i+2];
	               i=i+2;
	            }
	        	
	        	totalCost = totalValue;
            }
        }
        return totalCost;
    }
	
}
