package Algorithms.DivideAndConquer;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = {5,7,9};
        int nums_cursor = 0;
        int[] temp = new int[nums.length];
        int temp_cursor = 0;
        System.out.println("temp_cursor"+temp_cursor);
        System.out.println("nums_cursor"+nums_cursor);
        temp[temp_cursor++] = nums[nums_cursor++];
        System.out.println("temp_cursor"+temp_cursor);
        System.out.println("nums_cursor"+nums_cursor);
        for (Integer i:temp){
            System.out.println(i);
        }
        Arrays.copyOfRange(nums,0,1);


    }
}
