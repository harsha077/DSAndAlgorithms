package ArraysNStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MergeIntervals {

	public static void main(String ...args) {
		merge();
	}
	
	public static void merge() {
		
	   int[][] intervals = new int[4][2];  
	   int[][] resultArr = new int[2][2];
	   int[] arr1 = {1,7};
       int[] arr2 = {5,11};
       
       intervals[0] = arr1;
       intervals[1] = arr2;
      resultArr = Arrays.copyOf(intervals, 2);
       for (int i = 0; i < resultArr.length; i++) {
    	   int p = intervals[i][0];
    	   int k = intervals[i][1];
    	   System.out.println(p+","+k);
    	   /*if(p!=0&&k!=0) {
    		   System.out.println(p+","+k);
    	   }*/
       }
       
       /*for (int i = 0; i < intervals.length; i++) {
    	 System.out.println(intervals[i]);
       }*/
	}
}
