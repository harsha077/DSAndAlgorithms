package ArraysNStrings;

import java.util.Arrays;

public class UberATGPhoneScreen {
	
	/*[-5,-6,0,1,10,2,3]
	[-5,-6,1,10,2,3]
	[-5,0,10]
	[-5,10]
	[2,3]
	[0,2,3]
	[-6,0,1,10]
	[-6,1,10]*/
	
	public static void main(String[] args) {
		int[] nums = {-5,3,2,-6,1,0,10};
		int target = 5;
		Arrays.sort(nums);
		helper(nums,target);
	}
	
	
	public static void allSizeSubArraySumEqTarget(int[] nums,int target,int[] currentArr,int currentArrIndex,int start,int arrSzeFrItr) {
		int a=start;
		int[] tempArr = Arrays.copyOf(currentArr, currentArr.length);
		if(arrSzeFrItr<=1) {
			return;
		}
		
		while(a<=nums.length && arrSzeFrItr>1) {
			int b = 0;
			int k = nums.length-1;
			if(arrSzeFrItr>2) {b = a+1;}
			else {b=a;}
			//arrSzeFrItr = arrSzeFrItr-1;
			tempArr[currentArrIndex] = nums[a];
			if(a>0 && nums[a] == nums[a-1]) {
				continue;
			}
			
			 while(b<k){
				 	int i=0;
				 	int currentVal = 0;
				 	String currentValString = new String();
				 	currentValString = "[";
				 	while(i<currentArrIndex && currentArrIndex!=0) {
				 		currentVal += currentArr[i];
				 		currentValString = currentValString+currentArr[i]+",";
				 		i++;
				 	}
				 
	                if(currentVal+nums[b]+nums[k]==target){
	                	currentValString = currentValString+nums[b]+","+nums[k]+"]";
	                	System.out.println(currentValString);
	                    while(b<k&&nums[b]==nums[b+1]) {
	                    	b++;
	                    }
	                    while(b<k&&nums[k]==nums[k-1]) {
	                    	k--;
	                    }
	                    b++;
	                    k--;
	                }else if(currentVal+nums[b]+nums[k]<target){
	                    b++;
	                }else if(currentVal+nums[b]+nums[k]>target){
	                    k--;
	                }
	            }
			
			if(currentArrIndex==0) {
				return;
			}
			a++;
		}
		//allSizeSubArraySumEqTarget(nums,target,tempArr,currentArrIndex+1,b,arrSzeFrItr-1);
	}
	
	public static void helper(int[] nums,int target) {
		int[] tempArr = new int[nums.length];
		allSizeSubArraySumEqTarget(nums, target, tempArr,0, 0, 3);
	}
	
	//-6,-5,0,1,2,3,10
	/**09/17
	 * ***Recursive Iterations are called as RIs
	 * for each arrsize it is a different problem, so each arraysize is sent in to allSizeSubArraySumEqTarget solve the problem of that arraysize only.
	 * arrSzeFrItr is though named as 'arrSze..' it is used count the number of RIs, we control RIs using this variables
	 * currentVal is the incremented main value from past RI.
	 * start is the starting index
	 * 
	 *  09/18
	 *  need to remove values from the temparray after each while loop
	 *  indexing must be looked at
	 */
	/*public static void allSizeSubArraySumEqTarget(int[] nums,int target,int[] currentArr,int currentArrIndex,int start,int arrSzeFrItr) {
		int a=start;
		
		if(arrSzeFrItr<=1) {
			return;
		}
		
		while(a<=nums.length && arrSzeFrItr>1) {
			int b = 0;
			int k = nums.length-1;
			if(arrSzeFrItr>2) {b = a+1;}
			else {b=a;}
			arrSzeFrItr = arrSzeFrItr-1;
			int[] tempArr = Arrays.copyOf(currentArr, currentArr.length);
			tempArr[currentArrIndex] = nums[a];
			allSizeSubArraySumEqTarget(nums,target,tempArr,currentArrIndex+1,b,arrSzeFrItr);
			if(a>0 && nums[a] == nums[a-1]) {
				continue;
			}
			
			 while(b<k){
				 	int i=0;
				 	int currentVal = 0;
				 	String currentValString = new String();
				 	currentValString = "[";
				 	while(i<currentArrIndex && currentArrIndex!=0) {
				 		currentVal += currentArr[i];
				 		currentValString = currentValString+currentArr[i]+",";
				 		i++;
				 	}
				 
	                if(currentVal+nums[b]+nums[k]==target){
	                	currentValString = currentValString+nums[b]+","+nums[k]+"]";
	                	System.out.println(currentValString);
	                    while(b<k&&nums[b]==nums[b+1]) {
	                    	b++;
	                    }
	                    while(b<k&&nums[k]==nums[k-1]) {
	                    	k--;
	                    }
	                    b++;
	                    k--;
	                }else if(currentVal+nums[b]+nums[k]<target){
	                    b++;
	                }else if(currentVal+nums[b]+nums[k]>target){
	                    k--;
	                }
	            }
			
			if(currentArrIndex==0) {
				return;
			}
			a++;
		}
	}*/
	
	
	
	
	
	/*public static void printSeq(int[] nums,int arrSize) {
	    arrSize = arrSize-1;
		int maxIndex = nums.length-1;
		int i=arrSize;
		
		if(arrSize<0) {
			return;
		}
		
		while(i<=maxIndex) {
			System.out.print(nums[i]+" , ");
			i++;
		}
		System.out.println();
		printSeq(nums,arrSize);
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void getSumArrays(int[] nums, int target,int subArrSize) {
		int i = 0;
		int lenSubArr = 0;
		//int k = nums.length-1;
		if(subArrSize < nums.length-1) {
			lenSubArr = subArrSize - 2;
		}else{
			lenSubArr = subArrSize;
		} 
		
		Arrays.sort(nums);
		
		while(i<nums.length-1)
		{
			int k = nums.length-1;
			int subArrAllbtTwoSum = 0;
			int j=i;
			int m =0;
			int l = 0;
			
			while(l<lenSubArr && j<k) {
				subArrAllbtTwoSum += nums[j];
				l++;
				j++;
			}
			
			while(j<k) {
				int subArrSum = subArrAllbtTwoSum+nums[j]+nums[k];
				if(subArrSum==target) {
					int stIndex = i;
					l = 0;
					System.out.print("[");
					while(l<lenSubArr) {
						System.out.print(nums[stIndex]+",");
						stIndex++;
						l++;
					}
					System.out.println(nums[j]+","+nums[k]+"]");
					j++;
					k--;
				}else if(subArrSum>target) {
					k--;
				}else if(subArrSum<target) {
					j++;
				}
			}
			i++;
			
			if(subArrSize==2) {
				break;
			}
		}
	}*/
	
	/*public static void helper(int[] nums, int target) {
		int subArrSize = 2;
		int maxSubArrsize = nums.length;
		
		
		while(subArrSize<=maxSubArrsize) {
			getSumArrays(nums, target, subArrSize);
			subArrSize++;
		}
	}*/
	
	/*public static void getSumArrays(int[] nums, int target,int subArrSize) {
	Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
	
	for(int i=0;i<nums.length;i++) {
		int j = i+1;
		int k = nums.length-1;
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(j<=k) {
			int subJ = j;
			int tempSubArrSize = 0;
			int sum = 0;
			List<Integer> list = new ArrayList<Integer>();
			if(j<=(k-subArrSize))
			{
				sum = nums[i];
				list.add(nums[i]);
				if(subArrSize==2) {
					list.add(nums[j]);
				}
				while(tempSubArrSize<subArrSize-2) {
					list.add(nums[subJ]);
					sum += nums[subJ];
					subJ++;
					tempSubArrSize++;
				}
				int lastVal = target - sum;
				if(set.contains(lastVal)) {
					list.add(lastVal);
					Collections.sort(list);
					if(!map.containsKey(list.hashCode())) {
						map.put(list.hashCode(), list);
					}
				}else {
					for(Integer val:list) {
						set.add(val);
					}
				}
			}
			j++;
		}
	}
	
	System.out.println(map);
}*/
}
