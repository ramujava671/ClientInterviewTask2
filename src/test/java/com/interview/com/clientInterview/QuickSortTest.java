package com.interview.com.clientInterview;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.interview.com.clientInterview.model.QuickSort;

public class QuickSortTest {

	@Test
	public void testQuickSort() {
		int [] input=new int[]{9,8,7,6,5,4,3,2,1};
		int right=input.length-1;
		QuickSort sort = new QuickSort();
		int[] sortedArray = sort.QuickSort(input,0,right);

		assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9", Arrays.toString(sortedArray));
	}

	
}
