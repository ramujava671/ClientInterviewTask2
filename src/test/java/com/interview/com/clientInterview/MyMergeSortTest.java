package com.interview.com.clientInterview;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.interview.com.clientInterview.model.MyMergeSort;

public class MyMergeSortTest {
    
	@Test
	public void  mergeSort()
	{
		int [] input=new int[]{9,8,7,6,5,4,3,2,1};
	int right=input.length-1;
	MyMergeSort sort = new MyMergeSort();
	int[] sortedArray = MyMergeSort.sort(input, 0, right);
	
   assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9", Arrays.toString(sortedArray));

		
	}
}
