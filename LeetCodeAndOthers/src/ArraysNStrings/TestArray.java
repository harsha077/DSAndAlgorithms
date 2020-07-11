package ArraysNStrings;

import java.util.Arrays;

public class TestArray {
    public static void main(String[] args) {
        //int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        //int[] nums = {2,-1,3,-4,2};
       int[] nums = {-1,0,-20,-400,-17};
       System.out.println(new TestArray().maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
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
    }
}
