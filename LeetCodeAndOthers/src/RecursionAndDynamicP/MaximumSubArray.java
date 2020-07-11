package RecursionAndDynamicP;

import java.util.Arrays;

public class MaximumSubArray {
    Integer[] subSolutions = null;
    int[] nums = null;
    /*public int maxSubArray(int[] nums) {
        int maxSum =Integer.MIN_VALUE,left=0,right=0,max=Integer.MIN_VALUE,sum=0;
        int i=0,j=nums.length-1,maxIndex=0;boolean leftBool = true;
        while(i<nums.length) {
            right += nums[i];
            if (right > max) {
                maxIndex = i;
                max = right;
                leftBool = true;
            }
            i++;
        }
        while(j>-1)
        {
            left += nums[j];
            if(left>max) {
                maxIndex = j;
                max = left;
                leftBool = false;
            }
            j--;
        }

        if(leftBool){
            while(maxIndex>=0) {
                sum += nums[maxIndex];
                maxSum = Math.max(maxSum, sum);
                maxIndex--;
            }
        }else{
            while(maxIndex<=nums.length-1){
                sum += nums[maxIndex];
                maxSum = Math.max(maxSum,sum);
                maxIndex++;
            }
        }
        return maxSum;
    }*/

    /*Top Bottom approach UDEMY - O(n)*/
    public int maxSubArray(int[] nums){
        this.nums = nums;
        subSolutions = new Integer[nums.length];
        Arrays.fill(subSolutions,null);

        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max, maxSubArryEndAtI(i));
        }
        return max;
    }

    public int maxSubArryEndAtI(int i){
        if(subSolutions[i] != null) return subSolutions[i];
        if(i==0) return nums[0];
        int max = Math.max(nums[i],maxSubArryEndAtI(i-1)+nums[i]);
        subSolutions[i] = max;
        return max;
    }

    /* Bottom up approach, MY SOLUTION - O(n)*/
    /*public int maxSubArray(int[] nums){
        int maxSum = Integer.MIN_VALUE,sum = 0;
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        for(int i=0;i<nums.length;i++){
            if(maxSum == Integer.MIN_VALUE) maxSum = nums[i];
            sum = nums[i] + ((i>0)?nums[i-1]:0);
            if(sum > nums[i]){
                nums[i] = sum;
                maxSum = Math.max(maxSum,sum);
            }
            maxSum = Math.max(maxSum,nums[i]);
        }
        return maxSum;
    }*/

    public static void main(String[] args) {
        //int[] nums = {-1,0,-2};
        //int[] nums = {2,-1,3,-4,2};
        int[] nums = {-2,1,-3,5,-1,2,1,-5,4};
        //int[] nums = {-1,-2};
        //int[] nums={0,3,-1};
        System.out.println(new MaximumSubArray().maxSubArray(nums));
    }
}
