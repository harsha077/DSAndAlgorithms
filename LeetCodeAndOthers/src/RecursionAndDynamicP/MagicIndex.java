package RecursionAndDynamicP;

import java.util.Arrays;

public class MagicIndex {

    //-4,-2,0,3,7,10,11,17,20,2100
    //-2,1,2
    /*public boolean magicIndex(int i, int j, int[] nums,boolean found){
        if(i==j) {
            if(nums[i]==i) {
                return true;
            }else{
                return false;
            }
        }
        if(nums[i] == i || nums[j] == j)  return true;
        else if(nums[i] > i) return false;
        else {
            int pivot = (i+j)/2;
            boolean foundTemp =  magicIndex(i,pivot,nums,found);
            if(i==pivot) return foundTemp;
            if(foundTemp = true) {
                found = foundTemp;
                return found;
            }
            foundTemp = magicIndex(pivot,j,nums,found);
            return found;
        }
    }*/

    public int magicIndex(int[] nums){
        //return magicIndex(nums,0,nums.length-1,false);
        return magicIndex(nums,0,nums.length-1,-99999);
    }

    /*Using Arrays.copyofrange*/
   /* public boolean magicIndex(int[] nums, int start, int end,boolean found){
            if(nums.length == 0) return false;
            if(nums[start] == start || nums[end] == end) return true;
            if(nums.length > 0){
                if(nums[start] > start) return false;
            }
            int pivot = (start+end)/2;
            if(nums[pivot]==pivot) return true;
            int[] tempNums = null;
            if(pivot > nums[pivot]){
                tempNums = Arrays.copyOfRange(nums,pivot,end);
            }else{
                tempNums = Arrays.copyOfRange(nums,start,pivot);
            }
            found = magicIndex(tempNums,0,tempNums.length-1,found);
        return found;
    }*/

    //-4,-2,0,3,7,10,11,17,20,2100
    /*Array with out using copy of*/
    public int magicIndex(int[] nums, int start, int end,int found){
        if(nums.length == 0 || nums[start] > start || (start == end && nums[start]!=start)) return -1;
        if(nums[start] == start) return start;
        if(nums[end] == end) return end;

        int pivot = (start+end)/2;
        if(nums[pivot] == pivot) return pivot;
        if(start+1 == end) return -1;

        if(pivot > nums[pivot]){
            found = magicIndex(nums,pivot,end,found);
        }else{
            found = magicIndex(nums,start,pivot,found);
        }
        return found;
    }

    public static void main(String[] args) {
        //int[] nums = {1,3,4,7,9,10,100,1200,1500};
        //int[] nums = {-4,-2,0,4,5,10,11,17,20,97};
        //int[] nums = {-4,-2,0,3,7,9};
        //int[] nums = {-4,-3,-2,-1,0,1,6,20,97};
        int[] nums = {-4,-3,4,4,4,5,4,20,97};
        System.out.println(new MagicIndex().magicIndex(nums));
    }

}
