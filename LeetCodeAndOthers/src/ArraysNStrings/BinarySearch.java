package ArraysNStrings;

import java.util.Arrays;

public class BinarySearch {

    public boolean binSearch(int[] nums,int target){
        return binSearch(nums,0,nums.length-1,target, false);
    }
    //1,3,4,7,9,10,100,1200,1500
    private boolean binSearch(int[] nums, int start, int end, int target,boolean found){
        if(nums.length == 0) return false;
        if(nums[start] == target || nums[end] == target) return true;
        int pivot = (start+end)/2;
        if(nums[pivot] == target)
            return true;
        else{
            if(nums[pivot] > target){
                int[] tempNums = Arrays.copyOfRange(nums,start,pivot);
                found = binSearch(tempNums,0,tempNums.length-1,target,found);
            }else{
                int[] tempNums = Arrays.copyOfRange(nums,pivot,end);
                found = binSearch(tempNums,0,tempNums.length-1,target,found);
            }
        }
        return found;
    }
}
