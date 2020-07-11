package ArraysNStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class FourSum {

	public static void main(String...args) {
		int[] nums = {1, 0, -1, 0, -2, 2};
		int target = 0;
		fourSum(nums,target);
	}
	
	public static void fourSum(int[] nums, int target) {
		
		Map<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
		
		Arrays.sort(nums);
	    int a = 0;
		
	    while(a<nums.length-1) {
	    	int i=a+1;
	        while(i<nums.length-1){
	            int j=i+1;
	            int k=nums.length-1;
	            
	            if(i>0 && nums[i] == nums[i-1]){
	                continue;
	            }
	            
	            int firstVal = nums[i];
	            while(j<k){
	            	
	                if(firstVal+nums[j]+nums[k]==0){
	                	System.out.println(nums[a]+" "+nums[i]+" "+nums[j]+" "+nums[k]);
	                    while(j<k&&nums[j]==nums[j+1]) {
	                    	j++;
	                    }
	                    while(j<k&&nums[k]==nums[k-1]) {
	                    	k--;
	                    }
	                    j++;
	                    k--;
	                }else if(firstVal+nums[j]+nums[k]<0){
	                    j++;
	                }else if(firstVal+nums[j]+nums[k]>0){
	                    k--;
	                }
	            }
	            i++;
	        }
	        a++;
	    }
	}
}
