package ArraysNStrings;

import java.util.Arrays;
import java.util.HashSet;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {-5,3,2,-6,1,0,10};
		int target = 5;
		twoSum(nums,target);
	}
	
	public static void twoSum2(int[] nums, int target) {
		Arrays.sort(nums);
		int i = 0;
		int k = nums.length;
		while(i<=k) {
			int sum = nums[i]+nums[k];
			if(sum==target) {
				System.out.println("["+nums[i]+","+nums[k]+"]");
				i++;
				k--;
			}else if(sum<target) {
				k--;
			}else if(sum>target){
				i++;
			}
		}
	}
	
	public static void twoSum(int[] nums, int target) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<nums.length;i++) {
			int diff = target - nums[i];
			if(set.contains(diff)) {
				System.out.println("{"+nums[i]+","+diff+"}");
			}else {
				set.add(nums[i]);
			}
		}
	}
}
