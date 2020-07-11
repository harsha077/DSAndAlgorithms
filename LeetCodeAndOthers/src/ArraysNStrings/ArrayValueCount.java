package ArraysNStrings;

import java.util.BitSet;
import java.util.*;

public class ArrayValueCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] firstArr = {1,4,2,3,4};
		int[] secondArr = {1,3};
		int[] resultArr = countValues(firstArr, secondArr);
		printArr(resultArr);
	}
	
	public static int[] countValues(int[] firstArray, int[] secondArray)
	{
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
		//printArr(firstArray);
		int[] resultArray = new int[secondArray.length];
		int resultArrIndex=secondArray.length;
		
		for(int j=secondArray.length-1;j>=0;j--)
		{
			int secVal = secondArray[j];
			for(int i=firstArray.length-1;i>=0;i--)
			{
				int firVal = firstArray[i];
				if(secVal>=firVal)
				{
					resultArray[resultArrIndex-1] = i+1;
					break;
				}
			}
			resultArrIndex = resultArrIndex-1;
		}
		return resultArray;
	}
	
	public static void printArr(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	

}
