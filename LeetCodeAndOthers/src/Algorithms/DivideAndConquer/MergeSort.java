package Algorithms.DivideAndConquer;

import java.util.Arrays;

public class MergeSort {

    public int [] merge_sort(int [] input) {
        if (input.length <= 1) {
            return input;
        }
        int pivot = input.length / 2;
        int [] left_list = merge_sort(Arrays.copyOfRange(input, 0, pivot));
        int [] right_list = merge_sort(Arrays.copyOfRange(input, pivot, input.length));
        return merge(left_list, right_list);
    }

    public int [] merge(int [] left_list, int [] right_list) {
        int [] ret = new int[left_list.length + right_list.length];
        int left_cursor = 0, right_cursor = 0, ret_cursor = 0;

        while (left_cursor < left_list.length &&
                right_cursor < right_list.length) {
            if (left_list[left_cursor] < right_list[right_cursor]) {
                ret[ret_cursor++] = left_list[left_cursor++];
            } else {
                ret[ret_cursor++] = right_list[right_cursor++];
            }
        }
        // append what is remain the above lists
        while (left_cursor < left_list.length) {
            ret[ret_cursor++] = left_list[left_cursor++];
        }
        while (right_cursor < right_list.length) {
            ret[ret_cursor++] = right_list[right_cursor++];
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,5,-1,2,1,-5,4};
        nums = new MergeSort().merge_sort(nums);

        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
    }
}