package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    List<List<Integer>> output = new ArrayList();
    int n,k;
    //Leetcode solution
    /*public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> output = new ArrayList();
        output.add(new ArrayList<Integer>());

        for(int num: nums){
            List<List<Integer>> newSubsets = new ArrayList();
            for(List<Integer> curr: output){
                newSubsets.add(new ArrayList<Integer>(curr){{add(num);}});
            }
            for(List<Integer> curr: newSubsets){
                output.add(curr);
            }
        }
        return output;
    }*/

    //Leetcode solution using backtracking
    //Runtime n * 2^n
    public void backtrack(int first, ArrayList<Integer> curr, int[] nums){
        if(curr.size() == k){
            output.add(new ArrayList(curr));
        }

        for(int i=first;i<n;i++){
            curr.add(nums[i]);
            backtrack(i+1,curr,nums);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums){
        n = nums.length;
        for(k=0;k<n+1;k++){
            backtrack(0,new ArrayList<Integer>(),nums);
        }
        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(new Subsets().subsets(nums));
    }
}
